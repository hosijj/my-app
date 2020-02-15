package ir.org.acm.session27.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSensitive {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, un, pw);
        con.setAutoCommit(false);
        con.setTransactionIsolation( Connection.TRANSACTION_READ_UNCOMMITTED );

        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                //ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        // rs will be scrollable, will not show changes made by others,
        // and will be updatable

        String sql = "SELECT * FROM tbl_account";
        ResultSet rs = stmt.executeQuery(sql);
        rs.absolute(1);
        rs.updateLong("f_balance", 6160);
        rs.updateRow();

        //-----------------------------------------------------------------

        Connection con2 = DriverManager.getConnection(url, un, pw);
        con2.setTransactionIsolation( Connection.TRANSACTION_READ_UNCOMMITTED );
        con2.setAutoCommit(false);
        Statement stmt2 = con2.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                //ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        String sql2 = "SELECT * FROM tbl_account";
        ResultSet rs2 = stmt2.executeQuery(sql);

        if ( rs2.next() ) System.out.println( rs2.getLong("f_balance") );

//        rs.moveToInsertRow();
//        rs.updateInt(2,5433);
//        rs.updateString(3,"yyy");
//        rs.updateLong(4, 6000);
//        rs.insertRow();
//        rs.moveToCurrentRow();

//        rs.absolute(1);
//        rs.updateLong("f_balance", 4500);
//        rs.updateRow();




        con.commit();
        con2.commit();

        rs.close();
        rs2.close();

        stmt.close();
        stmt2.close();

        con.close();
        con2.close();


    }

}
