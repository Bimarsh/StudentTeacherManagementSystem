<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="edit" method="post" modelAttribute="editStudentForm">
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${student.name}"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" value="${student.address}"></td>
			<tr>
			<tr>
				<td>Marks</td>
				<td><input type="text" name="grade" value="${student.grade}"></td>
			<tr>
				<td><input type="hidden" name="id" value="${student.id}"><input
					type="submit" value="Update Student"></td>
			</tr>
		</table>
	</form>

</body>
</html>