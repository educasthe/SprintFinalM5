<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cl.M5Grupal2Real.modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%
request.getRequestDispatcher("ValidarSesion").include(request, response);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Capacitaciones</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/estilo.css">
</head>
</head>
<body>
	<%@ include file='Menu.jsp'%>
	<div class="container mx-auto">
		<h1>Resumen de las capacitaciones ingresadas</h1>
		<h3>Por favor, verifica los datos</h3>
		<table class="table table-striped table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Detalle</th>
					<th>Acción</th>

				</tr>
			</thead>

			<tbody>
				<%
				ArrayList<Capacitacion> capacitaciones = (ArrayList<Capacitacion>) request.getAttribute("capacitaciones");
				for (Capacitacion capa : capacitaciones) {
				%>
				<tr>
					<td><%=capa.getId() %></td>
					<td><%=capa.getNombre()%></td>
					<td><%=capa.getDetalle()%></td>
					<td><a href="EditarCapacitacion?id=<%= capa.getId()%>" class="btn btn-primary btn-sm">Editar</a> 
						<a href="EliminarCapacitacion?id=<%= capa.getId()%>"	class="btn btn-danger btn-sm">Eliminar</a></td>

				</tr>
				<%
				}
				%>



			</tbody>

		</table>

	</div>


<%@ include file='footer.jsp'%>

</body>
</html>
