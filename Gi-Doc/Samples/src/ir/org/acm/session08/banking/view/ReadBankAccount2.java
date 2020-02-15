package ir.org.acm.session08.banking.view;

import ir.org.acm.session08.banking.controller.BankAccountController;
import ir.org.acm.session08.banking.entity.BankAccount;

import java.util.Scanner;

public class ReadBankAccount2 {

    public static void main(String[] args) {

        new ReadBankAccount().start();

    }

    void start() {

        Scanner sc = new Scanner(System.in); // use this class to read from keyboard

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter owner: ");
        String owner = sc.next();

        System.out.print("Enter balance: ");
        long balance = sc.nextLong();

        BankAccountController controller = new BankAccountController();

        BankAccount bankAccount = new BankAccount(number, owner, balance);

        controller.create( bankAccount ); // save BankAccount in DB

    }

}
