<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resumen de Capacitación</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="css/estilo.css">
</head>
</head>
<body>
<%@ include file='Menu.jsp' %>
    <div class="container">
        <h1 class="mt-5">Resumen de Capacitación</h1>
        
        <h4 class="mt-4">Información de la Capacitación:</h4>
        <hr>
        <div class="row">
            <div class="col-md-6">
                <p><strong>Identificador:</strong> <%= request.getParameter("identificador") %></p>
                <p><strong>RUT:</strong> <%= request.getParameter("rut") %></p>
                <p><strong>Día de Capacitación:</strong> <%= request.getParameter("diaCapacitacion") %></p>
                <p><strong>Hora de Capacitación:</strong> <%= request.getParameter("horaCapacitacion") %></p>
            </div>
            <div class="col-md-6">
                <p><strong>Lugar:</strong> <%= request.getParameter("lugar") %></p>
                <p><strong>Duración:</strong> <%= request.getParameter("duracion") %></p>
                <p><strong>Cantidad de Asistentes:</strong> <%= request.getParameter("cantidadAsistentes") %></p>
            </div>
        </div>
        
        <div class="text-center mt-5">
            <a href="Principal.jsp" class="btn btn-primary">Volver al Inicio</a>
        </div>
    </div>
    
    <%@ include file='footer.jsp'%>
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
