<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:rgb(224, 255, 255);">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.do">HOME</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
          <button class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Menu
          </button>
          <ul class="dropdown-menu dropdown-menu-dark">
            <li><a class="dropdown-item" href="findBy.do">Find By Id or Keyword</a></li>
            <li><a class="dropdown-item" href="listOf14s.do">Listed 14rs</a></li>
            <li><a class="dropdown-item" href="createForm.do">Create a missing 14r</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>


<c:forEach var="mountain" items="${someFourts}">
  <li><a href="displayAllInfo.do?id=${mountain.id}">${mountain.name}</a></li>
</c:forEach>


<form action="update.do" method="POST" id="formSave">
<input type="hidden" name="id" value="${singleFourt.id}" />
Name: <input type = "text" name="name" value= "${singleFourt.name}"><br>
Altitude: <input type="text" name="altitude" value= "${singleFourt.altitude }" /><br>
Mountain Range: <input type="text" name="mountainRange" value= "${singleFourt.mountainRange}" /><br>
Park / Forest: <input type="text" name="parkForest" value= "${singleFourt.parkForest}" /><br>
Number of Routes: <input type="text" name="numOfRoutes" value= "${singleFourt.numOfRoutes}" /><br>
Standard Difficulty: <input type="text" name="standardDifficulty" value= "${singleFourt.standardDifficulty}" /><br>
Standard Distance: <input type="text" name="standardDistance" value= "${singleFourt.standardDistance}" /><br>
Standard Elevation Gain: <input type="text" name="standardElevGain" value= "${singleFourt.standardElevGain}" /><br>


<button type="submit">Submit Changes</button>
</form>
<br>

<form action="delete.do" method="POST">
	<p>Do you want to delete this Fourteener?</p>
	<input type="hidden" name="id" value="${singleFourt.id}" />
	<button type="submit">Delete</button>
	<br>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>