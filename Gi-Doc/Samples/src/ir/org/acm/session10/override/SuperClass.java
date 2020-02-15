package ir.org.acm.session10.override;

import java.math.BigInteger;

public class SuperClass {

    public void m() {
        System.out.println("Running SuperClass Implementation...");
    }

    public static void x() {
        System.out.println("Running SuperClass Implementation...");
    }

    public final void y() {
        System.out.println("Running SuperClass Implementation...");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public Number getNumber() {
        return new BigInteger("9999999");
    }

}
