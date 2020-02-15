package ir.org.acm.session15.collections;

import java.util.*;

public class TestTreeSet {

    public static void main(String[] args) {

        //TreeSet ts = new TreeSet( new MyComparator() );

        TreeSet<BankAccount> ts = new TreeSet(new Comparator<BankAccount>() {
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });

        ts.add( new BankAccount(1236, "Hassan", 2500) );
        ts.add( new BankAccount(1234, "Ali", 1300) );
        ts.add( new BankAccount(1235, "Reza", 1300) );

        // TreeSet is Sorted (based on bankaccount number)

        for (BankAccount ba : ts)
            System.out.println( ba.getNumber() );

    }

}
