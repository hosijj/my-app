package ir.org.acm.session24.io.serialization;

public class BankAccount implements java.io.Serializable {

    private static final long serialVersionUID = 1; // class version number

    private int number;
    private String owner;
    private long balance;
    //private int ziad;

    // transient DBConnection con;

    public BankAccount() {
    }

    public BankAccount(int number, String owner, long balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
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