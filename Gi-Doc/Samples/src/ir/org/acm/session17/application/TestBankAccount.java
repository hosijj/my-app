package ir.org.acm.session17.application;

public class TestBankAccount {
    
     public static void main(String[] args) {
         
         BankAccountEntity acc = new BankAccountEntity();
         acc.deposit(1000);
         
         try {
             
            acc.withdraw(1200);
            
         } catch(NotEnoughAmountException e) {
             //System.out.println("Not enought amount!");
               System.out.println( e.getMessage() );
         }
         
         System.out.println( acc.getBalance() );
         
     }
    
}
