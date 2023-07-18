package cl.M5Grupal2Real.modelo;

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	public Administrativo() {
		super();
	}




	public Administrativo(String tipo, String nombre, String apellidos, String fechaNacimiento, String rut, String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}




	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombre=" + nombre
				+ ", tipo=" + tipo + ", id=" + id + "]";
	}


	
	
	
	

}
