<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.getRequestDispatcher("ValidarSesion").include(request, response);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Capacitación</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="css/estilo.css">

</head>
<body>
<%@ include file='Menu.jsp' %>
    <div class="container">
        <h1 class="mt-5">Formulario de Capacitación</h1>
        <form action="RegistrarCapacitacion" method="POST" id="formulario">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
            
            <div class="form-group">
                <label for="detalle">Detalle:</label>
                <input type="text" class="form-control" id="detalle" name="detalle" >
            </div>
            

            
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    
    <%@ include file='footer.jsp'%>
   
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>   
    

   
    
        <script>
        $(document).ready(function() {
            console.log('funciona');
        });

        var formulario = $("#formulario");
        formulario.submit(function(event) {
            var nombre = $("#nombre").val();
            var detalle = $("#detalle").val();
            
            if (nombre.trim() === "") {
                event.preventDefault();
                alert("¡ALERTA! El campo NOMBRE es obligatorio");
                return false;
            }
            
            if (detalle.trim() === "") {
                event.preventDefault();
                alert("¡ALERTA! El campo DETALLE es obligatorio");
                return false;
            }
        });
    </script>
</body>
</html>

