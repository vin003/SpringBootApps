<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"></jsp:include>
<br><br><br><br>

<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<br> <br>

<h3 style="color:blue;" align="center">Student Details</h3>

<center>
<table border="1">
<tr><td>Student Id</td><td> ${student.sid}</td></tr>

<tr><td>Student Name </td><td>${student.sname}</td></tr>
<tr><td>Student Adddress </td><td>${student.saddr}</td></tr>

</table>
</center>

</body>
</html>