<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cl.M5Grupal2Real.modelo.*"%>
<%@ page import="cl.M5Grupal2Real.implementacion.*"%>
<%@ page import="java.util.ArrayList"%>
<%
request.getRequestDispatcher("ValidarSesion").include(request, response);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Capacitacion Usando CapacitacioDAOImpl</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/estilo.css">
</head>
</head>
<body>
	<%@ include file='Menu.jsp'%>
	<div class="container">
		<h1>Resumen de CapacitacionDAOImpl</h1>
		
		<table class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Detalle</th>
					

				</tr>
			</thead>

			<tbody>

	
				<tr>
					<td><%= request.getParameter("id") %></td>
					<td><%= request.getParameter("nombre") %></td>
					<td><%= request.getParameter("detalle") %></td>
					

				</tr>
			


			</tbody>

		</table>

	</div>


<%@ include file='footer.jsp'%>

</body>
</html>