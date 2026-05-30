package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.Student;

@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {

protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    int id =
        Integer.parseInt(
            request.getParameter("id"));

    String name =
        request.getParameter("name");

    String email =
        request.getParameter("email");

    Student s =
        new Student();

    s.setId(id);
    s.setName(name);
    s.setEmail(email);

    StudentDAO dao =
        new StudentDAO();

    dao.addStudent(s);

    response.sendRedirect(
        "home.jsp");
}

}

