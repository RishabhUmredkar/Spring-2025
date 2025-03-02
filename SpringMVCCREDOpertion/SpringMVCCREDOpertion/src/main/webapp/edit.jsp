<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="update" modelAttribute="emp" method="get">
		<form:input path="id"/>
		<form:input path="name"/>
		<form:input path="contact"/>
		<form:input path="location"/>
		<button>update</button>
	</form:form>
</body>
</html>