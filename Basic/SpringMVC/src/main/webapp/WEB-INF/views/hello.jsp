<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
  <h1>This is home page</h1>
  <h1>Called by home controller</h1>
  <h1>url /home</h1>
  <h2>This is Hello.jsp</h2>
  
  <%
    String name = (String)request.getAttribute("name");
    Integer id = (Integer)request.getAttribute("id");
    List<String> friends =(List<String>)request.getAttribute("f");
  %>
  
  <h2>Id : <%=id %></h2>
  <h2>Name is <%=name %></h2>
<%--   <%
    for(String s : friends)
    {
    	out.println(s);
    }
  %> --%>
  
  <%
     for(String s : friends)
     {
  %>
    <h2><%=s %></h2>
  <%
     }
  %>

   <br>
   <hr>
  <a href="about">Click about</a>
</body>
</html>