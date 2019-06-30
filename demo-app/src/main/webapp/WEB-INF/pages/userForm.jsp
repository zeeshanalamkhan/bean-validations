<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test App</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h2>User Input From</h2>
	<hr />
	<form:form action="saveUser" method="post" modelAttribute="user">
		<table>
			<tr>
				<th>Name</th>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>
			<tr>
				<th>MobileNo</th>
				<td><form:input path="mobileNo" /> <form:errors
						path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				<th>DOB</th>
				<td><form:input path="dob" /> <form:errors path="dob"
						cssClass="error" /></td>
			</tr>

			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>