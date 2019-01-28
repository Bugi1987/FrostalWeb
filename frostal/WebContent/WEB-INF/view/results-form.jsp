<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>

<title>Air Liquide FROSTAL® - Results</title>

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

		<div align=center>
			<h3>Project summary</h3>
		</div>


		<form:form action="saveProject" modelAttribute="project" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />




			<table class="table">
				<thead>
					<tr>
						<th scope="col">Company name</th>
						<th scope="col">Company address</th>
						<th scope="col">Product name</th>
					</tr>
				</thead>

				<tbody>

					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="company_name" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="company_address" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="product_name" />
								</fieldset>
							</form></td>
					</tr>

				</tbody>

				<thead>
					<tr>
						<th scope="col">Production(kG/h)</th>
						<th scope="col">Production(h/day)</th>
						<th scope="col">Production(days/year)</th>
						<th scope="col">Startups(per year)</th>
						<th scope="col">Annual production(tonns)</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="production_kg_per_h" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="production_hours_per_day" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="production_days_per_year" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="startups_per_year" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="annual_production" />
								</fieldset>
							</form></td>
					</tr>
				</tbody>

				<thead>
					<tr>
						<th scope="col">Water content</th>
						<th scope="col">Fat content</th>
						<th scope="col">Dry matter content</th>
						<th scope="col">Infeed temperature</th>
						<th scope="col">Outfeed temperature</th>
						<th scope="col">Temperature difference</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="water_con" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="fat_con" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="dryMatter_con" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="infeed_temp" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="outfeed_temp" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="temp_diff" />
								</fieldset>
							</form></td>
					</tr>
				</tbody>

				<thead>
					<tr>
						<th scope="col">Product length</th>
						<th scope="col">Clearance (length)</th>
						<th scope="col">Product width</th>
						<th scope="col">Clearance (width)</th>
						<th scope="col">Product height</th>
						<th scope="col">Product weight</th>
						<th scope="col">Estimated retention time</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="product_length" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="clearance_length" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="product_width" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="clearance_width" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="product_height" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="product_weight" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="est_ret_time" />
								</fieldset>
							</form></td>
					</tr>

				</tbody>


				<thead>
					<tr>
						<th scope="col">Theoretical LIN consumption per kG of product</th>
						<th scope="col">Start up consumption per kG of product</th>
						<th scope="col">Idling consumption per kG of product</th>


					</tr>
				</thead>
				<tbody>
					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="theo_lin_cons" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="startup_cons" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="idling_cons" />
								</fieldset>
							</form></td>

					</tr>

				</tbody>
				<thead>
					<tr>
						<th scope="col">Total LIN consumption per kG of product</th>
						<th scope="col">Total LIN consumption per year</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><form>
								<fieldset disabled>
									<form:input path="total_lin_kg" />
								</fieldset>
							</form></td>
						<td><form>
								<fieldset disabled>
									<form:input path="total_lin_year" />
								</fieldset>
							</form></td>
					</tr>

				</tbody>


			</table>

		</form:form>


		<div style=""></div>




	</div>
	<div align="center">
		<p class="mt-5 mb-3 text-muted">Banana-Brain © 2018</p>
	</div>

</body>
</html>