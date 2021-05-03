<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2  align="center" style="color:red;"> Durga Sfotware Solutions</h2>
<h3 align="center" style="color:blue;">Student Search Form</h3>

<center>
<form method="POST" action="update">
<table>
<tr><td>Student Sid</td>
<td>${student.sid }</td>
</tr>

<tr> 
<td>Student Name</td>
<td><input type ="text" name="sname" value='${student.sname}'></td>
</tr>



<tr> 
<td>Student Address</td>
<td><input type ="text" name="sname" value='${student.saddr}'></td>
</tr>



<tr>
<td><input type="submit" value="UPDATE	"></td></tr>

</table>

<input type="hidden" name="sid" value="${student.sid}"/>	
		</form>

</center>
</body>
</html>