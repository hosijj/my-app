package ir.org.acm.session18.reflection;

public class ObjectCreation {
    
    public static void main(String[] args) throws Exception {
        
//        C x = new C();
        
        //---------------------
        
//        String className = "session19.reflection.C";
//        Class c = Class.forName( className );
//        Object obj = c.newInstance();
//        C x = (C)obj;
        
        //---------------------
        
        Object obj = X.class.newInstance();
        
        
        
    }

}
