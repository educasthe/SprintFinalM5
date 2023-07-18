package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.M5Grupal2Real.modelo.Capacitacion;
import cl.M5Grupal2Real.conexion.CapacitacionesDAO;
import cl.M5Grupal2Real.implementacion.CapacitacionDAOImpl;


/**
 * Servlet implementation class ListarCapacitacion
 */
@WebServlet("/ListarCapacitacion")


public class ListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
        CapacitacionDAOImpl capacitacionDAOImpl = CapacitacionDAOImpl.getInstancia();
        
        List<Capacitacion> capacitaciones = capacitacionDAOImpl.obtenerCapacitaciones();
        
        request.setAttribute("capacitaciones", capacitaciones);
        request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request, response);
        
			

		
	}


}
