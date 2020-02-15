package ir.org.acm.session29.jpa.biz;

import ir.org.acm.session29.jpa.entity.BankAccount;
import ir.org.acm.session29.jpa.entity.BankAccount;

import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/*
 * BankAccountDao
 * BankAccountService
 * BankAccountManager
 * BankAccountController
 * BankAccountCRUDFacade
  */
public class BankAccountFacade {
    
    private EntityManager em;

    public BankAccountFacade() {

        Properties props = new Properties();
        props.put("eclipselink.persistencexml", "ir/org/acm/session29/jpa/META-INF/persistence.xml");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA", props);
        this.em = emf.createEntityManager();
    }

    public BankAccount findByNumber(int accountNumber) {

        BankAccount ba = null;
        String jpql = "select ba from BankAccount ba where ba.number = :num";
        Query q = em.createQuery(jpql);
        q.setParameter("num", accountNumber);
        try {
            ba = (BankAccount) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("Account Not Found!");
        }
        return ba;

    }
    
    public Object[] findByNumber2(int accountNumber) {
    
        Object[] fields = null;
        Query q = em.createQuery("select ba.balance,ba.owner from BankAccount ba where ba.number = :num");
        q.setParameter("num", accountNumber);
        try {
            fields = (Object[]) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("Account Not Found!");
        }
        return fields;

    }
    
    class My {
        
        private long balance;
        private String owner;

        public My() {
        }

        public My(long balance, String owner) {
            this.balance = balance;
            this.owner = owner;
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
    
    public My findByNumber3(int accountNumber) {
    
        My fields = null;
        Query q = em.createQuery("select New My(ba.balance,ba.owner) from BankAccount ba where ba.number = :num");
        q.setParameter("num", accountNumber);
        try {
            fields = (My) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("Account Not Found!");
        }
        return fields;

    }
    
    public BankAccount findByNumber4(int accountNumber) {
    
        BankAccount ba = null;
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<BankAccount> cq = cb.createQuery(BankAccount.class);
        Root<BankAccount> acc = cq.from(BankAccount.class);
        cq.select(acc);
        cq.where(cb.equal(acc.get("number"), accountNumber));
        ba = em.createQuery(cq).getSingleResult();

        return ba;

    }

    
    public List getAccountLessThan(long amount)  {
    
        List list = null;
        Query q = em.createQuery("select ba from BankAccount ba where ba.balance < :amount");
        q.setParameter("amount", amount);
        try {
            list = q.getResultList();
        } catch (Exception e) {
            System.out.println("Account Not Found!");
        }
        return list;
        
    } 
     

    public void createAccount(BankAccount ba) {
        em.getTransaction().begin();
        em.persist(ba);
        em.getTransaction().commit();
    }

    public void testTransaction() {
        Object o1 = em.getTransaction();
        Object o2 = em.getTransaction();
        if (o1 == o2) System.out.println("The same transaction!");
        else System.out.println("Different transaction!");
    }


    public int createAccountWithId(BankAccount ba) {

        int id = 0;
        
        try {
                em.getTransaction().begin();
                em.persist(ba);
                em.getTransaction().commit();
                id = ba.getId();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return id;
       
    }

    void closeEntityManager() {
        em.close();
    }
    
}
