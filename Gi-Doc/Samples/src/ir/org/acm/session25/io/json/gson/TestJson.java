package ir.org.acm.session25.io.json.gson;

import com.google.gson.Gson;

import java.io.*;

public class TestJson {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(1234, "ACM", 9800); // RAM

        saveAsJson(ba); // save bank account as XML

        BankAccount x = loadJson();

        System.out.println( x.getOwner() );

    }


    // You have to add gson.jar to the libs
    static void saveAsJson(BankAccount ba) {

        Gson gson = new Gson();

        String jsonString = gson.toJson(ba);

        try( PrintStream p = new PrintStream(new FileOutputStream("account.gson")); ) {

            p.print(jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static BankAccount loadJson() {

        BankAccount obj = null;

        Gson gson = new Gson();

        try( Reader reader = new FileReader("account.gson"); ) {

            obj = gson.fromJson(reader, BankAccount.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return obj;

    }

}
