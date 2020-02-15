package ir.org.acm.session22.io;

import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class IO2TextVsBin {
    
    public static void main(String[] args) throws Exception{
        
        int number = 120; 
        
        OutputStream bin = new FileOutputStream("binvstxt.file");
        PrintStream txt  = new PrintStream( bin ); // OutputStream plus text methods

        txt.println( number );  // as text/character '1' + '2' + '0'
        bin.write  ( number );  // as binary/byte: [01111000] can be viewed as 'x'

        txt.close();

        // File Content in Decimal: [49] [50] [48] [13] [10] [120]
        // Equivalant Character   :  '1'  '2'  '0' '\r' '\n'  'x'

        // new line -> Windows    : [13] [10]
        // new line -> Linux      : [10]
        // new line -> Old Mac OS : [13]

        // Returns the system-dependent line separator string.
        // String newLine = System.lineSeparator();

    }

    /*
         java.lang.Object
           java.io.OutputStream
            java.io.FilterOutputStream
              java.io.PrintStream
     */

    
}
