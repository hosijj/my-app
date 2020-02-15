
package ir.org.acm.session03;

public class TestPrint {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        String str = " ";

        System.out.println( a + b ); // 3

        System.out.println( a + " " + b ); // "1 2"

        System.out.println( " " + a + b ); // " "12

        System.out.println( a + b + " "); //  3" "

        System.out.println( " " + (a + b) ); // " "3

    }

}
