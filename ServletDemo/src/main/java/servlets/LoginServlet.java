package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username =
                request.getParameter("uname");

        String password =
                request.getParameter("pass");

        response.setContentType("text/html");

        PrintWriter out =
                response.getWriter();

        if(username.equals("admin")
                && password.equals("1234")) {

            out.println("<h1>Login Success</h1>");

        } else {

            out.println("<h1>Invalid Credentials</h1>");
        }
    }
}