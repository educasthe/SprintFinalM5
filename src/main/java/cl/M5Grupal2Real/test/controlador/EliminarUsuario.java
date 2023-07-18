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
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

        UsuarioDAO usuarioDAO = UsuarioDAO.getInstancia();
        usuarioDAO.eliminarUsuario(id);


        List<Usuario1> usuarios = usuarioDAO.obtenerUsuarios();

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("ListadoUsuarios.jsp").forward(request, response);
	}



}
