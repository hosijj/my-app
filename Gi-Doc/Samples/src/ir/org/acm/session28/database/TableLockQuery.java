
package ir.org.acm.session28.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TableLockQuery {
    
    public static void main(String[] args) throws Exception{
        
        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);
        
        con.setAutoCommit(false);
        Statement stmt = con.createStatement();

        stmt.executeUpdate("LOCK TABLES tbl_account WRITE");
        System.out.println("Table is locked!");
        
        String sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        ResultSet rs = stmt.executeQuery(sql);
        if ( rs.next() ) 
            System.out.println("Before Change: " + rs.getString("f_balance"));
        
        try { Thread.sleep(10*1000); } catch(InterruptedException e) { e.printStackTrace(); }

        stmt.executeUpdate("UNLOCK TABLES");
        System.out.println("Table is unlocked!");
        
        stmt.close();
        con.close();
        
    }

}
