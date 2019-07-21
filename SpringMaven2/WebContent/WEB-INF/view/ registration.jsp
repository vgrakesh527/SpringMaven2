<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h2>Form Registration</h2>
<body>
<form:form method="POST" modelAttribute="person">
	<form:input path="pid" type="hidden" id="pid"/>
	<table>
		<tr>
			<td><label for="name">Name</label></td>
			<td><form:input path="name" id="name"/>
		</tr>
		<tr>
			<td><label for="salary">Salary</label></td>
			<td><form:input path="salary" id="salary"/>
		</tr>
	</table>
	<input type="submit" value="Save"/>
</form:form>
</body>
</html>