<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/registration.css" />">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registration" method="post">
  <h2>Sign Up</h2>
		<p>
			<label for="Email" class="floatLabel">Email</label>
			<input id="Email" name="Email" type="text">
		</p>
		<p>
			<label for="password" class="floatLabel">Password</label>
			<input id="password" name="password" type="password">
			
		</p>
		<p>
			<label for="phonenumber" class="floatLabel">Phonenumber</label>
			<input id="phonenumber" name="phonenumber" type="text">
					</p>
		<p>
		<a href="Home.jsp"><input class="btn btn--form" type="submit" value="Register" /></a>
		</p>
		
	</form>
</body>
</html>