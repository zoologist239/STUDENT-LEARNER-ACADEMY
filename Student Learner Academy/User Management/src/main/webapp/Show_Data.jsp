<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="servlet.jdbc.ConnectionClass.ConnectionProvider"%>
<%@page import="servlet.jdbc.input.ShowStudentData"%>
<%@page import="servlet.jdbc.StudentDAO.StudentDAO"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Display</title>
</head>
<style>
body {
	border-style:double; padding: 5mm;border-radius:5mm; 
}
</style>
<body>
<%@ include file="Main-Header.jsp" %>
<%@ include file="Menu.jsp" %>
<form action="ShowStudentData" method="post">
<h1>show data</h1>
<p>Double tap on show data to refresh page</p>
<table style="color: blue; border-color: blue;" border="1">
<tr style="color: white; background-color:blue; ">
	    <th>Student ID</th>
	    <th>Name</th>
	    <th>Contact</th>
	    <th>Email</th>
	    <th>Course</th>
	    <th>Batch Timing</th>
	    <th>Update Data</th>  
</tr>
<%
try{
	String ShowData = "select * from student_detail";
	Connection conn=ConnectionProvider.CreateConnection();
	Statement stmt= conn.createStatement();
	ResultSet rs=stmt.executeQuery(ShowData);
	  
	while(rs.next()){
		%> <tr style="color: black;">
    <td><%= rs.getInt(1)%></td>
    <td><%= rs.getString(2)%></td>
    <td><%= rs.getString(3)%></td>
    <td><%= rs.getString(4)%></td>
    <td><%= rs.getString(5)%></td>
    <td><%= rs.getString(6)%></td>
    <td><a href="UpdateStudent.jsp">Edit</a></td>    
    </tr>
<%
	}
}catch(Exception e){
	out.print(e);
}
%>
</table>
</form>
</body>
</html>