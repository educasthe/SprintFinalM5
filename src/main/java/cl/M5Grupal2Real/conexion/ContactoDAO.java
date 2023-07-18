package cl.M5Grupal2Real.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.M5Grupal2Real.modelo.Contacto;
import cl.M5Grupal2Real.modelo.Usuario1;

public class ContactoDAO {
	
	 private static ContactoDAO instancia;
	    private static Connection conexion;

	    private ContactoDAO() {
	        // Establecer la conexión a la base de datos en el constructor privado
	        // Usar Singleton para asegurar que solo haya una instancia de UsuarioDAO
	        // y una única conexión a la base de datos en todo el proyecto
	        conexion = obtenerConexion(); 
	    }
	    
	    public static ContactoDAO getInstancia() {
	        if (instancia == null) {
	            instancia = new ContactoDAO();
	        }
	        return instancia;
	    }

	    // Métodos CRUD

	    public static List<Contacto> obtenerContacto() {
	    	
	        List<Contacto> contacto = new ArrayList<>();
	        String consulta = "SELECT * FROM contacto";

	        try (
	        	 PreparedStatement statement = conexion.prepareStatement(consulta);
	        		
	             ResultSet resultSet = statement.executeQuery()) {

	            while (resultSet.next()) {
	                Contacto contactos = new Contacto();
	                contactos.setId(resultSet.getInt("id"));
	                contactos.setNombre(resultSet.getString("nombre"));
	                contactos.setCorreo(resultSet.getString("correo"));
	                contactos.setMensaje(resultSet.getString("mensaje"));

	                
	               
	                contacto.add(contactos);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return contacto;
	    }
	    
	    
	    
	    public void agregarContacto(Contacto contacto) {
	        String consulta = "INSERT INTO contacto (nombre, correo, mensaje) VALUES (?, ?, ?)";

	        try (
	        		
	        	PreparedStatement statement = conexion.prepareStatement(consulta)) {
	            statement.setString(1, contacto.getNombre());
	            statement.setString(2, contacto.getCorreo());
	            statement.setString(3, contacto.getMensaje());

	            
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
