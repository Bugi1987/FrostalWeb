<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Air Liquide FROSTAL® Login</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" />
</head>

<body>

<div class="logo-img"></div>

<div class="form-container">

<ul class="list">
<form action="Login">
<li><h2>FROSTAL® Login</h2></li>
<li><input type="text" name="uname" placeholder="user name"></li>
<li><input type="password" name="pass" placeholder="password"></li>
<li><input type="button" name="submit" value="submit"></li>
</form>

</ul>

</div>
</body>

</html>