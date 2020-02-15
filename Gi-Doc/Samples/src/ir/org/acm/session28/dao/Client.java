
package ir.org.acm.session28.dao;

public class Client {
    
    public static void main(String[] args) {
        
        BankAccountDaoInterface dao = new BankAccountDaoFactory().getDao();

        BankAccount ba = dao.findByNumber(1234);

        System.out.println( ba.getBalance() );
        
    }

}
