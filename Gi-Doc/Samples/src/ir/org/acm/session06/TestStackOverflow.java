package ir.org.acm.session06;

public class TestStackOverflow {

    public static void main(String[] args) {

        m();

    }

    static void m() { // Recursive Call

        m(); // Exception in thread "main" java.lang.StackOverflowError

    }

}
