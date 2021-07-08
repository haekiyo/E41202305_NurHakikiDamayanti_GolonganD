
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kiki
 */
public class conek {
    private static Connection cn;
    private static Statement st;
    

    public static Connection getkoneksi() {
        com.mysql.jdbc.Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_mahasiswa"; 
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, password);
            }   catch (ClassNotFoundException | SQLException error) {
                System.exit(0);
            }

        }
        return connection;
    }
}

    

