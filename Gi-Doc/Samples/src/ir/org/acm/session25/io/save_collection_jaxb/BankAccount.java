package ir.org.acm.session25.io.save_collection_jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BankAccount implements Serializable {

    private int number;
    /* Annotation is for Assignment 2: changing name of XML tag for Owner to <customer> */
    @XmlElement(name = "customer")
    private String owner;
    private long balance;

    public BankAccount() {
    }

    public BankAccount(int number, long balance, String owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
