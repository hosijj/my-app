package ir.org.acm.session31.dataBinding;

import java.beans.PropertyChangeSupport;

public class BankAccountChangable {

    PropertyChangeSupport obj;

    private String balance = "1000";

    public BankAccountChangable() {
        obj = new PropertyChangeSupport(this);
        obj.addPropertyChangeListener( new AccountChangeListener() );
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {

        String oldBalance = this.balance;
        this.balance = balance;
        obj.firePropertyChange("balance", oldBalance, balance);

    }

}
