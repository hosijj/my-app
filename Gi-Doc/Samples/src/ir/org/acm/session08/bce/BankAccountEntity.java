package ir.org.acm.session08.bce;

public class BankAccountEntity {
    
    private int number;
    private String owner;
    private long balance;
    
    void deposit(long amount){
        balance += amount;
    }
    
    void withdraw(long amount) {
        balance -= amount;
        }
    
    BankAccountEntity loadAccount(int num) {
        // load from persistent storage
        BankAccountEntity ba = new BankAccountEntity();
        ba.number = num;
        ba.balance = 1000; 
        return ba;
    }

    void saveAccount() {
        // save to persistent storage
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
