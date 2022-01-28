<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
	let msg = '${msg}'
	console.log(msg);
	if(msg != ""){
		alert(msg);
	}
</script>
<body>
	<form action="getUser">
		<h1>Login</h1>
		<label>User</label><br>
		<input type="text" name="userName"
			value="<%=session.getAttribute("userName") != null && !session.getAttribute("userName").toString().isEmpty() ? session.getAttribute("userName") : ""%>"><br>
		<label>Password</label><br>
		<input type="text" name="userPass"><br>
		<input type="submit" formmethod="post">
	</form>
</body>
</html>