package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.M5Grupal2Real.conexion.CapacitacionesDAO;
import cl.M5Grupal2Real.conexion.UsuarioDAO;
import cl.M5Grupal2Real.modelo.Capacitacion;
import cl.M5Grupal2Real.modelo.Usuario;

/**
 * Servlet implementation class EliminarCapacitacion
 */
@WebServlet("/EliminarCapacitacion")
public class EliminarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

        CapacitacionesDAO capacitacionDAO = CapacitacionesDAO.getInstancia();
        capacitacionDAO.eliminarCapacitaciones(id);


        List<Capacitacion> capacitaciones = capacitacionDAO.obtenerCapacitaciones();

        request.setAttribute("capacitaciones", capacitaciones);
        
        request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request, response);
	}


}
