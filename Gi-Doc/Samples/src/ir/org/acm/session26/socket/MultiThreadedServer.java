package ir.org.acm.session26.socket;

import java.net.*;
import java.io.*;

public class MultiThreadedServer {

    private static int clientCounter = 0; 
    
    public static void main(String[] args) {

        try {
            ServerSocket listener = new ServerSocket(1234);
            System.out.println("SimpleServer is waiting for requests...");
            while (true) {
                Socket incoming = listener.accept();
                new ClientHandler(incoming).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static class ClientHandler extends Thread {

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
                try { Thread.sleep(15*1000); } catch (InterruptedException e) { e.printStackTrace(); }
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


