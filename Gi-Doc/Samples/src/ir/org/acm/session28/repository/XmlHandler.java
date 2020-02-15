package ir.org.acm.session28.repository;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.io.InputStream;

public class XmlHandler {

    public static String[] parseXml(InputStream inputStream) 
            throws IOException, SAXException, ParserConfigurationException {
        
        Document doc;
        DocumentBuilderFactory factory;
        DocumentBuilder builder;

        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();

        doc = builder.parse(inputStream);
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("dependency");
        String[] groupIds = new String[nList.getLength()];

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            if (nList.item(temp) instanceof Element) {

                Element childElement = (Element) nNode;
                groupIds[temp] = childElement.getElementsByTagName("groupId").item(0).getTextContent();
                
            }

        }

        return groupIds;

    }
}
