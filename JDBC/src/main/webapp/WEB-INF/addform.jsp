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

<h1 style="color:red;" align="center">Student Add Details...</h1>
<center>
<form action="add" method="post">
<table>
<tr>
<td>Student Id</td>
<td><input type ="text" name="sid" placeholder="enter student Id"></td>
</tr>

<td>Student Name</td>
<td><input type ="text" name="sname" placeholder="enter student Name"></td>
</tr>

<td>Student Address</td>
<td><input type ="text" name="saddr" placeholder="enter student Address"></td>
</tr>


<tr>
<td><input type="submit" value="Add"></tr>

</table>


</form> </center>
</body>
</html>