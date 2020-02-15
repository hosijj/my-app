package ir.org.acm.session24.io;

import java.io.*;

public class CopyPerformance1 {

    public static void main(String[] args) throws Exception {

        String source = "acm.pdf";
        String destination = "acm_copy.pdf";
        
        long before = System.currentTimeMillis();

        System.out.println( "Copy Started..." );

        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);

        int c = 0;
        while ( (c = in.read() ) != -1)
            out.write(c);
        
        in.close();
        out.close();
        
        long after = System.currentTimeMillis();
        
        System.out.println("Time: " + (after-before) ); 
        
    }
    
}
