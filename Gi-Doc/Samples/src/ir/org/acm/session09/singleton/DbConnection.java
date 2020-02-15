package ir.org.acm.session09.singleton;

public class DbConnection {

    // Connection con;
    // Connection getConnection()

    private DbConnection() { }

    private static DbConnection instance = null;

    public static DbConnection getInstance() {
        if (instance == null)
            instance = new DbConnection();
        return instance;
    }

}

// Connection con = DbConnection.getInstance().getConnection();