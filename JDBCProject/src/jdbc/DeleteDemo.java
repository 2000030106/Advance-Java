package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            Statement st = con.createStatement();

            String sql =
                    "delete from students where id=1";

            int rows = st.executeUpdate(sql);

            System.out.println(rows + " row deleted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}