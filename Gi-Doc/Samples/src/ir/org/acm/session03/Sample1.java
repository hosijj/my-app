
package ir.org.acm.session03;

import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner( System.in );

        System.out.print("How old are you? ");

        int age = keyboard.nextInt();

        System.out.println("You will live " + (80-age) + " more years");

    }

}
