package ir.org.acm.session08.designStrategies.scenario1;

public class BankAccountBO {

    // Business Data
    private int number;
    private String owner;
    private long balance;

    // Business Method
    void deposit(long amount){
        balance += amount;
    }
    void withdraw(long amount) { balance -= amount; }

    // Accessors & Mutators
    public int getNumber() { return number;  }
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

    // Persistency Methods
    void save() { }
    void load(int number) {}

}
