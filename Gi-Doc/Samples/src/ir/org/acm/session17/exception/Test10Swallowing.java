package ir.org.acm.session17.exception;

public class Test10Swallowing {
    
    // Swallowing Exception (Bad Practice!)
    
    public static void main(String[] args) {
            
        try {
            
            Class.forName("notExists");

        } catch(ClassNotFoundException e) {
           
            // ???
            
        }     

        
    }

}
