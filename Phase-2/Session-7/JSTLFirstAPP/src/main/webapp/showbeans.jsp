<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="object" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

<h1>Display Property</h1>

<br>
id: <jsp:getProperty property="id" name="object"/><br>
name: <jsp:getProperty property="name" name="object"/><br>
email: <jsp:getProperty property="email" name="object"/><br>
country: <jsp:getProperty property="country" name="object"/><br>

</body>
</html>