package ir.org.acm.session26.socket;

import java.net.*;
import java.io.*;
import java.nio.file.*;

public class F2Server {

    public static void main(String[] args)  {

        try (
            ServerSocket s = new ServerSocket(1234);
            Socket socket = s.accept();
            OutputStream os = socket.getOutputStream();
        ) {

            Files.copy( new File("acm.pdf").toPath(), os);

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}


