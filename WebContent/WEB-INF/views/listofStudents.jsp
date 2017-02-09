<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="text-align:center">
	<table border="1">
		<th>id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Action</th>
		</tr>sdas
		<c:forEach var="ps" items="${list}">
			<tr>
			    <td><c:out value="${ps.id}"></c:out></td>
				<td><c:out value="${ps.name}"></c:out></td>
				<td><c:out value="${ps.address}"></c:out></td>
				<td><a href="edit?id=<c:out value="${ps.id}"></c:out>">Edit Student</a> <a href="delete?id=<c:out value="${ps.id}"></c:out>">Delete Student</a></td>
			</tr>
		</c:forEach>
		</tr>
	</table>
</body>
</html>