package ir.org.acm.session26.socket;

import java.net.*;
import java.net.Socket;
import java.io.*;

public class FileServer {

    public static void main(String[] args) {

      byte[] block = new byte[32];
      int len;
      try {
            ServerSocket listener = new ServerSocket(1234);
            System.out.println("File SimpleServer is ready...");
            Socket socket = listener.accept();
            InputStream in = new FileInputStream("acm.pdf");
            OutputStream os = socket.getOutputStream();
            while( (len = in.read(block)) != -1)
                os.write(block,0,len);
            os.close();
            socket.close();
            in.close();
       } catch (Exception e) {
            e.printStackTrace();
       }
       System.out.println("File SimpleServer is now down.");

    }
}


