<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'Hello'}"></c:out>

<c:set var="input" value="${300*100}"></c:set>
<c:out value="${input }"></c:out>


<!-- Just like If and Else -->

<c:choose>
	<c:when test="${input>=4000}">
	Income Is Good
	</c:when>
	<c:otherwise>
	Income is Not Good
	</c:otherwise>

</c:choose>

<!-- Error Handling -->

<c:catch var="error">
<% int x=10/0; %>
</c:catch>

<c:if test="${error!=null}">
The Exception is ${error}<br>
Message:${error.message}
</c:if>
</body>
</html>