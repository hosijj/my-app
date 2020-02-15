package ir.org.acm.session24.io.nio;

import java.nio.ByteBuffer;

public class BufferDemo {

    public static void main(String[] args) throws Exception {

        ByteBuffer buf = ByteBuffer.allocate(20);
        
        buf.limit(10);
       
        System.out.println( "---------------------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 0
        System.out.println( "Remaining: " + buf.remaining()); // 10

        buf.putChar('A');
        
        buf.mark(); // Sets this buffer's mark at its position.
        
        buf.putChar('B');

        System.out.println( "--------after put-------------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 4
        System.out.println( "Remaining: " + buf.remaining()); // 6
        
        buf.reset(); // Resets this buffer's position to the previously-marked position.
        
        System.out.println( "--------after reset------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); //20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 2
        System.out.println( "Remaining: " + buf.remaining()); // 8

        System.out.println( buf.getChar() );
        
        System.out.println( "---------after getChar-------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 4
        System.out.println( "Remaining: " + buf.remaining()); // 6
        
        buf.rewind(); // Rewinds this buffer.  The position is set to zero and the mark is discarded.(-1)

        System.out.println( "--------after rewind------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 0
        System.out.println( "Remaining: " + buf.remaining()); // 10
        
        System.out.println( buf.getChar() );
        
        System.out.println( "--------after getChar------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 10
        System.out.println( "Position: "  + buf.position()); // 2
        System.out.println( "Remaining: " + buf.remaining()); // 8
        
        buf.clear(); // The position is set to zero, the limit is set to the capacity,
                     // and the mark is discarded.(-1)
        
        System.out.println( "--------after clear------------" );
        System.out.println( "Capacity: "  + buf.capacity() ); // 20
        System.out.println( "Limit: "     + buf.limit() ); // 20
        System.out.println( "Position: "  + buf.position()); // 0
        System.out.println( "Remaining: " + buf.remaining()); // 20
        
        buf.flip(); // The limit is set to the current position and then
                   // the position is set to zero. If the mark is defined then it is discarded.

    }

}

