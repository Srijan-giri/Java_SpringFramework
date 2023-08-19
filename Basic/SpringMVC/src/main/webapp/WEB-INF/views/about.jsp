<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
<%
  String name = (String)request.getAttribute("name");
  String stream = (String)request.getAttribute("stream");
  String semester = (String)request.getAttribute("SEM");
  String job = (String)request.getAttribute("job");
%>
  <h1>Personal Details</h1>
  <h3>Name = <%=name %></h3>
  <h3>Stream = <%=stream %></h3>
  <h3>Semester = <%=semester %></h3>
  <h3>Job = <%=job %></h3>
</body>
</html>