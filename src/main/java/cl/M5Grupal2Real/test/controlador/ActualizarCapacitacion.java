package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.M5Grupal2Real.conexion.CapacitacionesDAO;
import cl.M5Grupal2Real.modelo.Capacitacion;
import cl.M5Grupal2Real.modelo.Usuario;

/**
 * Servlet implementation class ActualizarCapacitacion
 */
@WebServlet("/ActualizarCapacitacion")
public class ActualizarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String detalle = request.getParameter("detalle");

        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setId(id);
        capacitacion.setNombre(nombre);
        capacitacion.setDetalle(detalle);

        CapacitacionesDAO capacitacionDAO = CapacitacionesDAO.getInstancia();
        capacitacionDAO.actualizarCapacitaciones(capacitacion);
        
        List<Capacitacion> capacitaciones = capacitacionDAO.obtenerCapacitaciones();

        request.setAttribute("capacitaciones", capacitaciones);
        request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request, response);
	}

}
