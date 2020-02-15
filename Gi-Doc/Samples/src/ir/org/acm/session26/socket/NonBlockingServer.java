package ir.org.acm.session26.socket;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;

public class NonBlockingServer { // Echo SimpleServer

    private static ServerSocketChannel serverSocketChannel;
    private static final int PORT = 1236;
    private static Selector selector;

    public static void main(String[] args) {

        ServerSocket serverSocket;
        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocket = serverSocketChannel.socket();
            InetSocketAddress netAddress = new InetSocketAddress(PORT);
            serverSocket.bind(netAddress);
            selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            System.exit(1);
        }
        processConnections();
    }

    private static void processConnections() {
        do {
            try {
                int numKeys = selector.select();
                if (numKeys > 0) {
                    Set eventKeys = selector.selectedKeys();
                    Iterator keyCycler = eventKeys.iterator();
                    while (keyCycler.hasNext()) {
                        SelectionKey key = (SelectionKey) keyCycler.next();
                        int keyOps = key.readyOps();
                        if ((keyOps & SelectionKey.OP_ACCEPT)== SelectionKey.OP_ACCEPT) {
                            acceptConnection(key);
                            continue;
                        }
                        if ((keyOps & SelectionKey.OP_READ)== SelectionKey.OP_READ) {
                            acceptData(key);
                        }
                    }
                }
            } catch (IOException ioEx) {
                ioEx.printStackTrace();
                System.exit(1);
            }
        } while (true);
    }

    private static void acceptConnection(SelectionKey key) throws IOException {
        
        SocketChannel socketChannel;
        Socket socket;
        socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socket = socketChannel.socket();
        System.out.println("Connection on " + socket + ".");
        socketChannel.register(selector, SelectionKey.OP_READ);
        selector.selectedKeys().remove(key);
        
    }

    private static void acceptData(SelectionKey key) throws IOException {
        
        SocketChannel socketChannel;
        Socket socket;
        ByteBuffer buffer = ByteBuffer.allocate(50);
        socketChannel = (SocketChannel) key.channel();
        buffer.clear();
        int numBytes = socketChannel.read(buffer);
        System.out.println(numBytes + " bytes read.");
        socket = socketChannel.socket();
        if (numBytes == -1) 
        {
            key.cancel();
            System.out.println("\nClosing socket " + socket + "…");
            closeSocket(socket);
        } else {
            try {
                buffer.flip();
                while (buffer.remaining() > 0) {
                    socketChannel.write(buffer);
//                    Channels.newChannel( System.out ).write(buffer);
//                    System.out.println();
                }
            } catch (IOException ioEx) {
                System.out.println("\nClosing socket " + socket + "…");
                closeSocket(socket);
            }
        }
        selector.selectedKeys().remove(key);
    }

    private static void closeSocket(Socket socket) {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException ioEx) {
            System.out.println("*** Unable to close socket! ***");
        }
    }
    
}
