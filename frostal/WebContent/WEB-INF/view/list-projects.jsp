<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<title>Air Liquide FROSTAL® - List of projects</title>

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





	<a href="">
		<div align="center">
			<img
				src="${pageContext.request.contextPath}/resources/img/frostal_list.png"
				alt="">
		</div>
	</a>


	<div id="container">
		<div id="content">

			<!-- buttons -->
			<div class="btn-group" role="group">
				<input type="button" value="Add Project"
					onclick="window.location.href='showFormForAdd'; return false;"
					class="add-button" />

				<!-- Logout button

				<form action="logout">
					<input type="submit" value="Logout" class="add-button">
				</form> -->
			</div>

			<!--  add a search box -->
			<div align="center">
				<form:form action="search" method="POST">
                Search project: <input type="text" name="theSearchName" />

					<input type="submit" value="Search" class="add-button" />
				</form:form>
			</div>

			<!-- bootstrap -->
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Company Name</th>
						<th scope="col">Product Name</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<!-- loop over and print out projects -->
					<c:forEach var="tempProjects" items="${project}">

						<!-- construct an "update" link with project id -->
						<c:url var="updateLink" value="/projects/showFormForUpdate">
							<c:param name="projectId" value="${tempProjects.id}" />
						</c:url>

						<!-- construct an "results" link with project id -->
						<c:url var="resultsLink" value="/projects/showResults">
							<c:param name="projectId" value="${tempProjects.id}" />
						</c:url>

						<!-- construct an "delete" link with project id -->
						<c:url var="deleteLink" value="/projects/delete">
							<c:param name="projectId" value="${tempProjects.id}" />
						</c:url>
						<tr>
							<td>${tempProjects.company_name}</td>
							<td>${tempProjects.product_name}</td>

							<!-- display the update link -->
							<td><a href="${resultsLink}">Results</a> | <a
								href="${updateLink}">Update</a> | <a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this project?'))) return false">Delete</a>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>





		</div>

	</div>

	<div align="center">
		<p class="mt-5 mb-3 text-muted">Banana-Brain © 2018</p>
	</div>

</body>


</html>