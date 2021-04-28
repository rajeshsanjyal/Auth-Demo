<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
		<h1>Signup Form</h1>
	<hr/>
	<form action="signup" method="post">
	FirstName<input type="text" name="firstName"/><br/><br/>
	LastName<input type="text" name="lastName"/><br/><br/>
	UserName<input type="text" name="userName"/><br/><br/>
	Email<input type="email" name="email"/><br/><br/>
	Password<input type="password" name="password"/><br/><br/>
	<input type="submit" value="Signup"/><br/><br/>
	<a href="index">Back to index Page</a>	
	</form>
	
</body>
</html>