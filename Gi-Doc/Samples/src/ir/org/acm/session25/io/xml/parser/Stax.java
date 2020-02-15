package ir.org.acm.session25.io.xml.parser;

import java.io.FileInputStream;
import java.util.*;
import javax.xml.stream.*;

public class Stax {

    public static void main(String[] args) throws XMLStreamException, Exception {

        List<BankAccount> accList = null;
        BankAccount currAcc = null;
        String tagContent = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(
                                    new FileInputStream("xml/bankaccount.xml") );

        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if ("bankaccount".equals(reader.getLocalName())) {
                        currAcc = new BankAccount();
                        currAcc.id = reader.getAttributeValue(0);
                    }
                    if ("bankaccounts".equals(reader.getLocalName())) {
                        accList = new ArrayList<>();
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    tagContent = reader.getText().trim();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName()) {
                        case "bankaccount":
                            accList.add(currAcc);
                            break;
                        case "number":
                            currAcc.number = tagContent;
                            break;
                        case "owner":
                            currAcc.owner = tagContent;
                            break;
                        case "balance":
                            currAcc.balance = tagContent;
                            break;
                    }
                    break;
                case XMLStreamConstants.START_DOCUMENT:
                    accList = new ArrayList<>();
                    break;
            }

        }

        //Print the account list populated from XML
        for (BankAccount acc : accList) {
            System.out.println(acc);
        }

    }

}
