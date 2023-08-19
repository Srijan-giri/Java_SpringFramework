<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
    <h1>${Header }</h1>
    <p>${Desc }</p>
    <hr>
   <h2>Welcome , ${user.userName}</h2>
   <h2>Your email address is ${user.email}</h2>
   <h2>Your password is ${user.password}, try to secure the password</h2>
</body>
</html>