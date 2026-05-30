package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.Student;

@WebServlet("/view")
public class ViewStudentsServlet extends HttpServlet {

protected void doGet(
    HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {

    StudentDAO dao =
        new StudentDAO();

    List<Student> list =
        dao.getAllStudents();

    request.setAttribute(
        "students",
        list);

    RequestDispatcher rd =
        request.getRequestDispatcher(
            "viewstudents.jsp");

    rd.forward(request, response);
}

}