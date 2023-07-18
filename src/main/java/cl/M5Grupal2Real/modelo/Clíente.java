package cl.M5Grupal2Real.modelo;

public class Clíente extends Usuario {
	
	

	private String telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	
	public Clíente() {
		super();
	}


	public Clíente(String tipo, String nombre, String apellidos, String fechaNacimiento, String rut, String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(tipo, nombre, apellidos, fechaNacimiento, rut);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getAfp() {
		return afp;
	}


	public void setAfp(String afp) {
		this.afp = afp;
	}


	public String getSistemaSalud() {
		return sistemaSalud;
	}


	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Clíente [telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", tipo=" + tipo + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + ", id=" + id
				+ "]";
	}



	
	
	



	
	
	
	
}
