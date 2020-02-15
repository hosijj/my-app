package ir.org.acm.session17.exception;

public class Test01Runtime {

    public static void main(String[] args) {
            
        String str = "1w2";
        int i = 0;
        
        try {

            i = Integer.parseInt(str);
            
            System.out.println("after parseInt()");
        
        } catch(NumberFormatException e) {
            System.out.println("Not a valid integer!");
        }
        
        System.out.println(i);
        
    }
    
}
