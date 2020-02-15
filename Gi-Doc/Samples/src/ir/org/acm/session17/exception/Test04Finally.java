package ir.org.acm.session17.exception;

public class Test04Finally {
    
    public static void main(String[] args) {
            
        try {
            
            Class.forName("session17.exception.Test04Finally");

        } catch(ClassNotFoundException e) {
            
            System.out.println( "catch block! " + e.getMessage() );

        } finally {
            
            System.out.println( "Run anyway after try / catch block" );

        }    

    }
    
}
