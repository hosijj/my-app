
package ir.org.acm.session28.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class BankAccountDaoMySqlImpl implements BankAccountDaoInterface {

    private final static String CREATE = "INSERT INTO tbl_Account (f_number,f_owner,f_balance) VALUES (?,?,?)";
    private final static String FIND_BY_NUMBER = "SELECT * FROM tbl_Account WHERE f_number=?";
    private final static String FIND_BY_MAX_BALANCE = "SELECT * FROM tbl_Account WHERE f_balance<?";
    
    public List<BankAccount> findByMaxBalance(int maxBalance) {
    
        List<BankAccount> list = new ArrayList<BankAccount>();
        
        // execute prepared statement
        
        return list;
    
    }

    public BankAccount findByNumber(int number) {
        
        BankAccount ba = null;
        
        PreparedStatement pstmt = null;
        Connection con = null;
        ResultSet rs = null;
        
        try {
            con = DbConnectionFactory.getConnection();
            pstmt = con.prepareStatement(FIND_BY_NUMBER);
            pstmt.setInt( 1, number );
            rs = pstmt.executeQuery();
            if (rs.next()) {
                ba = new BankAccount(rs.getInt("f_number"), rs.getString("f_owner"), rs.getLong("f_balance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { rs.close(); }    catch(Exception e) { e.printStackTrace(); }
            try { pstmt.close(); } catch(Exception e) { e.printStackTrace(); }
            try { con.close(); }   catch(Exception e) { e.printStackTrace(); }
        }
        
        return ba;
        
    }

    public void create(BankAccount ba) {
        
        PreparedStatement pstmt = null;
        Connection con = null;
        
        try {
            con = DbConnectionFactory.getConnection();
            pstmt = con.prepareStatement(CREATE);
            pstmt.setInt( 1, ba.getNumber() );
            pstmt.setString( 2, ba.getOwner() );
            pstmt.setLong( 3, ba.getBalance() );
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        
    }
    
}
