<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resumen del Formulario de Contacto</title>
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
    <h1>Resumen del Formulario de Contacto</h1>
    <h3>Hemos recibido su solicitud de contacto.</h3>
    <h4>Le estaremos enviando un correo a la brevedad</h4>
    <div class="row">
        <div class="col-md-6">
            <table class="table">
                <thead>
                    <tr>
                        <th>Campo</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre</td>
                        <td><%= request.getParameter("nombre") %></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><%= request.getParameter("correo") %></td>
                    </tr>
                    <tr>
                        <td>Mensaje</td>
                        <td><%= request.getParameter("mensaje") %></td>
                    </tr>
                </tbody>
            </table>
            
        </div>
    </div>
</div>
 <%@ include file='footer.jsp'%>


</body>
</html>
