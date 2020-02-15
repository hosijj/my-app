package ir.org.acm.session07;

public class TestFor {

    public static void main(String[] args) {

        int[] arr = {33,44,55,66};

//        int i = 0;
//        while( i == 10 )
//            System.out.println( i );

//        for (;;)
//            System.out.println("Endless Loop / Infinity Loop");

        for (int i=0; i < arr.length; i++) // i is the index of array
            System.out.println( arr[i] );

        for (int i : arr) // i is the value
            System.out.println( i );

    }

}
