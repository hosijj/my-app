package ir.org.acm.session24.io.nio;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class ShowFile2 {
    
     public static void main(String[] args) throws Exception {

        Path path = Paths.get("Samples.iml");

        SeekableByteChannel s = Files.newByteChannel(path);

        ByteBuffer buf = ByteBuffer.allocate(50);

        int bytesRead = s.read(buf);

        while (bytesRead != -1) {

            System.out.println("[Read " + bytesRead + " Bytes]");
            
            buf.flip(); 

            while ( buf.hasRemaining() ) {
                byte b = buf.get(); 
                System.out.print( (char)b ); 
            }

            buf.clear(); 
            
            bytesRead = s.read(buf);
            
        }

    }


}
