<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Data</title>
</head>
<style>
body {
	border-style:double; padding: 5mm;border-radius:5mm; 
}
</style>
<body>
<%@ include file="Main-Header.jsp" %>
<%@ include file="Menu.jsp" %>
<form action="DeleteStudent"  method="post">
<h1>Delete data</h1>
Enter ID <input type="text" name="id">
<input type="submit" value="ok">
</form>
</body>
</html>