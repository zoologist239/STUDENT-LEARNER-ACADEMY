package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerRuntimeException;

import javax.servlet.ServletResponse;
@servlet.calculator.WebServlet("/Loginpage")
public class LogIn_page extends servlet.calculator.HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings({ "hiding", "deprecation" })
	protected <HttpServletRequest, HttpServletRequest1> void doPost(servlet.calculator.HttpServlet request, HttpServlet response) throws ServerRuntimeException, IOException {
		// responding type set for web page
		((ServletResponse) response).setContentType("text/html");
		PrintWriter out = ((ServletResponse) response).getWriter();
		// taking input from user
		String name =((servlet.calculator.HttpServlet) request).getParameter("name");
		String email = ((servlet.calculator.HttpServlet) request).getParameter("email");
		String password = request.getParameter("password");
		//applying condition if email match to demo@gmail.com and password 123 then go ahead for calculator html page
		if (email.equals("dankolym@gmail.com") && password.equals("12345")) {
			request.getRequestDispatcher("Calculator.html");
		}else {
			//if condition not match then print invalid message
			out.print("<h3 style ='color : red;'>Invalid Email or Password</h3>");
			//here we are using include method to show message on same page login.html page
			servlet.calculator.RequestDispatcher rd = request.getRequestDispatcher("LogIn-page.html");
		}out.close();
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
