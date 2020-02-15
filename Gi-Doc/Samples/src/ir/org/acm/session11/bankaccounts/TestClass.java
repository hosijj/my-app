package ir.org.acm.session11.bankaccounts;

public class TestClass {

    public static void main(String[] args) {

        BankAccount[] accounts = {
                new CurrentAccount(1, "Ali", 1000),
                new ShortTerm(2, "Reza", 1000),
                new LongTerm(3, "Hassan", 1000),
        };

        BankAccountService bankAccountService = new BankAccountService();

        bankAccountService.runInterest(accounts);

        for (BankAccount ba : accounts) {
            System.out.println(ba.getClass().getName() + " " + ba.getBalance());
        }

    }

}
