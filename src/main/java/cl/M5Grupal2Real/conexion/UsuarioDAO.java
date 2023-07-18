package cl.M5Grupal2Real.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cl.M5Grupal2Real.modelo.Usuario1;



public class UsuarioDAO {
	
	 private static UsuarioDAO instancia;
	    private static Connection conexion;

	    private UsuarioDAO() {
	        // Establecer la conexión a la base de datos en el constructor privado
	        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
	        // y una única conexión a la base de datos en todo el proyecto
	        conexion = obtenerConexion(); 
	    }

	    public static UsuarioDAO getInstancia() {
	        if (instancia == null) {
	            instancia = new UsuarioDAO();
	        }
	        return instancia;
	    }

	    // Métodos CRUD

	    public static List<Usuario1> obtenerUsuarios() {
	    	
	        List<Usuario1> usuarios = new ArrayList<>();
	        String consulta = "SELECT * FROM usuarios";

	        try (
	        	 PreparedStatement statement = conexion.prepareStatement(consulta);
	        		
	             ResultSet resultSet = statement.executeQuery()) {

	            while (resultSet.next()) {
	                Usuario1 usuario = new Usuario1();
	                usuario.setId(resultSet.getInt("id"));
	                usuario.setNombre(resultSet.getString("nombre"));
	                usuario.setTipo(resultSet.getString("tipo"));
	                usuario.setApellidos(resultSet.getString("apellidos"));
	                usuario.setFechaNacimiento(resultSet.getString("fechaNacimiento"));
	                usuario.setRut(resultSet.getString("rut"));
	                usuario.setTelefono(resultSet.getString("telefono"));
	                usuario.setAfp(resultSet.getString("afp"));
	                usuario.setSistemaSalud(resultSet.getString("sistemaSalud"));
	                usuario.setDireccion(resultSet.getString("direccion"));
	                usuario.setComuna(resultSet.getString("comuna"));
	                usuario.setArea(resultSet.getString("area"));
	                usuario.setExperiencia(resultSet.getString("experiencia"));
	                usuario.setTitulo(resultSet.getString("titulo"));
	                usuario.setFechaIngreso(resultSet.getString("fechaIngreso"));
	                
	               
	                usuarios.add(usuario);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return usuarios;
	    }

	    public Usuario1 obtenerUsuarioPorId(int id) {
	        Usuario1 usuario = null;
	        String consulta = "SELECT id, nombre, tipo, apellidos, fechaNacimiento, rut, telefono, afp, sistemaSalud, direccion, comuna, arean experiencia, titulo, fechaIngreso FROM usuarios WHERE id = ?";

	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	            statement.setInt(1, id);

	            try (ResultSet resultSet = statement.executeQuery()) {
	                if (resultSet.next()) {
	                    usuario = new Usuario1();
	                    usuario.setId(resultSet.getInt("id"));
	                    usuario.setNombre(resultSet.getString("nombre"));
	                    usuario.setTipo(resultSet.getString("tipo"));
		                usuario.setApellidos(resultSet.getString("apellidos"));
		                usuario.setFechaNacimiento(resultSet.getString("fechaNacimiento"));
		                usuario.setRut(resultSet.getString("rut"));
		                usuario.setTelefono(resultSet.getString("telefono"));
		                usuario.setAfp(resultSet.getString("afp"));
		                usuario.setSistemaSalud(resultSet.getString("sistemaSalud"));
		                usuario.setDireccion(resultSet.getString("direccion"));
		                usuario.setComuna(resultSet.getString("comuna"));
		                usuario.setArea(resultSet.getString("area"));
		                usuario.setExperiencia(resultSet.getString("experiencia"));
		                usuario.setTitulo(resultSet.getString("titulo"));
		                usuario.setFechaIngreso(resultSet.getString("fechaIngreso"));
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return usuario;
	    }

	    public void agregarUsuario(Usuario1 usuario) {
	        String consulta = "INSERT INTO usuarios (nombre, tipo, apellidos, fechaNacimiento, rut, telefono, afp, sistemaSalud, direccion, comuna, area, experiencia, titulo, fechaIngreso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (
	        		
	        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
	            statement.setString(1, usuario.getNombre());
	            statement.setString(2, usuario.getTipo());
	            statement.setString(3, usuario.getApellidos());
	            statement.setString(4, usuario.getFechaNacimiento());
	            statement.setString(5, usuario.getRut());
	            statement.setString(6, usuario.getTelefono());
	            statement.setString(7, usuario.getAfp());
	            statement.setString(8, usuario.getSistemaSalud());
	            statement.setString(9, usuario.getDireccion());
	            statement.setString(10, usuario.getComuna());
	            statement.setString(11, usuario.getArea());
	            statement.setString(12, usuario.getExperiencia());
	            statement.setString(13, usuario.getTitulo());
	            statement.setString(14, usuario.getFechaIngreso());
	            
	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void actualizarUsuario(Usuario1 usuario) {
	        String consulta = "UPDATE usuarios SET nombre = ?, tipo = ?, apellidos = ?, fechaNacimiento = ?, rut = ?, telefono = ?, afp = ?, sistemaSalud = ?, direccion = ?, comuna = ?, area = ?, experiencia = ?, titulo = ?, fechaIngreso = ? WHERE id = ?";

	        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
	            statement.setString(1, usuario.getNombre());
	            statement.setString(2, usuario.getTipo());
	            statement.setString(3, usuario.getApellidos());
	            statement.setString(4, usuario.getFechaNacimiento());
	            statement.setString(5, usuario.getRut());
	            statement.setString(6, usuario.getTelefono());
	            statement.setString(7, usuario.getAfp());
	            statement.setString(8, usuario.getSistemaSalud());
	            statement.setString(9, usuario.getDireccion());
	            statement.setString(10, usuario.getComuna());
	            statement.setString(11, usuario.getArea());
	            statement.setString(12, usuario.getExperiencia());
	            statement.setString(13, usuario.getTitulo());
	            statement.setString(14, usuario.getFechaIngreso());
	            statement.setInt(15, usuario.getId());
	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void eliminarUsuario(int id) {
	        String consulta = "DELETE FROM usuarios WHERE id = ?";

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
