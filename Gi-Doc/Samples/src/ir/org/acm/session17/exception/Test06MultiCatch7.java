package ir.org.acm.session17.exception;

// After Java 7
public class Test06MultiCatch7 {
    
    public static void main(String[] args) {
        
        try {
            
            Class.forName("exception.Test00");
            Integer.parseInt("12");
            
        } catch(ClassNotFoundException | NumberFormatException e) {
            
            e.printStackTrace();
            
        } finally {
            System.out.println("I want to RUN IT anyway!");
        }    
        
    }
    
}
