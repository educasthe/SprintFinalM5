package cl.M5Grupal2Real.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.M5Grupal2Real.modelo.Capacitacion;

public class CapacitacionesDAO {

	private static CapacitacionesDAO instancia;
	private static Connection conexion;

	private CapacitacionesDAO() {
		// Establecer la conexión a la base de datos en el constructor privado
		// Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
		// y una única conexión a la base de datos en todo el proyecto
		conexion = obtenerConexion();
	}

	public static CapacitacionesDAO getInstancia() {
		if (instancia == null) {
			instancia = new CapacitacionesDAO();
		}
		return instancia;
	}

	// Métodos CRUD

	public static List<Capacitacion> obtenerCapacitaciones() {

		List<Capacitacion> capacitaciones = new ArrayList<>();
		String consulta = "SELECT id, nombre, detalle FROM capacitaciones";

		try (PreparedStatement statement = conexion.prepareStatement(consulta);

				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				Capacitacion capacitacion = new Capacitacion();
				capacitacion.setId(resultSet.getInt("id"));
				capacitacion.setNombre(resultSet.getString("nombre"));
				capacitacion.setDetalle(resultSet.getString("detalle"));
				capacitaciones.add(capacitacion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return capacitaciones;
	}

	public Capacitacion obtenerCapacitacionesPorId(int id) {
		Capacitacion capacitacion = null;
		String consulta = "SELECT id, nombre, detalle FROM capacitaciones WHERE id = ?";

		try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
			statement.setInt(1, id);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					capacitacion = new Capacitacion();
					capacitacion.setId(resultSet.getInt("id"));
					capacitacion.setNombre(resultSet.getString("nombre"));
					capacitacion.setDetalle(resultSet.getString("detalle"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return capacitacion;
	}

	public void agregarCapacitaciones(Capacitacion capacitacion) {
		String consulta = "INSERT INTO capacitaciones (nombre, detalle) VALUES (?, ?)";

		try (

				PreparedStatement statement = conexion.prepareStatement(consulta)) {
			statement.setString(1, capacitacion.getNombre());
			statement.setString(2, capacitacion.getDetalle());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void actualizarCapacitaciones(Capacitacion capacitacion) {
		String consulta = "UPDATE capacitaciones SET nombre = ?, detalle = ? WHERE id = ?";

		try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
			statement.setString(1, capacitacion.getNombre());
			statement.setString(2, capacitacion.getDetalle());
			statement.setInt(3, capacitacion.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarCapacitaciones(int id) {
		String consulta = "DELETE FROM capacitaciones WHERE id = ?";

		try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
