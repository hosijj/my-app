package ir.org.acm.session24.io;

import java.io.*;

public class CopyFile2 {

    public static void main(String[] args) throws Exception {

        CopyFile2 obj = new CopyFile2();

        try {

            obj.copyFile("acm.pdf", "acm_copy.pdf");

        } catch(IOException e) {
            System.out.println("Copy Failed!");
        }

    }

    void copyFile(String source, String destination) throws IOException {

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(destination);

            int c = 0;
            while ((c = in.read()) != -1)
                out.write(c);

        } finally {
            in.close();
            out.close();
        }

    }

}
