package ir.org.acm.session17.exception;

public class Test08Throws {
    
    public static void main(String[] args) {
            
        try {
            
            m1();
            
        } catch (ClassNotFoundException e) {

            System.out.println("main: I got " + e.toString());

        }
        
    }
    
    static void m1() throws ClassNotFoundException {
        
                Class.forName("exception.Test00");
                
                System.out.println("After forName()");
                
    }

    static void m2() throws ClassNotFoundException {

        try {

            Class.forName("exception.Test00");

        } finally {

            System.out.println("After forName()");

        }

    }

    
}
