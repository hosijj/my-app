package ir.org.acm.session25.io.save_collection_jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class TestBankAccountOperations {

    public static void main(String[] args) {

        /* Start Assignment 1 : Marshalling and unmarshalling collection of BankAccounts. */
        saveBankAccounts(5);
        try {
            loadBankAccounts();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        /* End Assignment 1 */


        /* Start Assignment 3: Compare performance of  marshalling/unmarshalling and serilization/deserialization of 1000 objects*/
        long t1 = System.currentTimeMillis();
        saveBankAccount(1000);
        try {
            loadBankAccount(1000);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        long t2 = System.currentTimeMillis();

        System.out.println("Time spent marshalling and unmarshalling 1000 BankAccount Objects: " + (t2 - t1) + " milliseconds.");

        t1 = System.currentTimeMillis();
        serialize(1000);
        deserialize(1000);
        t2 = System.currentTimeMillis();

        System.out.println("Time spent serializing and deserializing 1000 BankAccount Objects: " + (t2 - t1) + " milliseconds.");

         /* End Assignment 3 */
    }

    private static void saveBankAccounts(int size) {

        BankAccounts bankAccounts = new BankAccounts(size);
        try {
            OutputStream f = new FileOutputStream("accounts.xml");
            JAXBContext context = JAXBContext.newInstance(BankAccounts.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(bankAccounts, f);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void loadBankAccounts() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(BankAccounts.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        BankAccounts bankAccounts = (BankAccounts) jaxbUnmarshaller.unmarshal( new File("accounts.xml") );

        for(BankAccount bankAccount : bankAccounts.getBankAccounts()) {
//            System.out.println(bankAccount.getNumber());
//            System.out.println(bankAccount.getOwner());
//            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.toString());
        }

    }


    public static void saveBankAccount(int count) {

        for (int i = 0; i < count; i++) {
            try {
                BankAccount bankAccount = new BankAccount(1234,1000,"Ali");
                OutputStream f = new FileOutputStream("account" + i + ".xml");
                JAXBContext context = JAXBContext.newInstance(BankAccount.class);
                Marshaller m = context.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                m.marshal(bankAccount, f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    private static void loadBankAccount(int count) throws JAXBException {

        for (int i = 0; i < count; i++) {
            JAXBContext jaxbContext = JAXBContext.newInstance(BankAccount.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            BankAccount bankAccount = (BankAccount) jaxbUnmarshaller.unmarshal( new File("account" + i + ".xml") );
            //System.out.println("BankAccount number " + i + ": " + bankAccount.toString());
        }

    }


    private static void serialize(int count) {

        for (int i = 0; i < count; i++) {
            try {
                BankAccount bankAccount = new BankAccount(1234,1000,"Ali");
                ObjectOutputStream out;
                out = new ObjectOutputStream(new FileOutputStream("account" + i + ".ser"));
                out.writeObject(bankAccount);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static void deserialize(int count) {

        for (int i = 0; i < count; i++) {
            BankAccount bankAccount = null;
            try {
                ObjectInputStream out;
                out = new ObjectInputStream(new FileInputStream("account" + i + ".ser"));
                bankAccount = (BankAccount) out.readObject();
                //System.out.println("BankAccount number " + i + ": " + bankAccount.toString());
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
