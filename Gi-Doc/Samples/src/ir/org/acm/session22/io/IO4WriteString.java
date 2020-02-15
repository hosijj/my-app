package ir.org.acm.session22.io;

import java.io.*;

public class IO4WriteString {

    public static void main(String[] args) throws Exception {

        String str = "Hello World!";

        // OutputStream Family
        //--------------------------------------------------------
        FileOutputStream out = new FileOutputStream("test1.txt");
        out.write( str.getBytes() );

        DataOutputStream dos = new DataOutputStream(out);
        dos.writeChars( str );

        PrintStream ps = new PrintStream(out);
        ps.print(str);
        //----------------------------------------------------------

        // Writer Family
        // ---------------------------------------------------------
        FileWriter fw = new FileWriter("test2.txt");
        fw.write( str );

        PrintWriter pw2 = new PrintWriter(fw);
        pw2.print(str);

//        PrintWriter pw = new PrintWriter(out);
//        pw.print(str);

        // ---------------------------------------------------------


    }

}
