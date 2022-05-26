import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL_DB = "jdbc:mysql://localhost:3306/smtbiz";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection con = null;

    public static void connectDatabase() {
        try {
            con = DriverManager.getConnection(URL_DB, USER, PASSWORD);
            con.setAutoCommit(false);
        }catch (SQLException ex) {
            System.out.println("SQLException on database connection:" + ex.getMessage());
        }
    }

    public static void closeDatabase() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("SQLException on database close:" + ex.getMessage();
        }
    }

    public static ResultSet executeQuery(String queryStmt) {
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSet crs = null;

        try {
            connectDatabase();
            stmt = con.createStatement();
            resultSet = stmt.executeQuery(queryStmt);
            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(resultSet);
        }catch (SQLException ex) {
            System.out.println("SQLException on executeQuery:" + ex.getMessage();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                closeDatabase();
            } catch (SQLException ex) {
                System.out.println();
            }
        }
return crs;
}

public static int executeUpdate(String sqlStmt) {
    }
}
