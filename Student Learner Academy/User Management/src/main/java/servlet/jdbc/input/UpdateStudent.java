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
 * Servlet implementation class UpdateStudent
 */
public class UpdateStudent {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
     response.getWriter().append("Served at: ").append(((HttpServletRequest) request).getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		HttpServletRequest toInt = null;
		String id = toInt.getParameter("id");
		String name = toString(); getParameter("name");
		String contact = toString(); getParameter("contact");
		String email = toString(); getParameter("email");
		String course = toString(); getParameter("course");
		getParameter("batch");
		PrintWriter out = response.getWriter();

		StudentEntity st = new StudentEntity(id, name, contact, email, course);
		System.out.println(st);
		boolean ans = StudentDAO.UpdateStudentIntoDB(st);
		if (ans == true) {
			out.print("<h3>Successfully Updated</h3>");
			RequestDispatcher rd = request.getRequestDispatcher((String) "Show_Data.jsp");
			rd.include(request, response);
			} 
		else {
			out.print("<h3>Failed Updation</h3>");
			RequestDispatcher rd = request.getRequestDispatcher((String) "Edit_Data.jsp");
			rd.include(request, response);
		}
	}

	private String toInt() {
		// TODO Auto-generated method stub
		return null;
	}

	private void getParameter(String string) {
		// TODO Auto-generated method stub
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
