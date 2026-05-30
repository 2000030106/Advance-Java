package servlets;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/view")
public class ViewStudentServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentdb",
                            "root",
                            "root");

            String sql =
                    "select * from student";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            out.println("<h1>Student Records</h1>");

            while(rs.next()) {

                out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getString(3));

                out.println("<br>");
            }

            con.close();

        } catch(Exception e) {

            out.println(e);
        }
    }
}