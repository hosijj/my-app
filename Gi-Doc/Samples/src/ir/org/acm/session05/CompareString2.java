package ir.org.acm.session05;

public class CompareString2 {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = str1; // assign address

        if (str1.equals(str2)) // compare values character by character
            System.out.println("Compare String with .equals");

        if (str1 == str2)
            // compare address
            // the same value, but different address
            System.out.println("Compare String with ==");

    }

}
