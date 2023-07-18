package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.M5Grupal2Real.conexion.CapacitacionesDAO;
import cl.M5Grupal2Real.modelo.Capacitacion;

/**
 * Servlet implementation class EditarCapacitacion
 */
@WebServlet("/EditarCapacitacion")
public class EditarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        CapacitacionesDAO capacitacionDAO = CapacitacionesDAO.getInstancia();
        Capacitacion capacitacion = capacitacionDAO.obtenerCapacitacionesPorId(id);

        request.setAttribute("capacitacion", capacitacion);
        request.getRequestDispatcher("EditarCapacitacion.jsp").forward(request, response);
	}

	
}
