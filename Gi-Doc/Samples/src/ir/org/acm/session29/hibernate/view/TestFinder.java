package ir.org.acm.session29.hibernate.view;

import ir.org.acm.session29.hibernate.biz.BankAccountFacade;
import ir.org.acm.session29.hibernate.entity.BankAccount;
import java.util.List;

public class TestFinder {
    
    public static void main(String[] args) {
        
        BankAccountFacade service = new BankAccountFacade();
        
        BankAccount ba = service.findByNumber(1234);
        System.out.println( ba.getBalance() );
        
//        List minList = service.getAccountLessThan(3000);
//        for (Object acc : minList)
//            System.out.println( ((BankAccount)acc).getOwner() );
        
    }
    
}
