package ir.org.acm.session24.io;

import java.io.File;
import java.nio.file.Files;

public class CopyPerformance6 {

    public static void main(String[] args) throws Exception {

        String source = "acm.pdf";
        String destination = "acm_copy2.pdf";

        long before = System.currentTimeMillis();

        Files.copy(new File(source).toPath(),
                   new File(destination).toPath());

        /*
        This method copies a file to the target file.
        By default, the copy fails if the target file already exists
        */

        long after = System.currentTimeMillis();

        System.out.println("Duration:" + (after-before) );

    }

}
