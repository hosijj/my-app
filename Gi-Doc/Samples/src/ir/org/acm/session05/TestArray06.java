package ir.org.acm.session05;

public class TestArray06 {

    public static void main(String[] args) {

        sayHello( new String[] {"D", "E", "F"} );

        printNumbers( new int[] {10, 20, 30} );

        // int[] arr = increaseNumbers( new int[] {1, 2, 3} );

    }

    static void sayHello(String[] names) {

        for (int i=0; i < names.length; i++)
            System.out.println("Hello " + names[i]);

    }

    static void printNumbers(int[] numbers) {

        for (int i=0; i < numbers.length; i++)
            System.out.println( numbers[i] );

    }

//    static int[] increaseNumbers(int[] numbers) {
//
//        for (int i=0; i < numbers.length; i++)
//            numbers[i] += 10;
//
//        return numbers;
//
//    }


}
