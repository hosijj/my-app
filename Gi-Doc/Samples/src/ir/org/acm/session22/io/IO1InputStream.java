package ir.org.acm.session22.io;

import java.io.*;
import java.net.URL;

public class IO1InputStream {
    
    public static void main(String[] args) throws Exception {
        
        IO1InputStream c = new IO1InputStream();

        //c.readBytes( new FileInputStream("Samples.iml") ); // File

        //c.readBytes( new URL("file:///C:/Java/0-current%20courses/119-se-1shanbe-4shanbe/Samples/Samples.iml").openStream() );

        //c.readBytes( new URL("http://127.0.0.1:8080/").openStream() ); // Network

        c.readBytes( System.in ); // KeyBoard
        
    }
    
    void readBytes(InputStream in) throws IOException {
        
        int d;
        while (  (d = in.read() ) != -1) {
            System.out.printf("%c",d);
        }
        
    }
    
}
