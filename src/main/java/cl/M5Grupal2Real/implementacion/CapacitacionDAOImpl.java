package cl.M5Grupal2Real.implementacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.M5Grupal2Real.conexion.CapacitacionesDAO;
import cl.M5Grupal2Real.interfaces.ICapacitacion;
import cl.M5Grupal2Real.modelo.Capacitacion;

public class CapacitacionDAOImpl /*implements ICapacitacion*/ {

	private static CapacitacionDAOImpl instancia;
	private static Connection conexion;

	public static CapacitacionDAOImpl getInstancia() {
		if (instancia == null) {
			instancia = new CapacitacionDAOImpl();
		}
		return instancia;
	}

	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		List<Capacitacion> listaCapacitaciones = new ArrayList<>();
		Capacitacion capacitacion1 = new Capacitacion(110, "Capacitacion1", "Detalle Capacitacion1");
		Capacitacion capacitacion2 = new Capacitacion(111, "Capacitacion2", "Detalle Capacitacion2");
		Capacitacion capacitacion3 = new Capacitacion(112, "Capacitacion3", "Detalle Capacitacion3");
		listaCapacitaciones.add(capacitacion1);
		listaCapacitaciones.add(capacitacion2);
		listaCapacitaciones.add(capacitacion3);
		return listaCapacitaciones;
	}

	@Override
	public void agregarCapacitaciones(Capacitacion capacitacion) {
		System.out.println("La capacitacion ingresada es :" + capacitacion.toString());

	}

	private Connection obtenerConexion() {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/prevencion_riesgos";
			String usuario = "grupal5";
			String password = "123456789";

			conexion = DriverManager.getConnection(url, usuario, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}

}
