package ir.org.acm.session10.bankaccounts;

public class ShortTerm extends DepositAccount {

    public ShortTerm(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    public void addInterest() {
        float interestRate = 1.09f;
        setBalance( (long)(getBalance()*interestRate) );
    }

}
