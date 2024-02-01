<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>This is Help Page</h1>
	<%
		String name=(String)request.getAttribute("name");
	LocalDateTime date=(LocalDateTime)request.getAttribute("date");
		
	%>
	<h1>Hello  <%=name %></h1><br>
	<h1>Date And Time :  <%=date %></h1>
</body>
</html>