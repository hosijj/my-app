package ir.org.acm.session12.generics;

public class MyBridge {

    public static void main(String[] args) {

        Object obj = new Child();
        ( (Parent) obj ).m("ABC");
        ( (Child)  obj ).m("ABC");
    }

}

class Parent {

    void m(Object obj) {
        System.out.println("Parent / Object Version....");
    }

}

class Child extends Parent {

    @Override
    void m(Object obj) { // Bridge Method
        m( (String)obj );
    }

    void m(String obj) {
        System.out.println("Child / String Version....");
    }

}
