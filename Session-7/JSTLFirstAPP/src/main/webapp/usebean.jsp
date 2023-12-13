<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> UseBean Demo</h3>

<jsp:useBean id="object" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

<h4>Before Setting property</h4>

<br>
id: <jsp:getProperty property="id" name="object"/><br>
name: <jsp:getProperty property="name" name="object"/><br>
email: <jsp:getProperty property="email" name="object"/><br>
country: <jsp:getProperty property="country" name="object"/><br>

<br>
<br>
<hr>

<jsp:setProperty property="id" name="object" value="3"/>
<jsp:setProperty property="name" name="object" value="Nikunj"/>
<jsp:setProperty property="email" name="object" value="nikunj@gmail.com"/>
<jsp:setProperty property="country" name="object" value="india"/>


<br><br>

<h4>After Setting property</h4>

<br>
id: <jsp:getProperty property="id" name="object"/><br>
name: <jsp:getProperty property="name" name="object"/><br>
email: <jsp:getProperty property="email" name="object"/><br>
country: <jsp:getProperty property="country" name="object"/><br>


<br><br>

<a href="showbeans.jsp">Show Value in Another Page</a>

</body>
</html>