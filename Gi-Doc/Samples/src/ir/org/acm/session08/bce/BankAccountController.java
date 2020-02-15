package ir.org.acm.session08.bce;

public class BankAccountController {
    
     void transfer(int source, int destination, long amount) {

        BankAccountEntity sourceAccount = new BankAccountEntity().loadAccount(source);
        BankAccountEntity destinationAccount = new BankAccountEntity().loadAccount(destination);

        System.out.println("before: " + source + ":" + sourceAccount.getBalance());
        System.out.println("before: " + destination + ":" + destinationAccount.getBalance());

        sourceAccount.withdraw(amount);

        destinationAccount.deposit(amount);

        System.out.println("after: " + source + ":" + sourceAccount.getBalance());
        System.out.println("after: " + destination + ":" + destinationAccount.getBalance());

    }

}
