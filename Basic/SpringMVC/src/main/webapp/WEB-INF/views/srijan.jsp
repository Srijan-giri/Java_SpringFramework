<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Srijan</title>
</head>
<body>
<%
  List<String> h = (List<String>)request.getAttribute("hobbies");
   LocalDateTime time =( LocalDateTime)request.getAttribute("time");
%>
    <h1>Welcome Srijan</h1>
    <%
      for(String s :h){
    %>
      <h3><%=s %></h3>
    <%
      }
    %>
    
    <h3>Date and Time is <%=time %></h3>
</body>
</html>