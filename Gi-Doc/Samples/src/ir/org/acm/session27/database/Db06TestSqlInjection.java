package ir.org.acm.session27.database;


import java.sql.*;
import java.util.Scanner;

/*
use this as id : "ali' OR 1=1 -- "
use this as id : "ali' -- "
*/
public class Db06TestSqlInjection {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Id (Owner):");
        String un = sc.next();
        System.out.print("Password (Number):");
        int pw = sc.nextInt();
        
        String url = "jdbc:mysql://localhost/banking";
        String dbun = "acm";
        String dbpw = "1234";
        Connection con = DriverManager.getConnection(url, dbun, dbpw);
        
        String sql = "SELECT * FROM tbl_account WHERE f_owner='" + un + "' AND f_number=" + pw;
        System.out.println(sql);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

//        String sql = "SELECT * FROM tbl_account WHERE f_owner=? AND f_number=?";
//        PreparedStatement stmt = con.prepareStatement(sql);
//        stmt.setString(1, un);
//        stmt.setInt   (2, pw);
//        ResultSet rs = stmt.executeQuery();

        if ( rs.next() ) 
            System.out.println("You have logged in successfully");
        else 
            System.out.println("Login Failed!");

        rs.close();
        stmt.close();
        con.close();

    }

}
