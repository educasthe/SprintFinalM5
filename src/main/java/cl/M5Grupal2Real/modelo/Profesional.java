package cl.M5Grupal2Real.modelo;

public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaIngreso;
	
	public Profesional() {
		super();
	}

	public Profesional(String tipo, String nombre, String apellidos, String fechaNacimiento, String rut, String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", nombre=" + nombre + ", tipo="
				+ tipo + ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}
