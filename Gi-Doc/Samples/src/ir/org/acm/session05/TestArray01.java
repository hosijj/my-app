package ir.org.acm.session05;

// Array of Primitive
public class TestArray01 {

    public static void main(String[] args) {

        int[] arr = null; // address

        int n = 10; // number of elements

        arr = new int[n]; // allocate array space in heap

        arr[0] = 45;

        System.out.println( arr.length ); // 10

        System.out.println( arr[arr.length-1] ); // 0

    }

}
