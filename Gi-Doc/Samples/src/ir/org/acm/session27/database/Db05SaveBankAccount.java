package ir.org.acm.session27.database;

import java.sql.*;

public class Db05SaveBankAccount {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(7634, "ACM", 9800);

        saveInDb(ba);

    }

    static void saveInDb(BankAccount ba) {

        Connection con = null;
        Statement stmt = null;

        String insertQuery = "INSERT INTO tbl_account (f_number, f_owner, f_balance) Values ("
                + ba.getNumber()
                + ",'" + ba.getOwner() + "',"
                + ba.getBalance() + ")";

        System.out.println(insertQuery);

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";

        try {
            con = DriverManager.getConnection(url, un, pw);
            stmt = con.createStatement();
            stmt.executeUpdate(insertQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
