
package ir.org.acm.session21.thread.locking;

/* Shared Object */
public class BankAccount {
    
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    /* Critical Section */
    synchronized void change() { // at the end, makes no change to the field!
        
        for (int i = 0; i < 3; i++) {
            balance = balance + 1;
            delay(delay); // Delay is added to show the non-atomic behaviour of methods
            balance = balance - 1;
        }    
        
    }

    public int getBalance() {
        return balance;
    }
    
    int delay = 50;
    void delay(int d) {
        try { Thread.sleep(d); } catch(InterruptedException e) { e.printStackTrace(); }
    }

}
