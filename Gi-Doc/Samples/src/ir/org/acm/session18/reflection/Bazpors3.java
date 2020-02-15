package ir.org.acm.session18.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Bazpors3 {
    
     public static void main(String[] args) throws Exception {

//        String className = "ir.org.acm.session18.reflection.X";
//        Class c = Class.forName(className); // dynamic / runtime
//
//        Class x = C.class;

        new Bazpors3().printEteraf( X.class ); // hard coded, literal value

        //new Bazpors3().printEteraf( BankAccount.class ); // hard coded, literal value

    }
    
    void printEteraf(Class c) {
        
        System.out.println( c.getName() );
        
        Method[] methods = c.getDeclaredMethods();
        
        for (Method m : methods)
            System.out.println(m.getName());
        
        Field[] fields = c.getDeclaredFields();
        
        for (Field f : fields)
            System.out.println(f.getName());
        
    }

}
