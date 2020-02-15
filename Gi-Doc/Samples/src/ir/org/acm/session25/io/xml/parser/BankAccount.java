package ir.org.acm.session25.io.xml.parser;

public class BankAccount {
    
    String id;
    String number;
    String owner;
    String balance;

    @Override
    public String toString() {
        return number + " " + owner + "(" + id + ")" + balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
