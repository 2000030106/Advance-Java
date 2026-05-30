package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            Statement st = con.createStatement();

            String sql =
                    "update students set marks=95 where id=1";

            int rows = st.executeUpdate(sql);

            System.out.println(rows + " row updated");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}