<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploaded result ......</title>
</head>
<body>
   <h2>File Uploaded Result : </h2>
   <h2>${msg }</h2>
   <img alt="profile img" src="<c:url value="/pages/image/${filename }"></c:url>">
   
</body>
</html>