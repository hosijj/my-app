package ir.org.acm.session10.override;

public class Test {

    public static void main(String[] args) {

        SuperClass s = new SubClass();

        s.m(); // Override for non-static method

        s.x(); // NO Override for static method

    }

}
