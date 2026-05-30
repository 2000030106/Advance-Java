package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        try {

            // Fetch form data
            int id =
                    Integer.parseInt(
                            request.getParameter("id"));

            String name =
                    request.getParameter("name");

            String email =
                    request.getParameter("email");

            // Load Driver
            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentdb",
                            "root",
                            "root");

            // SQL Query
            String sql =
                    "insert into student values(?,?,?)";

            // PreparedStatement
            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            // Execute Query
            int rows =
                    ps.executeUpdate();

            if(rows > 0) {

                out.println(
                        "<h1>Student Registered Successfully</h1>");

            } else {

                out.println(
                        "<h1>Registration Failed</h1>");
            }

            con.close();

        } catch(Exception e) {

            out.println(e);
        }
    }
}