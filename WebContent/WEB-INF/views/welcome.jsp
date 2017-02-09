<%@page import="com.app.modal.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
User user= (User)session.getAttribute("user");
String message=(String)request.getAttribute("message");
%>
<table align="center">
<tr><td>Welcome ${sessionScope.user.username}</td></tr>
<tr><td>1. </td><td><a href="list">View List of Students</a></td></tr>
<tr><td>2. </td><td><a href="add">Add Students</a></td></tr>
</table>




</body>
</html>