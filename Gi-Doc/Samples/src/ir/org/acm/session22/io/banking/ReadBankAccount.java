package ir.org.acm.session22.io.banking;

import java.util.Scanner;

public class ReadBankAccount {
    
     public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Account Number:");
        ba.setNumber(sc.nextInt());
        System.out.print("Account Owner:");
        ba.setOwner(sc.next());
        System.out.print("Account Balance:");
        ba.setBalance(sc.nextLong());
        
        BankAccountService sba = new BankAccountService();
        try {
           sba.saveAsTextFile1( ba );
        } catch(Exception e) {
           e.printStackTrace();
        }

    }
    
}
