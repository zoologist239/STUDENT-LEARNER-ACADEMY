package servlet.jdbc.input;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jdbc.StudentDAO.StudentDAO;

/**
 * Servlet implementation class DeleteStudent
 */
@servlet.calculator.WebServlet(value = "DeleteStudent")
public class DeleteStudent extends servlet.calculator.HttpServlet {
	public class RequestDispatcher {

		public void include(servlet.calculator.HttpServlet request, Object response) {
			// TODO Auto-generated method stub
			
		}

	}

	private static final long serialVersionUID = 1L;
	private servlet.calculator.HttpServlet request;
	private Object response;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *  response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	} 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		boolean ans = StudentDAO.DeleteStudentFromDB(id);

		((HttpServletResponse) response).setContentType("text/html");
		PrintWriter out = ((HttpServletResponse) response).getWriter();

		if (ans == true) {
			out.print("<h3>Successfully Deleted</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Delete_Data.jsp");
			rd.include(request, response);
		} else {
			out.print("<h3>Not Deleted</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Delete_Data.jsp");
			rd.include(request, response);
		}

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
