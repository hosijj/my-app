package ir.org.acm.session05;

public class TestArray05 {

    public static void main( String[] args ) {

        if (args != null)
            System.out.println( args[0] ); // java.lang.ArrayIndexOutOfBoundsException: 0

//        int[] my = readData();
//        int j = my[0];

//          int i = readData()[0];

    }

    static int[] readData() {

        int[] arr = null;

        arr = new int[0]; // Zero Sized Array

        //arr = new int[3];

        return arr;

    }

    static void a() {

        int[] records = readData();

        if (records != null && records.length == 0) System.out.println("No record found!");

        if (records == null) System.out.println("No record found!");

    }


}
