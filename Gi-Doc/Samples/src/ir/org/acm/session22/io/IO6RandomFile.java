package ir.org.acm.session22.io;

import java.io.*;

public class IO6RandomFile {

    public static void main(String[] args) {

        try {

            File f = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            raf.writeBytes("Begin");

            raf.seek(20);
            raf.writeBytes("End");
            raf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
