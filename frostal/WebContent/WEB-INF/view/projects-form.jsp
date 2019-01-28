<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>

<title>Air Liquide FROSTAL® - Save Project</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!--  reference our style sheet -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<!-- checking if logged in -->

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1

		response.setHeader("Pragma", "no-cache"); // HTTP 1.0

		response.setHeader("Expires", "0"); // Proxies

		if (session.getAttribute("username") == null) {
			response.sendRedirect("/frostal/index.jsp");
		}
	%>

	<!-- img -->
	<a href="">
		<div align="center">
			<img
				src="${pageContext.request.contextPath}/resources/img/frostal_list.png"
				alt="">
		</div>
	</a>

	<!-- buttons -->
	<div class="btn-group" role="group">

		<form action="logout">
			<input type="submit" value="Logout" class="add-button">
		</form>

		<input type="button" value="Back to list"
			onclick="window.location.href='${pageContext.request.contextPath}/projects/list'; return false;"
			class="add-button" />
	</div>


	<div id="container">
		<h3>Save Project</h3>

		<form:form action="saveProject" modelAttribute="project" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table class="table">
				<tbody>
					<tr>

						<td><label>Company name:</label></td>
						<td><form:input path="company_name" /></td>

						<td><label>Company address:</label></td>
						<td><form:input path="company_address" /></td>

						<td><label>Product name:</label></td>
						<td><form:input path="product_name" /></td>
					</tr>
					<tr>
						<td><label>Production(kG/h):</label></td>
						<td><form:input path="production_kg_per_h" /></td>

						<td><label>Production(h/day):</label></td>
						<td><form:input path="production_hours_per_day" /></td>

						<td><label>Production(days/year):</label></td>
						<td><form:input path="production_days_per_year" /></td>

						<td><label>Startups(per year):</label></td>
						<td><form:input path="startups_per_year" /></td>
					</tr>
					<tr>
						<td><label>Water content:</label></td>
						<td><form:input path="water_con" /></td>

						<td><label>Fat content:</label></td>
						<td><form:input path="fat_con" /></td>

						<td><label>Infeed temperature:</label></td>
						<td><form:input path="infeed_temp" /></td>

						<td><label>Outfeed temperature:</label></td>
						<td><form:input path="outfeed_temp" /></td>
					</tr>
					<tr>
						<td><label>Product length:</label></td>
						<td><form:input path="product_length" /></td>

						<td><label>Clearance (length):</label></td>
						<td><form:input path="clearance_length" /></td>

						<td><label>Product width:</label></td>
						<td><form:input path="product_width" /></td>

						<td><label>Clearance (width):</label></td>
						<td><form:input path="clearance_width" /></td>
					</tr>
					<tr>
						<td><label>Product height:</label></td>
						<td><form:input path="product_height" /></td>

						<td><label>Product weight:</label></td>
						<td><form:input path="product_weight" /></td>

						<td><label>Estimated retention time:</label></td>
						<td><form:input path="est_ret_time" /></td>
					</tr>

				</tbody>

			</table>
<p> </p>

			<div class="btn-group" role="group">

				<form action="save">
					<input type="submit" value="Save" class="add-button">
				</form>

			</div>

		</form:form>





	</div>

	<div align="center">
		<p class="mt-5 mb-3 text-muted">Banana-Brain © 2018</p>
	</div>
</body>
</html>