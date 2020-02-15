package ir.org.acm.session15.collections;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        //   private static final int DEFAULT_CAPACITY = 10;
        ArrayList my = new ArrayList();
        System.out.println( my.size() ); // 0

        ArrayList list = new ArrayList(50);
        System.out.println( list.size() ); // 0

        BankAccount acc1 = new BankAccount(123, "Ali", 1000);

        for(int i=0; i<20; i++)
            list.add(acc1);
        System.out.println( list.size() ); // 20

        if ( list.remove(acc1) ) { // Override the .equals() to find object with the same value
            System.out.println( list.size() ); // 19
        }

        list.trimToSize();
        System.out.println( list.size() ); // 19

        BankAccount removed = (BankAccount) list.remove(0);
        System.out.println(removed.getNumber() +  " removed!");
        System.out.println( list.size() ); // 18

    }

}
