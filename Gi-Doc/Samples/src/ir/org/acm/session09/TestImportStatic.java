package ir.org.acm.session09;

import static java.lang.System.out;

import static java.lang.Integer.parseInt;

public class TestImportStatic {

    public static void main(String[] args) {

        // println() is a non-static method
        // out is a static field of System Class
        System.out.println("Hello World!");

        out.println("Hello World!");

        // parseInt() is a static method of Integer Class
        int i = parseInt("12");

    }

}
