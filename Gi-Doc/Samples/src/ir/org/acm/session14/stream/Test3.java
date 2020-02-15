package ir.org.acm.session14.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {

        List<BankAccount> accounts =
                Arrays.asList(
                        new BankAccount(1236, "Hassan", 2500),
                        new BankAccount(1234, "Ali"   , 1300),
                        new BankAccount(1235, "Reza"  , 1800),
                        new BankAccount(1237, "Akbar" , 1900)
                        );

        List<BankAccount> filtered =
                accounts
                        .stream()
                        .filter(p -> p.getOwner().startsWith("A"))
                        .collect(Collectors.toList()
                        );

        for (BankAccount ba : filtered)
            System.out.println( ba.getOwner() );

    }

}
