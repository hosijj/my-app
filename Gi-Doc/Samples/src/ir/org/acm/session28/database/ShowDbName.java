package ir.org.acm.session28.database;

import java.sql.*;

public class ShowDbName {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);

        DatabaseMetaData m = con.getMetaData();
        System.out.println("You are Using: " + m.getDatabaseProductName());

        con.close();

    }
}
