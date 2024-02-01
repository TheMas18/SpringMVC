<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<!-- 	<h1>Hello Mas</h1> -->
	<h1>This is Home Page</h1>
	<%
	String name = (String) request.getAttribute("name");
	List<String> frnds = (List<String>) request.getAttribute("f");
	%>

	<h1>
		Hello
		<%=name%></h1>
	<h3>
		<%
		for (String s : frnds) {
		%>
		<h3>
			<%
			out.println(s);
			%><br>
		</h3>
		<%
		}
		%>

	</h3>
</body>
</html>