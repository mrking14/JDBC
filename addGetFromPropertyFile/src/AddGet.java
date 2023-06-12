import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class AddGet {
    public static void main(String[] args) throws SQLException {
        OracleDriver driver = new OracleDriver();
        DriverManager.registerDriver(driver);
        Properties prop = new Properties();
        prop.put("user", "system");
        prop.put("password", "oracle");
        Connection conn = driver.connect("jdbc:oracle:thin:@localhost:1521:xe", prop);
        Statement stmt = conn.preparedStatement();
        ResultSet rs = stmt.executeQuery("select * from employtee");
        System.out.println("Name \t E_id \t Design \t Salary");
        while (rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
        }

        conn.close();

    }
}
