package ir.org.acm.session25.io.xml.parser;

import java.util.List;
 
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "bankaccounts")
@XmlAccessorType (XmlAccessType.FIELD)
public class BankAccounts {
    
    @XmlElement(name = "bankaccount")
    private List<BankAccount> accounts = null;
 
    public List<BankAccount> getAccounts() {
        return accounts;
    }
 
    public void setBankAccount(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
}