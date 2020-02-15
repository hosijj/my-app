
package ir.org.acm.session17.exception;

public class Test11Hiding {
    
    // Hiding Exceptions
    
    public static void main(String[] args) {
        
       try {
           m();
       } catch(Exception e) {
           System.out.println( e.toString() );
       }
        
    }
    
    static void m() throws Exception {
        
        try {
            if (true) throw new Exception("Original");
        } finally {
            m2();
        }    
         
    }

    
    
    
    static void m2() throws Exception {
         if (true) throw new Exception("Fake"); // Hide the original
    }

}
