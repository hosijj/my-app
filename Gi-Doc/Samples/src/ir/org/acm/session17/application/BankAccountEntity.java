package ir.org.acm.session17.application;

public class BankAccountEntity {
    
    long accountBalance;
    int accountNumber;
    String accountOwner;
    
    void deposit(long amount) {
         accountBalance += amount;       
    }
    

//    void withdraw(long amount) throws Exception {
//        if (accountBalance < amount) throw new Exception();
//        accountBalance -= amount;
//    }

    
    void withdraw(long amount) throws NotEnoughAmountException {

        if (accountBalance < amount) throw new NotEnoughAmountException();

        accountBalance -= amount;

    }

//        void withdraw(long amount)  {
//            accountBalance -= amount;
//        }

    
    long getBalance() {
        return accountBalance;
    }
    
}
