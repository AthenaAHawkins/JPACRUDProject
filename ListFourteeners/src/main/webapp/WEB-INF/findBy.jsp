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


<p style="justify-content:center; display: flex;">Find a Fourteener by Id: </p>
<form style="justify-content:center; display: flex;" action = "findById.do" method = "POST">
<input type="text" name="id"><br>
<button>Find by Id</button>
</form><br><br> 

<p style="justify-content:center; display: flex;">Find a Fourteener by Keyword: </p>
<form style="justify-content:center; display: flex;" action = "findByKeyword.do" method = "POST">
<input type="text" name="findByKeyword"><br>
<button>Find by keyword</button>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>