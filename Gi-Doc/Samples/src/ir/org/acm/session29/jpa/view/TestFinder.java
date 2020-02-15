package ir.org.acm.session29.jpa.view;

import ir.org.acm.session29.jpa.biz.BankAccountFacade;
import ir.org.acm.session29.jpa.entity.BankAccount;
import ir.org.acm.session29.jpa.biz.BankAccountFacade;
import ir.org.acm.session29.jpa.entity.BankAccount;

import java.util.List;

public class TestFinder {
    
    public static void main(String[] args) {
        
//        BankAccount ba = new BankAccountFacade().findByNumber(1234);
//        System.out.println( ba.getBalance() );
        
        List list = new BankAccountFacade().getAccountLessThan(3000);

        System.out.println( list.getClass().getName() ); // Vector

        for (int i=0; i<list.size(); i++) {
            System.out.println( ((BankAccount)list.get(i)).getOwner() );
        }

    }
    
}
