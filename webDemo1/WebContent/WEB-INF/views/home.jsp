<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spittr</title>
</head>
<body>
	<a href="<c:url value="/spittles" />">Spittles</a> | 
	<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>