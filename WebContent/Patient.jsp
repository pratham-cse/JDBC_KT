<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.pk.hos.model.Doctor" %>
 <%@page import="java.util.List"%>
 <%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome <%=request.getAttribute("pname") %> </h3>
<% List doctorss=(List) request.getAttribute("dlist"); %>
<table border="1"">
 
 <tr>
 <th scope="col">Doctor ID</th>
 <th scope="col">Doctor Name</th>
 <th scope="col">Doctor Fee</th>
 <th scope="col">Doctor Description</th>
 
 </tr>
 
<%Iterator<Doctor> iterator = doctorss.iterator(); %>
<%while(iterator.hasNext()) {%>
 <%Doctor d = iterator.next(); %>
 
            <tr> 
            	<td><%=d.getDid()%></td>
                <td><%=d.getDname()%></td> 
                <td><%=d.getFee()%></td>
                <td><%=d.getDescription()%></td> 
            </tr> 
<%}%> 
</table>
<form action="BookAppointment" method="post">
<input type="text" name="Dname">Doctor Name<br>
<input type="submit" value="Book Appointment">
</form><br>

<br>
<br><form action="Logout" method="post">
<input type="submit" name="Logout">
</form><br>

</body>
</html>