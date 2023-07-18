package cl.M5Grupal2Real.interfaces;
import java.util.List;
import cl.M5Grupal2Real.modelo.Capacitacion;
public interface ICapacitacion {
	
	List<Capacitacion> obtenerCapacitaciones();
	public void agregarCapacitaciones(Capacitacion capacitacion);
	

}
