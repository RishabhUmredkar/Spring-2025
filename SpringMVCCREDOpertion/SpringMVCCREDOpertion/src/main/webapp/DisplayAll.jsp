<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="border-collapse:collapse; width :100%">
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>CONTACT</td>
			<td>LOCATIO</td>
			<td>UPDATE</td>
			<td>DELETE</td>
		</tr>
		<c:forEach var="emp" items="${employees}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.contact}</td>
				<td>${emp.location}</td>
				<td> <a href="edit?id=${emp.id}"><button style="background-color:green;color.white;">Update</button></a></td>
				<td> <a href="delete?id=${emp.id}"><button style="background-color:red;color.white;">Delete</button></a> </td>
			</tr>

		</c:forEach>
		
	</table>
</body>
</html>