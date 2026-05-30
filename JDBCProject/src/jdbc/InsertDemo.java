package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) {

        try {

            // STEP 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP 2: Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            // STEP 3: Create Statement
            Statement st = con.createStatement();

            // STEP 4: SQL Query
            String sql =
                    "insert into students values(1,'Mahender',90)";

            // STEP 5: Execute Query
            int rows = st.executeUpdate(sql);

            // STEP 6: Output
            System.out.println(rows + " row inserted");

            // STEP 7: Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}