package ir.org.acm.session17.exception;

public class Test09Rethrow {
    
    // Rethrow
    
    public static void main(String[] args) {
            
        try {
            m1();
//        } catch (ClassNotFoundException e) {
//            System.out.println("1111");
        } catch (Exception e) {
            System.out.println("System is not working");
        }
        
    }
    
    static void m1() throws Exception {

        try {
            Class.forName("exception.Test00");
            // by-pass
        } catch (ClassNotFoundException e) {
            // handling
            System.out.println("log exception");
            throw e; // throw new GeneralException(e);
        }
        System.out.println("AAAAA");
        
    }
    
}
