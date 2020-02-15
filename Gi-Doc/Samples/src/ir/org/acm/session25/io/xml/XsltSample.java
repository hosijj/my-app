package ir.org.acm.session25.io.xml;

import javax.xml.transform.*;
import java.io.*;

public class XsltSample {

    public static void main(String[] args) {
        try {

            TransformerFactory tFactory = TransformerFactory.newInstance();

            Transformer transformer =
                    tFactory.newTransformer
                            (new javax.xml.transform.stream.StreamSource
                                    ("account.xsl"));

            transformer.transform
                    (new javax.xml.transform.stream.StreamSource
                                    ("account.xml"),
                            new javax.xml.transform.stream.StreamResult
                                    ( new FileOutputStream("account.html")));
        }
        catch (Exception e) {
            e.printStackTrace( );
        }
    }
}
