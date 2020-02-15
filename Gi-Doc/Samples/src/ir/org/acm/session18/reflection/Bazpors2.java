package ir.org.acm.session18.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Bazpors2 {
    
    public static void main(String[] args) throws Exception {
        
        Class c = Class.forName("ir.org.acm.session18.reflection.X");
        
        new Bazpors2().printEteraf( c );
        
//        System.out.println( c.getName() );
//        
//        Method[] methods = c.getDeclaredMethods();
//        
//        for (Method m : methods)
//            System.out.println(m.getName());
//        
//        Field[] fields = c.getDeclaredFields();
//        
//        for (Field f : fields)
//            System.out.println(f.getName());
        
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
