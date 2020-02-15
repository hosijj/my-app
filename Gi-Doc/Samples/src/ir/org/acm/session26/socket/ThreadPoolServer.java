package ir.org.acm.session26.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolServer {

    private static int clientCounter = 0; 
    
    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        
        try {
            ServerSocket listener = new ServerSocket(1234);
            System.out.println("SimpleServer is waiting for requests...");
            while (true) {
                Socket incoming = listener.accept();
                executor.submit( new ClientHandler(incoming) );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class ClientHandler implements Runnable {

        private Socket incoming;

        ClientHandler(Socket incoming) {
            this.incoming = incoming;
        }

        public void run() {

            clientCounter++;
            try {
                System.out.println("Socket Started for:" + incoming.getInetAddress());
                System.out.println("Number of live clients:" + clientCounter );
                OutputStream os = incoming.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                out.println("Start of communication...");
                try { Thread.sleep(5*1000); } catch (InterruptedException e) { e.printStackTrace(); }
                out.println("End of communication...");
                os.close();
                incoming.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            clientCounter--;

        }
    }
    
}
