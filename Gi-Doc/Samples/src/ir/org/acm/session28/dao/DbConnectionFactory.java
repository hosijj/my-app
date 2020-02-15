
package ir.org.acm.session28.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionFactory {
    
    public static Connection getConnection() {
        
        Connection con = null;
        
        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        
        try {
            con = DriverManager.getConnection(url, un, pw);
        } catch(Exception e) {
            e.printStackTrace();
        }    
        
        return con;
        
    }

}
