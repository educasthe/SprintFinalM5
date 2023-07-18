<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ page import="cl.M5Grupal2Real.modelo.Usuario1"%>
<%@ page import="java.util.List"%>
<% request.getRequestDispatcher("ValidarSesion").include(request, response); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Usuarios</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css">
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/estilo.css">

</head>
<body>
<%@ include file='Menu.jsp' %>
    
    <div class="container">
        <h1 class="mt-4">Listado de Usuarios ingresados</h1>
        <div class="table-responsive">
        <table class="table table-striped mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Fecha Nacimiento</th>
                    <th>Rut</th>
                    <th>Telefono</th>
                    <th>Afp</th>
                    <th>Sistema Salud</th>
                    <th>Direccion</th>
                    <th>Comuna</th>
                    <th>Area</th>
                    <th>Experiencia</th>
                    <th>Título</th>
                    <th>Fecha Ingreso</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <% List<Usuario1> usuario = (List<Usuario1>)request.getAttribute("usuarios"); %>
                <% for (Usuario1 c : usuario) { %>
                    <tr>
                        <td><%= c.getId() %></td>
                        <td><%= c.getNombre() %></td>
                        <td><%= c.getApellidos() %></td>
                        <td><%= c.getFechaNacimiento() %></td>
                        <td><%= c.getRut() %></td>                        
                        <td><%= c.getTelefono() %></td>
                        <td><%= c.getAfp() %></td>
                        <td><%= c.getSistemaSalud() %></td>
                        <td><%= c.getDireccion() %></td>
                        <td><%= c.getComuna() %></td>
                        <td><%= c.getArea() %></td>
                        <td><%= c.getExperiencia() %></td>
                        <td><%= c.getTitulo() %></td>
                        <td><%= c.getFechaIngreso() %></td>
                        
                        
                        <td>
                            <a href="EditarUsuario?id=<%= c.getId() %>" class="btn btn-primary btn-sm">Editar</a>
                            <a href="EliminarUsuario?id=<%= c.getId() %>" class="btn btn-danger btn-sm">Eliminar</a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        </div>
    </div>
    
     <%@ include file='footer.jsp'%>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>
