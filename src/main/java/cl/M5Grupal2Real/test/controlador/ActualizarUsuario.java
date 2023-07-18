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
 * Servlet implementation class ActualizarUsuario
 */
@WebServlet("/ActualizarUsuario")
public class ActualizarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");


        Usuario1 usuario = new Usuario1();
        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setTipo(tipo);
   

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        usuarioDAO.actualizarUsuario(usuario);


        List<Usuario1> usuarios = usuarioDAO.obtenerUsuarios();

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
	}

}
