package ir.org.acm.session29.hibernate.biz;

import ir.org.acm.session29.hibernate.entity.BankAccount;
import java.util.List;

import ir.org.acm.session29.hibernate.entity.BankAccount;
import org.hibernate.*;

/*
 * BankAccountDao
 * BankAccountService
 * BankAccountManager
 * BankAccountController
 * BankAccountCRUDFacade
 */
public class BankAccountFacade {
    
    public BankAccount findByNumber(int accountNumber) {

        BankAccount ba = null;
        Session session = getSession();
        //Transaction tx = session.beginTransaction();
        String hql = "select ba from BankAccount ba where ba.number = :num";
        Query q = session.createQuery(hql);
        q.setLong("num", accountNumber);
        ba = (BankAccount) q.uniqueResult();
        //tx.commit();
        session.close();
        return ba;

    }

    public List getAccountLessThan(long amount)  {
        List list = null;
        Session session = getSession();
        //Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from BankAccount ba where ba.balance < :min");
        q.setLong("min", amount);
        list = q.list();
        //tx.commit();
        session.close();
        return list;
    }  

    
    public void createAccount(BankAccount ba) {
        
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.save(ba);
        tx.commit();
        session.close(); 
        
    }
    
     private Session getSession() {
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        return session;
        
    }  

    
}
