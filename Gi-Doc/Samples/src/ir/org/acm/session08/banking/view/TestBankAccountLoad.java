package ir.org.acm.session08.banking.view;

import ir.org.acm.session08.banking.controller.BankAccountController;
import ir.org.acm.session08.banking.entity.BankAccount;

import java.util.Scanner;

public class TestBankAccountLoad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // use this class to read from keyboard

        System.out.print("Enter number: ");

        int number = sc.nextInt();

        BankAccountController controller = new BankAccountController();

        BankAccount bankAccount = controller.findByNumber( number );

        System.out.println( bankAccount.getOwner() );

    }

}
