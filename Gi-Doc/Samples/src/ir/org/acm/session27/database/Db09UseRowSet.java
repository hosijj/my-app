package ir.org.acm.session27.database;

import javax.sql.rowset.CachedRowSet;

public class Db09UseRowSet {

    /*
    A CachedRowSet object is a container for rows of data
    that caches its rows in memory, which makes it possible
    to operate without always being connected to its data source.
    */
    
    public static void main(String[] args) {

        try {

            CachedRowSet crs = new com.sun.rowset.CachedRowSetImpl();
            crs.setUrl("jdbc:mysql://localhost/banking");
            crs.setUsername("acm");
            crs.setPassword("1234");
            crs.setCommand("SELECT * FROM tbl_account");
            crs.execute();
            while (crs.next()) {
                String name = crs.getString("f_owner");
                long balance= crs.getLong("f_balance");
                System.out.println(name + "  " + balance);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

