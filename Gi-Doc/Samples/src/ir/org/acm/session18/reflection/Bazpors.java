package ir.org.acm.session18.reflection;

import java.lang.reflect.*;

public class Bazpors {
    
    public static void main(String[] args) {
        
        X x = new X();
        
        new Bazpors().printEteraf( x );
        
    }
    
    void printEteraf( Object obj ) { // Using Reflection API
        
        Class c = obj.getClass();
        
        System.out.println( c.getName() );
        
        Method[] methods = c.getDeclaredMethods();
        
        for (Method m : methods)
            System.out.println( m.getName() );
        
        Field[] fields = c.getDeclaredFields();
        
        for (Field f : fields)
            System.out.println( f.getName() );
        
    }
    
}
