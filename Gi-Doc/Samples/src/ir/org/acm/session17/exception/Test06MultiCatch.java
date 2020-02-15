package ir.org.acm.session17.exception;

public class Test06MultiCatch {
    
    public static void main(String[] args) {
            
        try {
            
            Class.forName("exception.Test00");
            Integer.parseInt("12");
            
        } catch(ClassNotFoundException e) {
            
            System.out.println( "Class Not Found!" );
            
        } catch(NumberFormatException e) {
            
            System.out.println( "Not a Number!" );
            
        } finally {
            
            System.out.println("I want to RUN IT anyway!");
            
        }    
        
    }
    
}
