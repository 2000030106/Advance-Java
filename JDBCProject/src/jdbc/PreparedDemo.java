package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            String sql =
                    "insert into students values(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, 2);
            ps.setString(2, "Ravi");
            ps.setInt(3, 85);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row inserted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}