package ir.org.acm.session11.bankaccounts;

public class BankAccountFactory {

    public static BankAccount getAccount(int interestRate) { // Factory Method

        BankAccount ba = null;

        switch(interestRate) {

            case 9 : ba = new ShortTerm(0,"",0);
                     break;
            case 18: ba = new LongTerm(0,"",0);
                     break;
            default: ba = new GharzolHasane(0,"",0);

        }

        return ba;

    }

}
