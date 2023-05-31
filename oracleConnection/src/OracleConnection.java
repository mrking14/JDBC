import java.sql.*;

public class OracleConnection {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String password = "oracle";
        System.out.println("Start.....");
        try {
            // Loading the Driver Class.
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Getting Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Creating Statement Object
            Statement stmt = conn.createStatement();
            int x = 0;
            // x= stmt.executeUpdate("create table emp (name varchar(50), salary int )");
            x = stmt.executeUpdate("insert into emp values('masoom',22000)");

            ResultSet rs = stmt.executeQuery("select * from emp");
            System.out.println("Name  /t /t Salary");
            while (rs.next()) {

                System.out.print(rs.getString(1));
                System.out.print("/t /t" + rs.getString(2));

                System.out.println();
            }

            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
