package ir.org.acm.session10.bankaccounts;

public class BankAccountService {

    public void transfer(BankAccount firstAccount, BankAccount secondAccount, long amount) {

        firstAccount.withdraw(amount);
        secondAccount.deposit(amount);

    }

}
