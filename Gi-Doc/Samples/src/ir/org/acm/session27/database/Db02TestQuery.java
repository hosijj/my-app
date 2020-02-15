package ir.org.acm.session27.database;

import java.sql.*;

public class Db02TestQuery {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, un, pw);

        String sql = "SELECT * FROM tbl_account";

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int number   = rs.getInt("f_number");
            String owner = rs.getString("f_owner");
            long balance = rs.getLong("f_balance");
            System.out.printf("N:%-5d O:%-8s B:%-5d \n", number, owner, balance);
        }

        rs.close();
        stmt.close();
        con.close();

    }

}
