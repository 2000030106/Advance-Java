package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.DBConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    try {

        String username =
            request.getParameter("username");

        String password =
            request.getParameter("password");

        Connection con =
            DBConnection.getConnection();

        String sql =
            "select * from users where username=? and password=?";

        PreparedStatement ps =
            con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs =
            ps.executeQuery();

        if(rs.next()) {

            HttpSession session =
                request.getSession();

            session.setAttribute(
                "username",
                username);

            RequestDispatcher rd =
                request.getRequestDispatcher(
                    "home.jsp");

            rd.forward(request, response);

        } else {

            response.getWriter().println(
                "Invalid Login");
        }

        con.close();

    } catch(Exception e) {

        e.printStackTrace();
    }
}

}

