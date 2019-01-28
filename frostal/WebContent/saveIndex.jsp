<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Air Liquide FROSTAL® Login</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" />
</head>

<body>
<div class="form-container">
<div class="logo-img"></div>
<ul class="list">
<li><h2>FROSTAL® Login</h2></li>
<li><input type="text" name="user name" placeholder="user name"></li>
<li><input type="password" name="password" placeholder="............"></li>
<li><input type="button" name="submit" value="submit"></li>
<li>Forget Password?</li>
</ul>

</div>
</body>

</html>