package cl.M5Grupal2Real.modelo;

public class Contacto {
	
	private String nombre;
	private String correo;
	private String mensaje;
	private int id;
	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String correo, String mensaje) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.mensaje = mensaje;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "¡Mensaje de Contacto! Se ha recibido de " + nombre + ", correo  " + correo + ", el siguiente mensaje = " + mensaje ;
	}
	
	
	

}
