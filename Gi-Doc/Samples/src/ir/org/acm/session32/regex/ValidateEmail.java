package ir.org.acm.session32.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        System.out.print("Enter E-mail Address: ");
        String email = sc.next();
        
        String emailPattern = "^[(\\w)]+@[(\\w)]+\\.[(\\w)]+$"; 
        
        boolean validated = Pattern.matches(emailPattern, email);
        
        if (validated) System.out.println("E-mail is Validated!");
        else System.out.println("Invalid E-mail!");
        
    }
    
}
