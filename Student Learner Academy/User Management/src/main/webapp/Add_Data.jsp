<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Data</title>
</head>
<style>
body {
	border-style:double; padding: 5mm;border-radius:5mm; 
}
</style>
<body>
<%@ include file="Main-Header.jsp" %>
<%@ include file="Menu.jsp" %>
<form action="StudentRegisteration"  method="post">

<p style="color: orange;">Fill Student Detail</p>
<hr style="color: purple;">
<img alt="add image" src="student-working-laptop-white-background.webp" height="300" width="450" align="right">
<b>Student Name</b><br>
<input type="text" name="name" size="30"><br>
<b>Student Contact Number</b><br>
<input type="text" name="contact" size="30"><br>
<b>Student Email</b><br>
<input type="email" name="email" size="30"><br>
<b>Select Course</b><br>
<select name="course">
<option >----</option>
<option>Java</option>
<option>Python</option>
<option>Php</option>
<option>JavaScript</option>
</select><br>
<b>Select Batch Type</b><br>
<select name="batch">
<option>Regular</option>
<option>WeekEnd</option>
</select><br><br>
<input type="submit" value="Register">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Clear All">
</form>
</body>
</html>