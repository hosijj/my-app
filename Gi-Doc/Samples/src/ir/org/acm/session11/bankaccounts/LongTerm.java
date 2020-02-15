package ir.org.acm.session11.bankaccounts;

public class LongTerm extends DepositAccount {

    public LongTerm(int number, String owner, long balance) {
        super(number, owner, balance);
    }

    @Override
    public void addInterest() {
        float interestRate = 1.18f;
        setBalance( (long)(getBalance()*interestRate) );
    }

}
