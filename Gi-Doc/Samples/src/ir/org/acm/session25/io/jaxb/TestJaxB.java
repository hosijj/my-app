package ir.org.acm.session25.io.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class TestJaxB {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(1234, "ACM", 9800); // JVM

        marshal(ba); // save bank account as XML

        Object obj = unmarshall(); // load bank account from XML

        String owner = ((BankAccount) obj).getOwner();

        System.out.println("Owner: " + owner);

    }

    static void marshal(BankAccount ba) {

        try {
            OutputStream f = new FileOutputStream("bankaccount.xml");
            JAXBContext context = JAXBContext.newInstance(BankAccount.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(ba, f); // write XML Data
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

/*
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<bankAccount>
    <balance>9800</balance>
    <number>1234</number>
    <owner>ACM</owner>
</bankAccount>
*/

    static Object unmarshall() {

        Object ba = null;

        try {
            InputStream f = new FileInputStream("bankaccount.xml");
            JAXBContext context = JAXBContext.newInstance(BankAccount.class);
            Unmarshaller u = context.createUnmarshaller();
            ba = u.unmarshal(f); // read XML Data
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ba;

    }
}
