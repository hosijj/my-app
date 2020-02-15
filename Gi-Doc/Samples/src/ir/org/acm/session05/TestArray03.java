package ir.org.acm.session05;

public class TestArray03 {

    public static void main(String[] args) {

        //int[] arr1; // No Value
        //System.out.println( arr1.length ); // compile-time error

        int[] arr2 = null;
        //System.out.println( arr2.length ); // NullPointerException

        int[] arr3 = new int[0]; // Zero Sized Array
        System.out.println( arr3.length ); // 0
        arr3[0] = 100; // Array Index Out Of Bounds Exception

        int[] arr4 = new int[1];
        System.out.println( arr4.length ); // 1
        arr4[0] = 100; // OK

    }

}
