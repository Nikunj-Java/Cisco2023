<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Implicit Objects Example</h1>

<%
String resp= request.getParameter("office");

if(resp!=null){
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "response-redirect.jsp?office="+resp);
}
%>

<%
String error=request.getParameter("error");

if(error!=null){
	throw new RuntimeException("Exception Occured");
}
%>


<a href="implicit.jsp?office=head_office">Check Use of Response Object</a>

<br>
<br>

<a href="implicit.jsp?error=1">USe of Exception Object</a>

 

</body>
</html>