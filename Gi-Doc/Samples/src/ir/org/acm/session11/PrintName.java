package ir.org.acm.session11;

import ir.org.acm.session10.bankaccounts.CurrentAccount;

public class PrintName {

    public static void main(String[] args) {

        Object[] things = { new CurrentAccount(1,"A",9),
                            "Test",
                            20,
                            new int[3]
                          };

        for (Object o : things)
                printName(o);

    }

    static void printName( Object obj ) {

        System.out.println( obj.getClass().getName() );

    }

}

/*

ir.org.acm.session10.bankaccounts.CurrentAccount
java.lang.String
java.lang.Integer
[I

*/
