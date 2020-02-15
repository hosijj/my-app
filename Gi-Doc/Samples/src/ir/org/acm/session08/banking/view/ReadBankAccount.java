package ir.org.acm.session08.banking.view;

import ir.org.acm.session08.banking.controller.BankAccountController;
import ir.org.acm.session08.banking.entity.BankAccount;

import java.util.Scanner;

public class ReadBankAccount {

    public static void main(String[] args) {

        new ReadBankAccount().start();

    }

    void start() {

        BankAccount bankAccount = new BankAccount(); // allocate memory space

        Scanner sc = new Scanner(System.in); // use this class to read from keyboard

        System.out.print("Enter number: ");
        bankAccount.setNumber( sc.nextInt() );

        System.out.print("Enter owner: ");
        bankAccount.setOwner( sc.next() );

        System.out.print("Enter balance: ");
        bankAccount.setBalance( sc.nextLong() );

        BankAccountController controller = new BankAccountController();

        controller.create( bankAccount ); // save BankAccount in DB

    }

}
