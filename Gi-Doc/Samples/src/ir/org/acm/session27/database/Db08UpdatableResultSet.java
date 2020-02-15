package ir.org.acm.session27.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db08UpdatableResultSet {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);

        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        // rs will be scrollable, will not show changes made by others,
        // and will be updatable

        String sql = "SELECT * FROM tbl_account";
        ResultSet rs = stmt.executeQuery(sql);

        rs.absolute(1);
        rs.updateLong("f_balance", 2000);
        rs.updateRow();

        stmt.close();
        con.close();

    }

}
