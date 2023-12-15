<%@page import="java.util.Date"%>
<%@page info="This is my page info" %>
<%@page buffer="16kb" %>
<%@page isThreadSafe="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= "Today is Date"+new Date() %>

<br><br>

<h2>Expression Language</h2>
${'Hello World' }

<br>
<br>

<%@include file="index.jsp" %>
<br><br>
<%@include file="test.jsp" %>

</body>
</html>