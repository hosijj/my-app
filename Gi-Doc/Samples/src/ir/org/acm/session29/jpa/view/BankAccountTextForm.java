package ir.org.acm.session29.jpa.view;

import ir.org.acm.session29.jpa.biz.BankAccountFacade;
import ir.org.acm.session29.jpa.entity.BankAccount;
import ir.org.acm.session29.jpa.entity.BankAccount;

import java.util.Scanner;

public class BankAccountTextForm {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter Account Number: ");
        ba.setNumber(sc.nextInt());

        System.out.print("Enter Owner: ");
        ba.setOwner(sc.next());

        System.out.print("Enter Balance: ");
        ba.setBalance(sc.nextLong());
        
        BankAccountFacade service = new BankAccountFacade();
        service.createAccount(ba);

    }
    
}
