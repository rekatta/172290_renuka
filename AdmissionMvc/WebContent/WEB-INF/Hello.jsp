<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="display.html">
UserId:<input type="number" name="username" >
Mobile:<input type="number" name="mobile" >
Date of Booking:<input type="date" name="date">
models:<select name="models" multiple>
<option  value="SamsungS10">SamsungS10</option>
<option  value="iPhoneXs Max">iPhoneXs Max</option>
<option  value="GooglePixel">GooglePixel</option>
</select>
FirstName:<input type="text" name="userinfo.firstname">
LastName:<input type="text" name="userinfo.lastname">
City:<input type="text" name="userinfo.city">
<input type="submit" value="Click">
</form>
</body>
</html>