
<%@ page import="cl.M5Grupal2Real.modelo.Usuario1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<div class="container">
		<%@include file="Menu.jsp"%>
		<h1>Editar Usuario</h1>
		<%
		Usuario1 usuario = (Usuario1) request.getAttribute("usuarios");
		%>
		<form action="ActualizarUsuario" method="POST">
			<input type="hidden" name="id" value="<%=usuario.getId()%>">
			<div class="form-group">
				<label>Nombre:</label> <input type="text" class="form-control"
					name="nombre" value="<%=usuario.getNombre()%>">
			</div>
			<div class="form-group">
				<label>Tipo Cliente:</label> <input type="text" class="form-control"
					name="tipo" value="<%=usuario.getTipo()%>">
			</div>

			<div>
				<br>
			</div>
			<button type="submit" class="btn btn-primary">Actualizar</button>
		</form>
		
	</div>
	
	<%@ include file='footer.jsp'%>
</body>
</html>