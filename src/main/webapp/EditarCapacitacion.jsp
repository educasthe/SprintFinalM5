<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="cl.M5Grupal2Real.modelo.Capacitacion" %>

<html>
<head>
    <title>Editar Capacitacion</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Editar Capacitacion</h1>
        <% Capacitacion capacitacion = (Capacitacion) request.getAttribute("capacitacion"); %>
        <form action="ActualizarCapacitacion" method="POST">
            <input type="hidden" name="id" value="<%= capacitacion.getId() %>">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" name="nombre" value="<%= capacitacion.getNombre() %>">
            </div>
            <div class="form-group">
                <label for="detalle">Detalle:</label>
                <input type="text" class="form-control" name="detalle" value="<%= capacitacion.getDetalle() %>">
            </div>
            <button type="submit" class="btn btn-primary">Actualizar</button>
        </form>
    </div>
    
    <%@ include file='footer.jsp'%>
    <!-- Agregar los scripts de JavaScript de Bootstrap al final del documento -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>