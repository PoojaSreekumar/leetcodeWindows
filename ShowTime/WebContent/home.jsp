<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.io.*,java.util.*, javax.servlet.*, java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Current date and  time is</h1>
<%
LocalDateTime instance = LocalDateTime.now();


	out.print(instance);
%>
</body>
</html>