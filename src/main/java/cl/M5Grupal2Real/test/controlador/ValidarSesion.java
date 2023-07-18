package cl.M5Grupal2Real.test.controlador;
import java.util.Objects;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidarSesion
 */
@WebServlet("/ValidarSesion")
public class ValidarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		boolean sesionValida = (Objects.isNull(sesion.getAttribute("sesionValida")))? false:(boolean)sesion.getAttribute("sesionValida");

		if (!sesionValida) {
	
         request.getRequestDispatcher("Index.jsp").forward(request, response);
      }
		
	}


}
