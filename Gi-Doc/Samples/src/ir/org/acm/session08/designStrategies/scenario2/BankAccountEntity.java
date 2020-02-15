package ir.org.acm.session08.designStrategies.scenario2;

public class BankAccountEntity { // Entity & Data Transfer Object (DTO) at the same

    // Business Data
    private int number;
    private String owner;
    private long balance;

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

}
