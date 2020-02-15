package ir.org.acm.session24.io;

import java.io.*;

public class CopyPerformance4 {

    public static void main(String[] args) throws Exception {

        String source = "acm.pdf";
        String destination = "acm_copy.pdf";
        
        long before = System.currentTimeMillis();
        
        InputStream in = new BufferedInputStream(new FileInputStream(source), 128*1024); // 128K
        OutputStream out = new BufferedOutputStream(new FileOutputStream(destination), 128*1024); // 128K

        int c = 0;
        while ( (c = in.read()) != -1)
            out.write(c);
       
        in.close();
        out.close();
        
        long after = System.currentTimeMillis();
        
        System.out.println("Duration:" + (after-before) );

    }
}
