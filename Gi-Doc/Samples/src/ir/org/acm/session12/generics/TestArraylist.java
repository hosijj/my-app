package ir.org.acm.session12.generics;

import ir.org.acm.session11.bankaccounts.*;

import java.util.ArrayList;

public class TestArraylist {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(); // Object
        list1.add( new CurrentAccount(1,"",1) );
        list1.add( 1 ); // Object e = new Integer(1)
        list1.add( "ABC" );
        CurrentAccount acc = (CurrentAccount) list1.get(0);
        CurrentAccount acc2 = (CurrentAccount) list1.get(1); // java.lang.ClassCastException

        // NO GENERICS
        for (Object obj : list1) {
            if (obj instanceof CurrentAccount) {
                CurrentAccount ba = (CurrentAccount) obj;
                System.out.println( ba.getOwner() );
            }
        }

        //----------------------------------------------------------------

        ArrayList<BankAccount> list2 = new ArrayList<BankAccount>();
        list2.add( new CurrentAccount(1,"",1) );
//        list2.add(1); // Compile time error
//        list2.add("ABC"); // Compile time error
        BankAccount acc3 = list2.get(0);

        // WITH GENERICS
        for (BankAccount obj : list2) {
            System.out.println( obj.getOwner() );
        }

    }

}
