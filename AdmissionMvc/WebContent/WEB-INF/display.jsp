<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>
<h1>Thanks for registering...</h1>
UserId is:<h4>${user.username}</h4>
Mobile number is:<h4>${user.mobile}</h4>
Model selected is:<h4>${user.models}</h4>
Mobile booked on:<h4>${user.date}</h4>
First name is:<h4>${user.userinfo.firstname}</h4>
Last name is:<h4>${user.userinfo.lastname}</h4>
your city is:<h4>${user.userinfo.city}</h4>
</body>
</html>