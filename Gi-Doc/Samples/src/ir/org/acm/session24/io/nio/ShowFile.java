package ir.org.acm.session24.io.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ShowFile {

    public static void main(String[] args) throws Exception {

        FileInputStream aFile = new FileInputStream("Samples.iml");

        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(100);

        int bytesRead = inChannel.read(buf);

        while (bytesRead != -1) {

            System.out.println("[Read " + bytesRead + " Bytes]");
            
            buf.flip(); /* Flips this buffer.  The limit is set to the current
            position and then the position is set to zero. If the mark is
            defined then it is discarded. */

            while ( buf.hasRemaining() ) {
                byte b = buf.get(); // Reads the byte at this buffer's current
                //position, and then increments the position.
                System.out.print( (char)b ); 
            }

            buf.clear(); /* Clears this buffer.  The position is set to zero,
            the limit is set to the capacity, and the mark is discarded. */
            
            bytesRead = inChannel.read(buf);
            
        }
        
        aFile.close();

    }

}
