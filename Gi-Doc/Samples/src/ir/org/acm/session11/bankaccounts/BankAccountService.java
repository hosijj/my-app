package ir.org.acm.session11.bankaccounts;

public class BankAccountService {

    public void transfer(BankAccount firstAccount, BankAccount secondAccount, long amount) {

        firstAccount.withdraw(amount);
        secondAccount.deposit(amount);

    }

    public void runInterest(BankAccount[] list) {

        for (BankAccount ba : list) {
            ba.addInterest();
        }

    }

}
