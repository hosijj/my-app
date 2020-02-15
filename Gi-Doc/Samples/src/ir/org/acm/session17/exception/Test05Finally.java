package ir.org.acm.session17.exception;

public class Test05Finally {
    
    public static void main(String[] args) {

        System.out.println("1");

        try {

            System.out.println("2");
            Class.forName("exception.Test00");
            System.out.println("3"); // May run or may not!

        } catch(ClassNotFoundException e) {

            System.out.println("4");
            return;

        } finally {

            System.out.println("5"); // Run anyway!

        }

        System.out.println("6");

    }
    
}
