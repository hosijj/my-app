package ir.org.acm.session11;

import ir.org.acm.session10.bankaccounts.BankAccount;
import ir.org.acm.session10.bankaccounts.CurrentAccount;

public class CallMethod {

    public static void main(String[] args) {

        Object[] things = {
                new CurrentAccount(1,"A",9),
                "Test",
                0,
                new int[3]
        };

        for (Object o : things)
            deposit10(o);

    }

    static void deposit10( Object obj ) {

        if (obj instanceof BankAccount)
            ( (BankAccount)obj ).deposit(10);

    }


}
