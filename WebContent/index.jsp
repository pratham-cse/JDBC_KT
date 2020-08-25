<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<body>
<h1>Welcome to Login page of Hospital Managemnt System</h1>
<form action="PatientServlet" method="post">
Patient name:<input type="text" name="Pname"><br>
Password:<input type="password" name="Ppassword"><br>
<input type="submit" name ="Login" value="submit" >
</form>
<br>
<h3>Login as a Guest</h3>
<form action="GuestServlet" method="post">
Patient name:<input type="text" name="Gname"><br>
<input type="submit"  name=" Login as a guest" value="submit">
</form><br>
<form action="DoctorServlet" method="post">
Doctor name:<input type="text" name="Dname"><br>
Password:<input type="password" name="Dpassword"><br>
<input type="submit"  name="Login" value="submit">
</form>

</body>
</html>


