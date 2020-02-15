package ir.org.acm.session23;

import java.io.*;
import java.util.logging.*;

public class TestLogger {
    
    public static void main(String[] args) throws Exception {
        
//         new Logger(); // NO!
        
//        Logger log1 = Logger.getLogger("");
//        Logger log2 = Logger.getLogger("a");
//        Logger log3 = Logger.getLogger("a");
//        Logger log4 = Logger.getLogger("b");
//        Logger log5 = Logger.getLogger("");
//
//        System.out.println(log1.hashCode());
//        System.out.println(log2.hashCode());
//        System.out.println(log3.hashCode());
//        System.out.println(log4.hashCode());
//        System.out.println(log5.hashCode());

//        Logger.getLogger("a");
//        Logger.getLogger("b");
//        Logger.getLogger("ir.org.acm.accounting");
//        Logger.getLogger( TestLogger.class.getName() );
        
        Logger myLog = Logger.getLogger("ir.org.acm");

        //Handler file = new StreamHandler(new FileOutputStream("my.log"), new SimpleFormatter() );
        Handler file = new StreamHandler(new FileOutputStream("my.log.xml"), new XMLFormatter() );
        myLog.addHandler(file);

        myLog.setLevel(Level.WARNING); // only this level up will be recorded

//        myLog.info("This is just for information!");
//        myLog.warning("This is a warning");

        myLog.log(Level.INFO,    "This is just for information!");
        myLog.log(Level.WARNING, "This is a warning");
        myLog.log(Level.SEVERE,  "Very important log!");

    }


    void m1() {
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(TestLogger.class.getName()).log(Level.SEVERE, ex.toString());
        }
    }
    
}
