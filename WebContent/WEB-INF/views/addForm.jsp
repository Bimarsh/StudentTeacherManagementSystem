<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post" modelAttribute="addStudentForm">
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"> </td>
			<tr>
			<tr>
				<td>Grade</td>
				<td><input type="text" name="grade" "></td>
				
			</tr>
			<tr>
				<td><input
					type="submit" value="Insert"></td>
			</tr>	
			
		</table>
	</form>

</body>
</html>