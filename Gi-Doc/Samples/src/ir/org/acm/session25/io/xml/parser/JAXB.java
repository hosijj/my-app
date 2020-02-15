package ir.org.acm.session25.io.xml.parser;

import java.io.FileInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class JAXB {

    public static void main(String[] args) throws Exception {

        JAXBContext jaxbContext = JAXBContext.newInstance(BankAccounts.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        BankAccounts accs = (BankAccounts) jaxbUnmarshaller.unmarshal(new FileInputStream("xml/bankaccount.xml"));

        for (BankAccount acc : accs.getAccounts()) {
            System.out.println(acc);
        }

    }

}
