package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.M5Grupal2Real.conexion.UsuarioDAO;
import cl.M5Grupal2Real.modelo.Usuario1;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {

       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String tipo = request.getParameter("tipo");
    	String nombre = request.getParameter("nombre");
    	String apellidos = request.getParameter("apellidos");
    	String fechaNacimiento = request.getParameter("fechaNacimiento");
    	String rut = request.getParameter("rut");
    	String telefono = request.getParameter("telefono");
    	String afp = request.getParameter("afp");
        String sistemaSalud = request.getParameter("sistemaSalud");
        String direccion = request.getParameter("direccion");
        String comuna = request.getParameter("comuna");
        String titulo = request.getParameter("titulo");
        String fechaIngreso = request.getParameter("fechaIngreso");
        String area = request.getParameter("area");
        String experiencia = request.getParameter("experiencia");
        int edad = 0000;
   
        Usuario1 usuario = new Usuario1(nombre, apellidos,tipo, fechaNacimiento, rut, telefono, afp, sistemaSalud, direccion, comuna, area,experiencia, titulo, fechaIngreso);    


        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
       System.out.println(usuario.toString());
        usuarioDAO.agregarUsuario(usuario);

        
        List<Usuario1> usuarios = UsuarioDAO.obtenerUsuarios();
        request.setAttribute("usuarios", usuarios);
        
        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);

       
	}

}
