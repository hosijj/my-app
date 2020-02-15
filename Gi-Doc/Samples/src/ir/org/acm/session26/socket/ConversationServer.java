package ir.org.acm.session26.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConversationServer {

    public static void main(String[] args) {

        try {

            StringBuffer text = new StringBuffer();
            ServerSocket listener = new ServerSocket(1234);
            System.out.println("SimpleServer:");

            Socket socket = listener.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in   = new ObjectInputStream(socket.getInputStream());

            for (int i=0; i<5; i++) {
                text.append("S");
                out.writeObject(text);
                out.flush();
                text = (StringBuffer) in.readObject();
                System.out.println(text);
            }

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
