package cl.M5Grupal2Real.modelo;

public class Usuario {
	
	protected String nombre;
	protected String apellidos;
	protected String tipo;
	protected String fechaNacimiento;
	protected String rut;
	protected int id;
	
	public Usuario() {
		super();
	}

	public Usuario(String tipo,String nombre, String apellidos,  String fechaNacimiento, String rut) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellidos + ", tipo=" + tipo + ", fechaNacimiento="
				+ fechaNacimiento + ", rut=" + rut + ", id=" + id + "]";
	}









	
	
	

}
