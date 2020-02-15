package ir.org.acm.session27.database;

import java.sql.*;

public class Db03TestInsert {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";

        String insertQuery = "INSERT INTO tbl_account (f_number,f_owner,f_balance) Values (5577,'Taha',12000)";
        
        Connection con = DriverManager.getConnection(url, un, pw);
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate(insertQuery);
        
        stmt.close();
        con.close();

    }
    
}
