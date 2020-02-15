package ir.org.acm.session24.io;

import java.io.*;

public class CopyPerformance2 {

    public static void main(String[] args) throws Exception {

        byte[] block = new byte[8*1024]; //8k
        
        String source = "acm.pdf";
        String destination = "acm_copy.pdf";
        
        long before = System.currentTimeMillis();
        
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);

        int len = 0;
        while ( (len = in.read(block) ) != -1)
            out.write(block,0,len);
       
        in.close();
        out.close();
        
        long after = System.currentTimeMillis();
        
        System.out.println("Duration:" + (after-before) );

    }
}
