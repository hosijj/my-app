package ir.org.acm.session11.bankaccounts;

public abstract class DepositAccount extends BankAccount {

    public DepositAccount(int number, String owner, long balance) {
        super(number, owner, balance);
    }

}
