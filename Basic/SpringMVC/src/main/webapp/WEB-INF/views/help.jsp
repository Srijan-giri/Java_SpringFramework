<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<%
/*   String name = (String)request.getAttribute("name");
  Integer roll = (Integer)request.getAttribute("roll_number");
  String time = (String)request.getAttribute("time").toString(); */
%>
  <h1>Hello My name is
  ${name}
   
  </h1>
  <h1>my rollnumber is
  ${roll_number}
   
  </h1>
  
  <h1>Date and Time is 
  ${time}
  </h1>
  
  <hr>
  
  <c:forEach var="item" items="${marks}">
      
       <%-- <h1>${item}</h1> --%>
      <h1><c:out value="${item}"></c:out></h1> 
  
  
  </c:forEach>
  
  
  
  
  
</body>
</html>