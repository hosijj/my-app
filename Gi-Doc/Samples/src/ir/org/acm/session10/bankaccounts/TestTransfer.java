package ir.org.acm.session10.bankaccounts;

public class TestTransfer {

    public static void main(String[] args) {

//        CurrentAccount acc1 = new CurrentAccount(1, "Ali", 1000);
//        ShortTerm acc2 = new ShortTerm(2, "Reza", 1000);

        BankAccount acc1 = new CurrentAccount(1, "Ali", 1000);
        BankAccount acc2 = new ShortTerm(2, "Reza", 1000);

        BankAccountService bankAccountService = new BankAccountService();

        bankAccountService.transfer(acc1, acc2, 100);


    }

}
