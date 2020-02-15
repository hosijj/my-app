package ir.org.acm.session28.database;

import java.sql.*;

public class TestTransactionRollBack {
    
      public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);
        
        con.setAutoCommit(false); // Start of transaction
        
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        ResultSet rs = stmt.executeQuery(sql);
        if ( rs.next() ) 
            System.out.println("Before Change: " + rs.getString("f_balance"));
        
        sql = "UPDATE Tbl_Account SET f_balance=2500 WHERE f_owner='Ali'";
        stmt.executeUpdate(sql);
       
        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        rs = stmt.executeQuery(sql);
        if ( rs.next() ) 
            System.out.println("After change: " + rs.getString("f_balance"));

        con.rollback(); // end of transaction or con.commit()
        
        rs = stmt.executeQuery(sql);
        if ( rs.next() ) 
            System.out.println("After rollback: " + rs.getString("f_balance"));

        stmt.close();
        con.close();
        
    }
    
}
