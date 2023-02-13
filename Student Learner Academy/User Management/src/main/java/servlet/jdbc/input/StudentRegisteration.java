package servlet.jdbc.input;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jdbc.StudentDAO.StudentDAO;
import servlet.jdbc.student.StudentEntity;

/**
 * Servlet implementation class StudentRegisteration
 */
public class StudentRegisteration {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentRegisteration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = ((HttpServletRequest) request).getParameter("email");
		String course = request.getParameter("course");
		String batch = request.getParameter("batch");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		StudentEntity st = new StudentEntity(name, contact, email, course, batch);
		System.out.println(st);
		boolean ans = StudentDAO.InsertStudentIntoDB(st);

		if (ans == true) {
			out.print("<h3>Successfully Inserted</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Add_Data.jsp");
			rd.include(request, response);
		} else {
			out.print("<h3>Failed Inserted</h3>");
			RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("Add_Data.jsp");
			rd.include(request, response);
		}
	}
}
