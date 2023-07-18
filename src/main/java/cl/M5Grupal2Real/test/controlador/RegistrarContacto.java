package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.M5Grupal2Real.conexion.ContactoDAO;
import cl.M5Grupal2Real.modelo.Contacto;


/**
 * Servlet implementation class RegistrarContacto
 */
@WebServlet("/RegistrarContacto")
public class RegistrarContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String mensaje = request.getParameter("mensaje");
		
		Contacto contacto = new Contacto(nombre, correo, mensaje);
		
        ContactoDAO contactoDAO = ContactoDAO.getInstancia();
       System.out.println(contacto.toString());
        contactoDAO.agregarContacto(contacto);
        
        List<Contacto> contactos = ContactoDAO.obtenerContacto();
        request.setAttribute("contactos", contactos);		

		

		request.getRequestDispatcher("ResumenFormulario.jsp").forward(request, response);
	}

}
