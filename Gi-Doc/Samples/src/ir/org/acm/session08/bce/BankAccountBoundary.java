package ir.org.acm.session08.bce;

import java.util.Scanner;

public class BankAccountBoundary {
    
    public static void main(String[] args) {
        
        new BankAccountBoundary().showTextForm();
        
    }
    
    void showTextForm() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("source account number? ");
        int source = sc.nextInt();
        
        System.out.print("destination account number? ");
        int destination = sc.nextInt();
        
        System.out.print("amount to transfer? ");
        long amount = sc.nextLong();
        
        BankAccountController controller = new BankAccountController();
        controller.transfer(source, destination, amount);
        
    }

}
