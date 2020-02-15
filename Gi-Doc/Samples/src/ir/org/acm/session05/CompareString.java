package ir.org.acm.session05;

public class CompareString {

    public static void main(String[] args) {

        String s1 = "Ali";
        String s2 = "AliReza".substring(0, 3); // "Ali"

        if (s2.equals(s1)) // compare values character by character
            System.out.println("Compare String with .equals");

        if (s2 == s1)
        // compare address
        // the same value, but different address
            System.out.println("Compare String with ==");

    }

}
