package ir.org.acm.session06.methodChain;

public class Adder {

    private int number;

    Adder add(int i) {
        this.number += i;
        return this;
    }

    void print() {
        System.out.println(this.number);
    }

}
