package ir.org.acm.session11.bankaccounts;

public class TestFactory {

    public static void main(String[] args) {

//        BankAccount acc1 = new ShortTerm(2, "Reza", 1000);
//        BankAccount acc2 = new LongTerm(3, "Hassan", 1000);

        BankAccount acc1 = BankAccountFactory.getAccount(9);
        acc1.setNumber(1234);
        acc1.setOwner("Ali");
        acc1.setBalance(1000);

        BankAccount acc2 = BankAccountFactory.getAccount(18);
        acc2.setNumber(1235);
        acc2.setOwner("Reza");
        acc2.setBalance(2000);

    }

}
