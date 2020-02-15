package ir.org.acm.session24.io;

import java.io.*;
import java.nio.channels.FileChannel;

public class CopyPerformance5 {

    public static void main(String[] args) throws Exception {

        String source = "acm.pdf";
        String destination = "acm_copy.pdf";
        
        long before = System.currentTimeMillis();
        
        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(destination);

        FileChannel f  = in.getChannel();
        FileChannel f2 = out.getChannel();

        /*
        This method is potentially much more efficient than a simple loop
        that reads from this channel and writes to the target channel.  Many
        operating systems can transfer bytes directly from the filesystem cache
        to the target channel without actually copying them. 
        */
        f.transferTo(0, f.size(), f2);

        f2.close();
        f.close();
        
        long after = System.currentTimeMillis();
        
        System.out.println("Duration:" + (after-before) );

    }
}
