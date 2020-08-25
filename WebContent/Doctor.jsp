<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.pk.hos.model.Patient" %>
 <%@page import="java.util.List"%>
 <%@page import="java.util.Iterator"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome <%=request.getAttribute("dname") %> </h3>

<% List patientss=(List) request.getAttribute("plist"); %>
<table border="1"">
 
 <tr>
 <th scope="col">Patient ID</th>
 <th scope="col">Patient Name</th>
 
 </tr>
 
<%Iterator<Patient> iterator = patientss.iterator(); %>
<%while(iterator.hasNext()) {%>
 <%Patient p = iterator.next(); %>
 
            <tr> 
            	<td><%=p.getPid()%></td>
                <td><%=p.getPname()%></td> 
            </tr> 
<%}%> 

<br>
<br><form action="Logout" method="post">
<input type="submit" name="Logout">
</form><br>
</table>
</body>
</html>