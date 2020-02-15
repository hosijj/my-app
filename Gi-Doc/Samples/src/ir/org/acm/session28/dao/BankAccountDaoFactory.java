
package ir.org.acm.session28.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class BankAccountDaoFactory {
    
    BankAccountDaoInterface getDao() {

        // Or read from property file

        BankAccountDaoInterface dao = null;
        
        dao = new BankAccountDaoMySqlImpl();
        
        return dao;
        
    }
    
    BankAccountDaoInterface getDao(Connection con) {
        
        // Use Reflection to create appropriate implementation
        
        BankAccountDaoInterface dao = null;
        
        try {
            DatabaseMetaData m = con.getMetaData();
            String db = m.getDatabaseProductName();
            switch(db) {
                
                case "MySql": dao = new BankAccountDaoMySqlImpl(); 
                              break;
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }    
        
        
        return dao;
        
    }

    BankAccountDaoInterface getDao(String name) {

        // Use Reflection to create appropriate implementation

        BankAccountDaoInterface dao = null;

        try {
            switch(name) {

                case "Database": dao = new BankAccountDaoMySqlImpl();
                    break;
                case "XML":
                    break;
                case "JSON":
                    break;

            }

        } catch(Exception e) {
            e.printStackTrace();
        }


        return dao;


    }

}
