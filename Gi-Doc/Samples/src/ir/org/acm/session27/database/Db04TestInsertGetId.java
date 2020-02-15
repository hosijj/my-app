package ir.org.acm.session27.database;

import java.sql.*;

public class Db04TestInsertGetId {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";

        String insertQuery = "INSERT INTO tbl_account (f_number,f_owner,f_balance) Values (1237,'Fariba',5000)";
        
        Connection con = DriverManager.getConnection(url, un, pw);
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if ( rs.next() ) 
            System.out.println("Generated ID is: " + rs.getInt(1));
        
        stmt.close();
        con.close();

    }
}
