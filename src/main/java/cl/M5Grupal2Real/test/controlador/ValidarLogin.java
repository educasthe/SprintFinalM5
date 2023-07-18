package cl.M5Grupal2Real.test.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidarLogin
 */
@WebServlet("/ValidarLogin")
public class ValidarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarLogin() {
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
		// METODO PARA VERIFICAR USUARIO Y CONTRASEÑA
		String usuario = request.getParameter("username");
		String contrasena = request.getParameter("password");
		
		if (validarUsuario(usuario, contrasena)) {
			HttpSession sesion = request.getSession();
			boolean sesionValida = true;
			sesion.setAttribute("sesionValida", sesionValida);
			/*System.out.println(sesion.getAttribute("sesionValida"));*/
			request.getRequestDispatcher("Principal.jsp").forward(request, response);			
		} else {
			HttpSession sesion = request.getSession();
			boolean sesionValida = false;
			sesion.setAttribute("sesionValida", sesionValida);
			String mensaje = "Usuario o contraseña incorrectos";
		    request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("Index.jsp").forward(request, response);
			
		}
		
		
		
		
	
	}
	
	public boolean validarUsuario(String usuario, String contrasena) {
		
		String usuarioReal = "admin";
		String contrasenaReal = "1234";
		boolean resultado = false;
		if (usuario.equals(usuarioReal) && contrasena.equals(contrasenaReal)) {
			
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
