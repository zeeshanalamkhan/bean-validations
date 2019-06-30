<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test App</title>
</head>
<body>
	<h2>User Success From</h2>
	<hr />

	<table>
		<tr>
			<th>Name</th>
			<td>${user.name}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${user.email}</td>
		</tr>
		<tr>
			<th>Mobile No</th>
			<td>${user.mobileNo}</td>
		</tr>
		<tr>
			<th>DOB</th>
			<td>${user.dob}</td>
		</tr>
		<tr>
		<th>Age</th>
		<td>Days: </td><td>${days}</td></br>
		<td>Months: </td><td>${months}</td></br>
		<td>Years: </td><td>${years}</td>
		</tr>
	</table>
</body>
</html>