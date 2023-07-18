<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grupo 7 - M5 Ejercicio Grupal 2</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<%@ include file='Menu.jsp'%>

	<div class="container text-center mt-4">
		<h1>Bienvenido a nuestra Empresa de Asesoría de Riesgo</h1>


	</div>

	<div class="container mt-4" id="contacto">
		<h2>Contacto</h2>
		<p>Puedes ponerte en contacto con nosotros a través de los
			siguientes medios:</p>
		<ul>
			<li>Teléfono: 123-456-789</li>
			<li>Correo electrónico: info@asesoriaderiesgo.com</li>
			<li>Dirección: Calle Principal 123, Ciudad</li>
		</ul>
	</div>

	<div class="container mt-4" id="crear-capacitacion">
		<h2>Crear Capacitación</h2>
		<p>Si estás interesado en crear una capacitación, por favor
			ingresa en el menu superior</p>
		<form>
			<!-- Agrega los campos del formulario de creación de capacitación aquí -->
		</form>
	</div>
	
	<%@ include file='footer.jsp'%>

	<!-- <footer class="bg-dark text-light text-center py-3 mt-5">
		<div class="container">&copy; 2023 Empresa de Asesoría de
			Riesgo. Todos los derechos reservados. Grupo 7</div>
	</footer>-->
</body>
</html>