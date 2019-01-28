<!DOCTYPE html>

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Cryogenic Projects Manager">
<meta name="author" content="Banana-Brain">

<title>Air Liquide FROSTAL® Log in</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- CSS -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/signin.css" />
</head>

<body class="text-center">
	<form action="Login" method="post" class="form-signin">
		<img class="mb-4" src="./resources/img/intro.png" alt="" width="280"
			height="341">

		<h1 class="h3 mb-3 font-weight-normal">Please log in</h1>


		<label for="inputLogin" class="sr-only">Login</label> <input
			type="login" name="uname" class="form-control" placeholder="Login"
			required="" autofocus=""> <label for="inputPassword"
			class="sr-only">Password</label> <input type="password" name="pass"
			class="form-control" placeholder="Password" required="">
		<button class="btn btn-lg btn-primary btn-block" type="submit"
			value="login">Log in</button>

		<p class="mt-5 mb-3 text-muted">Banana-Brain © 2018</p>
	</form>


</body>
</html>