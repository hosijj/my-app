package ir.org.acm.session17.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test15Nested {

    public static void main(String[] args) {

        FileInputStream f1 = null;
        try {

            f1 = new FileInputStream("my.txt");

            // do some work

            try { // Nested
                f1.read(); // IOException
            } catch(Exception e) {
                e.printStackTrace();
            }

            System.out.println("Edame!?");

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                f1.close(); // IOException
            } catch(Exception e) {
                e.printStackTrace();
            }
        }


    }

}
