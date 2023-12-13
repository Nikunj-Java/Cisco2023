<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


<a href="implicit.jsp?office=head_office">Check Use of Response Object</a>

</body>
</html>