package ir.org.acm.session06.methodChain;

public class TestAdder {

    public static void main(String[] args) {

        Adder a = new Adder();

        a.add(10);
        a.add(20);
        a.add(30);
        a.print();

        a.add(10).add(20).add(30).print();

        a.
                add(10).
                add(20).
                add(30).
                print();

    }

}
