package ir.org.acm.session22.io.banking;

import java.io.*;

public class BankAccountService {

    /*
    BankAccount.txt
    Number: 1234
    Owner: ali
    Balance: 1700
    */
    void saveAsTextFile1(BankAccount ba) throws FileNotFoundException, IOException {

        FileWriter f = new FileWriter("BankAccount.txt");
        f.write("Number: " + ba.getNumber() + "\r\n");
        f.write("Owner: " + ba.getOwner() + "\r\n");
        f.write("Balance: " + ba.getBalance() + "\r\n");
        f.close();

    }

    void saveAsTextFile2(BankAccount ba) throws IOException {

        OutputStream os = new FileOutputStream("BankAccount.txt");
        PrintStream txt = new PrintStream(os);
        txt.append("Number:" + ba.getNumber() + "\r\n");
        txt.append("Owner:" + ba.getOwner() + "\r\n");
        txt.append("Balance:" + ba.getBalance() + "\r\n");
        txt.close();

    }

    void saveAsTextFile3(BankAccount ba) throws IOException {

        FileOutputStream f = new FileOutputStream("account.txt");
        PrintWriter p = new PrintWriter(f);
        p.println("Number: " + ba.getNumber());
        p.println("Owner: " + ba.getOwner());
        p.println("Balance: " + ba.getBalance());
        p.close();

    }

    void saveAsTextFile4(BankAccount ba) throws FileNotFoundException, IOException {

        File file = new File("BankAccount.txt");

        if ( !file.exists() ) {
            System.out.println("File Not Found!");
        }
        FileWriter f = new FileWriter(file);
        f.write("Number: " + ba.getNumber() + "\r\n");
        f.write("Owner: " + ba.getOwner() + "\r\n");
        f.write("Balance: " + ba.getBalance() + "\r\n");
        f.close();

    }

    void s1(BankAccount ba, String fileName) { }
    void s2(BankAccount ba, File file) { }
    void s3(BankAccount ba, FileOutputStream f) { }


}
