package ir.org.acm.session26.socket;

import java.io.*;
import java.net.Socket;

public class ConversationClient {

    public static void main(String[] args) throws Exception  {

        try {

            Socket socket = new Socket("127.0.0.1", 1234);
            System.out.println("SimpleClient:");

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in   = new ObjectInputStream(socket.getInputStream());

            for (int i=0; i<5; i++) {
                StringBuffer text = (StringBuffer) in.readObject();
                System.out.println(text);
                text.append("C");
                out.writeObject(text);
                out.flush();
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
