<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/loginPage.css" />">
</head>
<body>

    <div id="login">
      <form  action="validate" method="post"  name='form-login'>
        <span class="fontawesome-user"></span>
          <input type="text" name=user placeholder="Username">
          <%String rate=request.getParameter("star"); %>
          <%String comment=request.getParameter("name"); %>
         
      <input type="hidden" name="rate" value=<%=rate %>>
       <input type="hidden" name="comment" value=<%=comment %>>
        <span class="fontawesome-lock"></span>
          <input type="password" name=pass placeholder="Password">
        
        <input type="submit" value="Login">

</form>
</div>
</body>
</html>