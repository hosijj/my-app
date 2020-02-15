package ir.org.acm.session23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class TestProperties {
    
    public static void main(String[] args) throws Exception {

//        showSystemProperties();
        
        Properties p = new Properties();

        p.setProperty("number","1234");
        p.setProperty("owner","ali");
        p.setProperty("balance","7100");
//
//        System.out.println( p.getProperty("owner") );
        
        //config(p);
        
//        p.store( new FileOutputStream("account.properties" ), null);
        p.storeToXML(new FileOutputStream("account.properties.xml"), null);
        
        //p.load( new FileInputStream("account.properties") );
        //System.out.println( p.getProperty("owner") );
        //p.list( System.out );
        
        //p.loadFromXML(new FileInputStream("account.properties.xml"));
        //p.list(System.out);
        
        
    }    
    
    
    
    static void config(Properties config) {
        
    }
    
    
    
    static void showSystemProperties() {
        
        Properties p = System.getProperties();
        p.list( System.out );
        
    }
    
    
}

/*
    <?xml version="1.0" encoding="UTF-8"?>
    <!-- DTD for properties -->
    <!ELEMENT properties ( comment?, entry* ) >
    <!ATTLIST properties version CDATA #FIXED "1.0">
    <!ELEMENT comment (#PCDATA) >
    <!ELEMENT entry (#PCDATA) >
    <!ATTLIST entry key CDATA #REQUIRED>
*/
