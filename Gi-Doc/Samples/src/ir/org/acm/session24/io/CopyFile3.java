package ir.org.acm.session24.io;

import java.io.*;

public class CopyFile3 {

    public static void main(String[] args) throws Exception {

        CopyFile3 obj = new CopyFile3();

        try {

            obj.copyFile("acm.pdf", "acm_copy.pdf");

        } catch(IOException e) {
            System.out.println("Copy Failed!");
        }

    }

    void copyFile(String source, String destination) throws IOException {

        try(InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination);
           ) {
            int c = 0;
            while ((c = in.read()) != -1)
                out.write(c);
        }

    }

}
