package ir.org.acm.session24.io;

import java.io.*;

public class CopyFile1 {

    public static void main(String[] args) throws Exception {

        System.out.println( "User Dir: " + System.getProperty("user.dir") );

        InputStream in = new FileInputStream("acm.pdf");
        OutputStream out = new FileOutputStream("acm_copy.pdf");

        int c = 0;
        while ( (c = in.read()) != -1 )
            out.write(c);
        
        in.close();
        out.close();
        
    }
    
}
