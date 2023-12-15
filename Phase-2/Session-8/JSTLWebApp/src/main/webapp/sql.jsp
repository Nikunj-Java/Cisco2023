<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/cisco1" user="root"
		password="Nikunj@123" />

	<sql:query var="rs" dataSource="${db}">
select * from student
</sql:query>

	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Username</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${rs.rows}">
				<tr>
					<td><c:out value="${student.id }"></c:out></td>
					<td><c:out value="${student.name }"></c:out></td>
					<td><c:out value="${student.email }"></c:out></td>
					<td><c:out value="${student.username }"></c:out></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>


</body>
</html>