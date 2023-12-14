<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set value="Welcome User" var="str1"></c:set>

${fn:toLowerCase(str1)}<br>
${fn:toUpperCase(str1)}<br>

<c:set value="${fn:toUpperCase(str1)}" var="newstr"></c:set>

NewString: ${newstr}<br>


<c:set var="split" value="${fn:split(newstr,' ')}"></c:set>
<c:set var="join" value="${fn:join(split,'_')}"></c:set>

NewString After Join: ${join} <br>


</body>
</html>