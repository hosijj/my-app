package ir.org.acm.session28.dao;

import java.util.List;

public interface BankAccountDaoInterface {
    
    void create(BankAccount ba);
    
    BankAccount findByNumber(int number);
    
    List<BankAccount> findByMaxBalance(int maxBalance);
    
}
