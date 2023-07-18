package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcesarFormulario
 */
@WebServlet("/ProcesarFormulario")
public class ProcesarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("identificador");
		String rut = request.getParameter("rut");
		String diaCapacitacion = request.getParameter("diaCapacitacion");
		String horaCapacitacion = request.getParameter("horaCapacitacion");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		String cantidadAsistentes = request.getParameter("cantidadAsistentes");
		
		request.setAttribute("id", id);
		request.setAttribute("rut", rut);
		request.setAttribute("diaCapacitacion", diaCapacitacion);
		request.setAttribute("horaCapacitacion", horaCapacitacion);
		request.setAttribute("lugar", lugar);
		request.setAttribute("duracion", duracion);
		request.setAttribute("cantidadAsistentes", cantidadAsistentes);
		request.getRequestDispatcher("ResumenCapacitacion.jsp").forward(request, response);
	}

}
