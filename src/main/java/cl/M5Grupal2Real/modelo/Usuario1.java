package cl.M5Grupal2Real.modelo;

public class Usuario1 {
	
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected String tipo;
	protected String fechaNacimiento;
	protected String rut;
	protected String telefono;
	protected String afp;
	protected String sistemaSalud;
	protected String direccion;
	protected String comuna;
	protected String area;
	protected String experiencia;
	protected String titulo;
	protected String fechaIngreso;
	
	public Usuario1() {
		super();
	}

	public Usuario1(String nombre, String apellidos, String tipo, String fechaNacimiento, String rut,
			String telefono, String afp, String sistemaSalud, String direccion, String comuna, String area,
			String experiencia, String titulo, String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.area = area;
		this.experiencia = experiencia;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
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

	public void setFechaIngreso(String rechaIngreso) {
		this.fechaIngreso = rechaIngreso;
	}

	@Override
	public String toString() {
		return "Usuario1 [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipo=" + tipo
				+ ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut + ", telefono=" + telefono + ", afp=" + afp
				+ ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", area="
				+ area + ", experiencia=" + experiencia + ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	


}
