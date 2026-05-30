package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUDPreparedStatement {


public static void main(String[] args) {

    try {

        // STEP 1: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // STEP 2: Create Connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root");

        // =================================================
        // INSERT OPERATION
        // =================================================

        String insertQuery =
                "insert into students values(?,?,?)";

        PreparedStatement psInsert =
                con.prepareStatement(insertQuery);

        psInsert.setInt(1, 1);
        psInsert.setString(2, "Mahender");
        psInsert.setInt(3, 90);

        int insertRows = psInsert.executeUpdate();

        System.out.println(insertRows +
                " row inserted");



        // =================================================
        // SELECT OPERATION
        // =================================================

        String selectQuery =
                "select * from students";

        PreparedStatement psSelect =
                con.prepareStatement(selectQuery);

        ResultSet rs = psSelect.executeQuery();

        System.out.println("\nStudent Records:");

        while(rs.next()) {

            System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("marks"));
        }



        // =================================================
        // UPDATE OPERATION
        // =================================================

        String updateQuery =
                "update students set marks=? where id=?";

        PreparedStatement psUpdate =
                con.prepareStatement(updateQuery);

        psUpdate.setInt(1, 95);
        psUpdate.setInt(2, 1);

        int updateRows = psUpdate.executeUpdate();

        System.out.println("\n" +
                updateRows + " row updated");



        // =================================================
        // SELECT AFTER UPDATE
        // =================================================

        ResultSet rs2 = psSelect.executeQuery();

        System.out.println("\nAfter Update:");

        while(rs2.next()) {

            System.out.println(
                    rs2.getInt("id") + " "
                    + rs2.getString("name") + " "
                    + rs2.getInt("marks"));
        }



        // =================================================
        // DELETE OPERATION
        // =================================================

        String deleteQuery =
                "delete from students where id=?";

        PreparedStatement psDelete =
                con.prepareStatement(deleteQuery);

        psDelete.setInt(1, 1);

        int deleteRows = psDelete.executeUpdate();

        System.out.println("\n" +
                deleteRows + " row deleted");



        // =================================================
        // FINAL SELECT
        // =================================================

        ResultSet rs3 = psSelect.executeQuery();

        System.out.println("\nAfter Delete:");

        while(rs3.next()) {

            System.out.println(
                    rs3.getInt("id") + " "
                    + rs3.getString("name") + " "
                    + rs3.getInt("marks"));
        }

        // STEP 3: Close Connection
        con.close();

    } catch (Exception e) {

        System.out.println(e);
    }
}


}
