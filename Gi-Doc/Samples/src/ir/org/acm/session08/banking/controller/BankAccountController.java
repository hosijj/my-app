package ir.org.acm.session08.banking.controller;

import ir.org.acm.session08.banking.entity.BankAccount;

import java.sql.*;

public class BankAccountController { // Dao , CrudFacade

    public void create(BankAccount b) {

        Connection con = null;
        Statement stmt = null;

        String insertQuery = "INSERT INTO tbl_account ( f_number, f_owner, f_balance) Values ('"  + b.getNumber()
                + "','" + b.getOwner() + "','" + b.getBalance() + "')";

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

    public BankAccount findByNumber(int number) {

        BankAccount bank = null;

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            con = DriverManager.getConnection(url, un, pw);
            String sql = "SELECT * FROM tbl_account WHERE f_number='" + number + "'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            if ( rs.next() ) {
                bank = new BankAccount();
                bank.setId( rs.getInt("f_id") );
                bank.setNumber( rs.getInt("f_number") );
                bank.setOwner( rs.getString("f_owner") );
                bank.setBalance( rs.getLong("f_balance") );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
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

        return bank;

    }

}
