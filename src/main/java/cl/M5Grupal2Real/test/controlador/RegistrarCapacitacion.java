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
import cl.M5Grupal2Real.modelo.Usuario1;



@WebServlet("/RegistrarCapacitacion")
public class RegistrarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    	String detalle = request.getParameter("detalle");
    	String nombre = request.getParameter("nombre");   
        Capacitacion capacitacion = new Capacitacion(nombre, detalle);    
        
        
        CapacitacionesDAO capacitacionDAO = CapacitacionesDAO.getInstancia();
       
        capacitacionDAO.agregarCapacitaciones(capacitacion);
        
        
        List<Capacitacion> capacitaciones = CapacitacionesDAO.obtenerCapacitaciones();
        request.setAttribute("capacitaciones", capacitaciones);
        

        
        request.getRequestDispatcher("ListadoCapacitaciones.jsp").forward(request, response);




	}

}
