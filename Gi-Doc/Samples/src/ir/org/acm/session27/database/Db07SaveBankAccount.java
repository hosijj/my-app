package ir.org.acm.session27.database;

import java.sql.*;

public class Db07SaveBankAccount {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(7634, "ACM", 9800);

        saveInDb2(ba);

    }

     static void saveInDb2(BankAccount ba) {

        Connection con = null;
        PreparedStatement pstmt = null;

        String insertQueryTemplate = "INSERT INTO tbl_account (f_number, f_owner, f_balance) Values (?,?,?)";

        String url = "jdbc:mysql://localhost/banking";
        String un = "acm";
        String pw = "1234";

        try {
            con = DriverManager.getConnection(url, un, pw);
            pstmt = con.prepareStatement(insertQueryTemplate);
            pstmt.setInt   (1, ba.getNumber() );
            pstmt.setString(2, ba.getOwner()  );
            pstmt.setLong  (3, ba.getBalance());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
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
