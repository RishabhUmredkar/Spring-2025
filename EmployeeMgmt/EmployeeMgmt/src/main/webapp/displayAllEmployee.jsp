<%@page import="com.qsp.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Phone</th>
<th>Salary</th>
<th>Update</th>
<th>Delete</th>

</tr>


<c:forEach var="employee" items="${emp}">
	<tr>
		<td>${employee.id}</td>
		<td>${employee.name}</td>
		<td>${employee.phone}</td>
		<td>${employee.salary}</td>
		<td><a href="delete?id=${employee.id}"><button>Delete</button></a></td>
	</tr>
	
</c:forEach>
<%
List<Employee> employees =(List<Employee>) session.getAttribute("emp");
for(Employee emp : employees)
{%>
<tr>
<td><%=emp.getId() %></td>
<td><%=emp.getName() %></td>
<td><%=emp.getPhone() %></td>
<td><%=emp.getSalary() %></td>
</tr>
<%}
%>
</table>
</body>
</html>