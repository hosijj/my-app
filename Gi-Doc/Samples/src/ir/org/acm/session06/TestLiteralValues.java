package ir.org.acm.session06;

public class TestLiteralValues {

    public static void main(String[] args) {

        int i0 = 100;        // Decimal (10)
        int i1 = 0X64;       // Hex (16)
        int i2 = 0144;       // Octal (8)
        int i3 = 0b01001000; // binary (2)

        int number = 1_000_000_000;

        //Overflow

        int big = Integer.MAX_VALUE + 1; // overflow

        System.out.println( big ); // -2,147,483,648

        // Array

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        //System.out.println( arr[big] ); // ArrayIndexOutOfBoundsException: -2147483648

        System.out.println( arr[Integer.MAX_VALUE + 2147483640 + 10] ); // 1


    }

}
