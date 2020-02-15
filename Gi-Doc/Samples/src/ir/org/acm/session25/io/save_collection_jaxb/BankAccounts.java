package ir.org.acm.session25.io.save_collection_jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BankAccounts {

    @XmlElement
    private List<BankAccount> bankAccounts;

    public BankAccounts(int size) {
        bankAccounts = new ArrayList<>(size);
        for (int i = 0; i < size; i ++) {
            bankAccounts.add( new BankAccount(123,1000,"Ali") );
        }
    }

    public BankAccounts() {
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
