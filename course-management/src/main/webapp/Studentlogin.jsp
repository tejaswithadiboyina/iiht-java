<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Login</h1>
<form action="/student/studentLogin" method="post"><br>
UserName:<input type="text" name ="uname"><br>
Password:<input type="password" name ="password">
<br>
<input type="submit" value="login"><br>
new student ?<a href="/student/RegisterStudent">Register here</a>
                       
</form>
</body>
</html>
