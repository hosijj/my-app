package ir.org.acm.session25.io.xml.parser;

import java.io.FileInputStream;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOM {

    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document = builder.parse(new FileInputStream("xml/bankaccount.xml"));

        List<BankAccount> accList = new ArrayList<>();

        //Iterating through the nodes and extracting the data.
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            //We have encountered an <employee> tag.
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                BankAccount ba = new BankAccount();
                ba.id = node.getAttributes().
                        getNamedItem("id").getNodeValue();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);
                    //Identifying the child tag of employee encountered.
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "number":
                                ba.number = content;
                                break;
                            case "owner":
                                ba.owner = content;
                                break;
                            case "balance":
                                ba.balance = content;
                                break;
                        }

                    }

                }

                accList.add(ba);

            }

        }

        //Printing the Account list populated.
        for (BankAccount acc : accList) {
            System.out.println(acc);
        }

    }

}
