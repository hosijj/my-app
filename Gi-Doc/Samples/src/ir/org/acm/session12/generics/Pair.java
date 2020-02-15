package ir.org.acm.session12.generics;

public class Pair<A,B> { // Generic Class

    A a;
    B b;

    public Pair() {
    }

    public Pair(B b, A a) {
        this.b = b;
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public static void main(String[] args) {

        new Pair<String, Integer>();
        new Pair<String, String>();
        new Pair(); // Object,Object

    }

}
