package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.text.ParseException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
@SuppressWarnings("unused")
@servlet.calculator.WebServlet("Calculator")
public class Calculator extends servlet.calculator.HttpServlet {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	private static final char[] text = null;

	protected void doPost(HttpRequest request, HttpServlet response)
			throws ParseException, IOException {
		// first taking input from user
		String input1 = ((ServletRequest) request).getParameter("input1");
		String input2 = ((ServletRequest) request).getParameter("input2");
		String result = ((ServletRequest) request).getParameter("result");
		// converting string to double data type -> mainly aim to convert in numeric
		// value to perform operation
		double value1 = Double.parseDouble(input1);
		double value2 = Double.parseDouble(input2);
		// responding type set for web page
		response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
		  response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
		  response.getWriter().write(text);       // Write response body.();
		// logic creation
		if (result.equals("/")) {
			double ans = value1 / value2;
			System.out.println("<h2>Divided Result is : " + ans + "</h2>");
		} else if (result.equals("*")) {
			double ans = value1 * value2;
			System.out.println("<h2>Multiplied Result is : " + ans + "</h2>");
		} else if (result.equals("+")) {
			double ans = value1 + value2;
			System.out.println("<h2>Added Result is : " + ans + "</h2>");
		} else if (result.equals("-")) {
			double ans = value1 - value2;
			System.out.println("<h2>Subtracted Result is : " + ans + "</h2>");
		}
		//using href tag to go back on calculator.html page
		System.out.println("<h2><a href='Calculator.html'>Go to Back</a></h2>");
		//closing to take user input
		System.out.close();
	}
}
