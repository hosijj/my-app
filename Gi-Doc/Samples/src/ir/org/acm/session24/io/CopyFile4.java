package ir.org.acm.session24.io;

import java.io.*;

public class CopyFile4 {

    public static void main(String[] args) throws Exception {

        CopyFile4 obj = new CopyFile4();

        try {

            obj.copyFile(new File("acm.pdf"), new File("acm_copy.pdf"));

        } catch(IOException e) {
            System.out.println("Copy Failed!");
        }

    }

    void copyFile(File source, File destination) throws IOException {

        if (!source.exists()) {
            System.out.println("Source Not Found!");
            return;
        }

        try(InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination);
        ) {
            int c = 0;
            while ((c = in.read()) != -1)
                out.write(c);
        }

    }

}
