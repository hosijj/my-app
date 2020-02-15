package ir.org.acm.session17.exception;

public class Test03Methods {
    
    public static void main(String[] args) {
            
        try {
            
            Class.forName("NotExistsClass");
            
        } catch(ClassNotFoundException e) {
            
            //System.out.println( e.getMessage() );

            //System.out.println( e.toString() );

            e.printStackTrace();
            
        }     
        
    }
    
}
