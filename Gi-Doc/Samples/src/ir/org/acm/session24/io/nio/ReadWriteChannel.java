package ir.org.acm.session24.io.nio;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWriteChannel {
    
    public static void main(String[] args) throws Exception {

        File f = new File("alphabet.txt"); // add "ABC" to file --> "BCD"
        
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        
        FileChannel c = r.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(20);
        
        int bytesRead = c.read(buf);

        while (bytesRead != -1) {
            
            buf.flip();
            while ( buf.hasRemaining() ) {
                byte b = buf.get(); 
                b++;
                buf.position( buf.position()-1 );
                buf.put(b);
            }
            buf.flip();

            c.position(0); // equals to r.seek(0);

            c.write(buf);
            
            buf.clear(); 
            bytesRead = c.read(buf);
            
        }
        
        c.close();

    }

}
