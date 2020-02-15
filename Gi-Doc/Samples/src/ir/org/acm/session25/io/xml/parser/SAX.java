package ir.org.acm.session25.io.xml.parser;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX {

    public static void main(String[] args) throws Exception {

        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse( new FileInputStream("xml/bankaccount.xml") , handler);
        //Printing the list of employees obtained from XML
        for (BankAccount acc : handler.empList) {
            System.out.println(acc);
        }

    }

}

/**
 *
 * The Handler for SAX Events.
 *
 */
class SAXHandler extends DefaultHandler {

    List<BankAccount> empList = new ArrayList<>();
    BankAccount emp = null;
    String content = null;
    @Override
    //Triggered when the start of tag is found.
    public void startElement(String uri, String localName,
            String qName, Attributes attributes)
            throws SAXException {

        switch (qName) {
            //Create a new BankAccount object when the start tag is found
            case "bankaccount":
                emp = new BankAccount();
                emp.id = attributes.getValue("id");
                break;
        }

    }

    @Override
    public void endElement(String uri, String localName,
            String qName) throws SAXException {

        switch (qName) {

            //Add the account to list once end tag is found
            case "bankaccount":
                empList.add(emp);
                break;
            //For all other end tags the employee has to be updated.
            case "number":
                emp.number = content;
                break;
            case "owner":
                emp.owner = content;
                break;
            case "balance":
                emp.balance = content;
                break;

        }

    }

    @Override

    public void characters(char[] ch, int start, int length)
            throws SAXException {

        content = String.copyValueOf(ch, start, length).trim();

    }

}
