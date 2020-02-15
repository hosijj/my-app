package ir.org.acm.session18.reflection;

import java.lang.annotation.Annotation;
import ir.org.acm.session18.annotation.*;

import java.lang.reflect.Method;

public class FindExpensiveMethod {
    
    public static void main(String[] args) {
        
        FindExpensiveMethod f = new FindExpensiveMethod();

        try {

//            String m = f.findExpensiveMethod("ir.org.acm.session18.annotation.Test1");
//            System.out.println( m + " is the expensive method!");

            String m = f.findandRunExpensiveMethod("ir.org.acm.session18.annotation.Test1");
            System.out.println( m + " was called!");

        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    String findExpensiveMethod(String className) throws ClassNotFoundException {

        String methodName = "";

        Class c = Class.forName(className); // class loading & introspection

        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            if ( m.isAnnotationPresent(Expensive.class) ) {
                methodName = m.getName();
                break;
            }
        }

        return methodName;

    }


    String findandRunExpensiveMethod(String className) throws ClassNotFoundException {
        
        String methodName = "";
        
        Class c = Class.forName(className); // class loading & introspection
        System.out.println(" class " + className + " is loaded.");
        
        Method[] methods = c.getDeclaredMethods();
        
        for (Method m : methods) {

            // if ( m.isAnnotationPresent(Expensive.class) ) { }

            Expensive g = m.getAnnotation(Expensive.class);

            if (g != null) {

                Object myObject = g;
                Annotation myInterface = g;
                Class ac = myInterface.annotationType();
                System.out.println( "Annotation: " + ac.getName() );
                System.out.println( "The value attribute is: " + g.value() );
                System.out.println( "ClassName: " + g.getClass().getName() ); // com.sun.proxy.$Proxy1
                System.out.println( "Superclass: " + g.getClass().getSuperclass() ); // java.lang.reflect.Proxy

                methodName = m.getName();
                try {
                    Object obj = c.newInstance(); // create object from : ir.org.acm.session18.annotation.Test1
                    System.out.println(" An object of " + className + " is created!");
                    m.setAccessible(true); 
                    m.invoke(obj); // call
                } catch(Exception e) {
                    e.printStackTrace();
                }    
            }    
        }   
        
        return methodName;
        
    }
    
    
}
