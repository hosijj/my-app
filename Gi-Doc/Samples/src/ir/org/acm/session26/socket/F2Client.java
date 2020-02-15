package ir.org.acm.session26.socket;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;

public class F2Client {

    public static void main(String[] args) {

        try (
            Socket s = new Socket("127.0.0.1", 1234);
            InputStream is = s.getInputStream();
        ) {

            Files.copy(is, new File("acm_download2.pdf").toPath() );

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
