package ir.org.acm.session17.exception;

public class Test02Checked {
    
    public static void main(String[] args) {
            
        try {

            Class.forName("NotExists");

        } catch(ClassNotFoundException e) {
            System.out.println("There is no such a class!");
        }

        System.out.println("the rest of code...");
        
    }
    
}
