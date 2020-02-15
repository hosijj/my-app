package ir.org.acm.session26.socket;

import java.net.*;
import java.io.*;

public class SimpleServer {

    public static void main(String[] args) {

        try {
            ServerSocket listener = new ServerSocket(1234);
            System.out.println("SimpleServer is waiting for request...");
            Socket socket = listener.accept(); // wait for accept request
            socket.shutdownInput();
            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);
            out.println("Hi!");
            os.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


