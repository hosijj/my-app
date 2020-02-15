package ir.org.acm.session24.io.serialization;

import java.io.*;

public class TestSerialization {

    public static void main(String[] args) {

//        BankAccount ba = new BankAccount(1234, "ACM", 9800); // JVM
//
//        serialize(ba); // save bank account object in File

        Object obj = deserialize(); // load bank account object from File

        String owner = ((BankAccount) obj).getOwner();

        System.out.println("Owner: " + owner);

    }

    static void serialize(BankAccount ba) {

        try( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("account.ser") ) ){

            out.writeObject( ba ); // Serialize

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static Object deserialize() {

        Object obj = null;

        try( ObjectInputStream out = new ObjectInputStream( new FileInputStream("account.ser") ) ){

            obj = out.readObject(); // deserialize

        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;

    }

    // OutputStream out = new FileOutputStream("account.ser");
    // serialize(out, ba);
    // Object o = deserialize(out);

}
