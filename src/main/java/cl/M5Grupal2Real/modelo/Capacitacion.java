package cl.M5Grupal2Real.modelo;

public class Capacitacion {
	
	private int id;
	private String nombre;
	private String detalle;

	
	public Capacitacion() {
		super();
	}


	public Capacitacion( String nombre, String detalle) {
		super();

		this.nombre = nombre;
		this.detalle = detalle;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + "]";
	}


	
	
	

}
