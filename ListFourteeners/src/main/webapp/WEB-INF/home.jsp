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
<h1>COLORADO FOURTEENERS</h1>

<a href = "createForm.do">create a new Fourteener</a><br>

<c:forEach var="mountain" items="${fourteeners}">
<li>${mountain.name}</li>
</c:forEach>

<form action = "findById.do" method = "POST">
<input type="text" name="findById"><br>
<button>Find by Id</button>
</form>


</body>
</html>