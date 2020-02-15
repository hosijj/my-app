package ir.org.acm.session18.reflection;

import java.lang.reflect.Method;

public class TestReflection {
    
    public static void main(String[] args) {
        System.out.println("* Class C:");
        printMethods(C.class);
        System.out.println("* Interface I:");
        printMethods(I.class);
    }
    
    static void printMethods(Class c) {

        for (Method m : c.getMethods())
            System.out.println(m.getName());

    }
    
}

class C { 
    public void m1() {}
} 

interface I { 
    void m2();
}

