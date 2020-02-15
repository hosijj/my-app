package ir.org.acm.session17.exception;

public class Test04Finally2 {

    public static void main(String[] args) {

        try {

            Integer.parseInt("1a2");

        } finally {

            System.out.println( "Run anyway after try / catch block" );

        }

    }

}
