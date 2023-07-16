<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${singleFourt.name}</p>


<form action="update.do" method="POST" id="formSave">
<input type="hidden" name="id" value="${singleFourt.id}" />
Name: <input type = "text" name="name" value= "${singleFourt.name}"><br>
Altitude: <input type="text" name="altitude" value= "${singleFourt.altitude }" /><br>
Mountain Range: <input type="text" name="mountainRange" value= "${singleFourt.mountainRange}" /><br>
<button type="submit">Submit Changes</button>
</form>
<br>

<form action="delete.do" method="POST">
	<p>Do you want to delete this Fourteener?</p>
	<input type="hidden" name="id" value="${singleFourt.id}" />
	<button type="submit">Delete</button>
	<br>
</form>

</body>
</html>