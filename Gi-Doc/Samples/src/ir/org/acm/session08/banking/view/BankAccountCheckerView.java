package ir.org.acm.session08.banking.view;

import ir.org.acm.session08.banking.biz.BankAccountChecker;

import java.util.Scanner;

public class BankAccountCheckerView {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // use this class to read from keyboard

        System.out.print("Enter source number: ");
        int srcNumber = sc.nextInt();

        System.out.print("Enter destination number: ");
        int destNumber = sc.nextInt();

        System.out.print("Enter transfer amount: ");
        long transferAmount = sc.nextLong();

        BankAccountChecker checker = new BankAccountChecker();

        System.out.println( checker.canTransfer(srcNumber, destNumber, transferAmount) );

    }

}
