
package ir.org.acm.session20.thread.locking;

public class TestBankAccountConcurrentChange {

    // Run this test a few times... and the result will change
    public static void main(String[] args) throws Exception  {
        
        BankAccount v = new BankAccount(0);
        
        Thread t1 = new Thread( () -> { v.change(); }  );
        Thread t2 = new Thread( () -> { v.change(); }  );
        Thread t3 = new Thread( () -> { v.change(); }  );
        Thread t4 = new Thread( () -> { v.change(); }  );
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        System.out.println( v.getBalance() ); //  The result is Nondeterministic!!!
        /* But if you add synchrinozed to m1() result will be deterministic */
        
    }

}
