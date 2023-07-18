<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#">Asesoría de Riesgo</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="Inicio">Inicio</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/M5Grupal2Real/Contacto">Contacto</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Capacitacion </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<!-- ><li><a class="dropdown-item" href="CrearCapacitacion">Crear Capacitacion</a></li>-->
							<li><a class="dropdown-item" href="FormularioCapacitacion.jsp">Crear Capacitacion</a></li>
							<li><a class="dropdown-item" href="MostrarCapacitacion">Listar
									Capacitacion</a></li>

						</ul>
						</li>
						
											<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Usuarios </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="FormularioUsuarioCliente.jsp">Crear Usuarios Cliente</a></li>
							<li><a class="dropdown-item" href="FormularioUsuarioProfesional.jsp">Crear Usuarios Profesional</a></li>
							<li><a class="dropdown-item" href="FormularioUsuarioAdministrativo.jsp">Crear Usuarios Administrativo</a></li>
							<li><a class="dropdown-item" href="MostrarUsuarios">Listar
									Usuarios</a></li>

						</ul>
						</li>

						<li class="nav-item"><a class="nav-link" href="CerrarSesion">Cerrar Sesión</a></li>
				</ul>
			</div>
		</div>
	</nav>