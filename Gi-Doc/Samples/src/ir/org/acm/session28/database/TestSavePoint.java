
package ir.org.acm.session28.database;

import java.sql.*;

public class TestSavePoint {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);

        con.setAutoCommit(false);
        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Ali Before Change: " + rs.getString("f_balance"));

        sql = "UPDATE Tbl_Account SET f_balance=1500 WHERE f_owner='Ali'";
        stmt.executeUpdate(sql);

        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Ali after change: " + rs.getString("f_balance"));

        Savepoint here = con.setSavepoint(); // *************************
        System.out.println("*** Set save point !!!!! ");

        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Reza'";
        rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Reza Before change: " + rs.getString("f_balance"));

        sql = "UPDATE Tbl_Account SET f_balance=2500 WHERE f_owner='Reza'";
        stmt.executeUpdate(sql);

        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Reza'";
        rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Reza After Change: " + rs.getString("f_balance"));

        con.rollback(here); //**************
        System.out.println("*** Rollback to save point ***");

        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
        rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Ali after rollback to savepoint: " + rs.getString("f_balance"));

        sql = "SELECT * FROM Tbl_Account WHERE f_owner='Reza'";
        rs = stmt.executeQuery(sql);
        if (rs.next())
            System.out.println("Reza after rollback to savepoint: " + rs.getString("f_balance"));

        con.commit();

        stmt.close();
        con.close();

    }

}
