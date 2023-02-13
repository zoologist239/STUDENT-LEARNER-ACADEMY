package userManagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogIn_Page
 */
("/LogIn_Page")
public interface LogIn_Page {
	static final long serialVersionUID = 1L;

	 void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (email.equals("example@gmail.com") && password.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("Home_Page.jsp");
			rd.forward(request, response);

		} else {
			out.print("<p style='color:red;'>Invalid Email & Password</p>");
			RequestDispatcher rd = request.getRequestDispatcher("SignIn-Page.jsp");
			rd.include(request, response);
		}out.close();
	}
}
