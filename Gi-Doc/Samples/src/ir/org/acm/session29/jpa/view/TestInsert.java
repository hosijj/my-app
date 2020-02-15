package ir.org.acm.session29.jpa.view;

import ir.org.acm.session29.jpa.biz.BankAccountFacade;
import ir.org.acm.session29.jpa.entity.BankAccount;
import ir.org.acm.session29.jpa.entity.BankAccount;

import java.util.Scanner;

public class TestInsert {
    
     public static void main(String[] args) {

        BankAccount ba = new BankAccount(1,"a",1);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        BankAccountFacade service = new BankAccountFacade();
        int id = service.createAccountWithId(ba);
        System.out.println(id);

    }
    
}
