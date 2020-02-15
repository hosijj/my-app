package ir.org.acm.session28.database;

import java.sql.*;

public class TestTransactionIsolation {

    public static void main(String[] args) {

        new Transaction("User 1", 10*1000).start();

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        new Transaction("User 2", 100).start();

    }

    static class Transaction extends Thread {

        private String name;
        private int delay;

        public Transaction(String name, int delay) {
            this.name  = name;
            this.delay = delay;
        }

        @Override
        public void run() {

            String url = "jdbc:mysql://localhost/banking";
            String un = "acm";
            String pw = "1234";

            try {

                Connection con = DriverManager.getConnection(url, un, pw);

                con.setAutoCommit(false);
                System.out.println("---- " + name + " Start of Transaction ----");
                con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

                Statement stmt = con.createStatement();

                System.out.println(name + " is going to select ali's balance...");
                
                String sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    System.out.println(name + " : Ali's Balance Before Change: "
                            + rs.getString("f_balance"));
                }
                
                System.out.println(name + " is going to select reza's balance...");
                
                sql = "SELECT * FROM Tbl_Account WHERE f_owner='Reza'";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    System.out.println(name + " : Reza's Balance Before Change: "
                            + rs.getString("f_balance"));
                }

                System.out.println(name + " is going to update ali's balance...");
                
                sql = "UPDATE Tbl_Account SET f_balance=2500 WHERE f_owner='Ali'";
                stmt.executeUpdate(sql);

                System.out.println(name + " is going to select ali's balance...");
                
                sql = "SELECT * FROM Tbl_Account WHERE f_owner='Ali'";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    System.out.println(name + " : Ali's Balance After change: "
                            + rs.getString("f_balance"));
                }

                System.out.println(name + " is going to wait for " + delay );
                
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("---- " + name + " RollBack the Transaction ----");
                con.rollback();
                System.out.println("---- " + name + " End of Transaction ----");

                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    System.out.println(name + " : Ali's balance After rollback: "
                            + rs.getString("f_balance"));
                }

                stmt.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

}
/*
Performance & Isolation Level

TRANSACTION_READ_UNCOMMITTED: which gives a little more control to the
application by allowing specific commit and rollback calls.

TRANSACTION_READ_COMMITTED: This isolation level
begins to affect performance because a lock is placed on each row involved
in the transaction. The locks remain on the changed rows until the transaction
is either committed or rolled back.

TRANSACTION_REPEATABLE_READ: in which a
lock is placed on all rows being read until the transaction is either
committed or rolled back.

TRANSACTION_SERIALIZABLE: places a lock on the
tables being accessed in the transaction, which causes all other server threads
that need to access the table to block. 

*/
