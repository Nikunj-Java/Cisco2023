<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String uname=request.getParameter("uname");
String upss=request.getParameter("upass");

if(uname.equals("admin") && upss.equals("admin123"))
{
	%> <jsp:forward page="success.jsp">
		<jsp:param value="<%=uname %>" name="user"/>
	</jsp:forward>
	<%}else{ %>
	<h3>Wrong Username and Password</h3>
	<jsp:include page="actionTags.jsp"></jsp:include>
<%} %>

</body>
</html>