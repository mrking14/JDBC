package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnection {

    public static void main(String[] args) {
        int x = 0;
        String name = "Masoom";
        String id = "02TCS";
        String desig = "Soft Er";
        int salary = 25000;
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "mysql";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            // x = stmt.executeUpdate(
            // "create table employe1 (name varchar(50), eid varchar(50), desig varchar(50),
            // salary int )");
            String insqry = "insert into employee values('Ajay','05TCS','Soft Er',2000)";
            x = stmt.executeUpdate(insqry);
            insqry = "insert into employee values('" + name + "','" + id + "','" + desig + "','" + salary + "') ";
            stmt.executeUpdate(insqry);

            ResultSet rs = stmt.executeQuery("select * from employee");

            System.out.println("Name \t\t eid \t\t desig \t\t salary");
            while (rs.next()) {

                System.out.print(rs.getString(1));
                System.out.print("\t\t" + rs.getString(2));
                System.out.print("\t\t" + rs.getString(3));
                System.out.println("\t\t" + rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("COmplete....");
    }

}
