package ir.org.acm.session05;

// Array of Reference
public class TestArray02 {

    public static void main(String[] args) {

        Student[] list; // address

        list = new Student[5]; // allocate array space in heap

        list[0] = new Student(); // allocate space for a student and assign address to array[0]

        list[0].i = 1234;

        System.out.println( list.length ); // 5

        // list[1].i = 1235; // NullPointerException

    }

}
