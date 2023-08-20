<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page isELIgnored = "false" %>
 <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<%-- <%
    String name = (String) request.getAttribute("name");
    Integer roll = (Integer) request.getAttribute("rollnumber");
    LocalDateTime time= (LocalDateTime)request.getAttribute("time");

%>
     --%>
    <h2>This is help page</h2>
    <h2>Hello My name is
<%--      <%=name %> --%>
      ${name}
     </h2>
    <h2>Roll Number is 
   <%--  <%=roll %> --%>
   ${rollnumber }
    </h2>
    <h2>Date and Time : 
    <%-- <%=time.toString() %> --%>
    ${time}
    </h2>
    
    <hr>
    
    <%-- ${marks } --%>
    <c:forEach var="items" items="${marks }">
        <%-- <h1>${items }</h1> --%>
             <h1><c:out value="${items}"></c:out></h1> 
    </c:forEach>
    
    
    
</body>
</html>