package dominio;

import java.util.List;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(detachable = "true")
public class Taller {

	private String nombre;

	@Persistent(defaultFetchGroup = "true")
	@Column(name = "UBICACION_ID")
	private Ubicacion ubicacion;

	@Persistent(defaultFetchGroup = "true")
	@Column(name = "SERVICIOGRUA_ID")
	private ServicioGrua servicioGrua;
	private boolean habilitado;

	@Persistent(mappedBy = "taller", defaultFetchGroup = "true")
	@Join
	private List<Vehiculo> vehiculos;

	private String habilitado2;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ServicioGrua getServicioGrua() {
		return servicioGrua;
	}

	public void setServicioGrua(ServicioGrua servicioGrua) {
		this.servicioGrua = servicioGrua;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Taller(String nombre, Ubicacion ubicacion, ServicioGrua servicioGrua, boolean habilitado,
			List<Vehiculo> vehiculos) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.servicioGrua = servicioGrua;
		this.habilitado = habilitado;
		this.vehiculos = vehiculos;
	}

	public Taller() {
	}

	@Override
	public String toString() {
		if(isHabilitado() == true) {
			habilitado2 = String.valueOf("Habilitado");			
		}else {
			habilitado2 = String.valueOf("Deshabilitado");
		}
		
		return "Taller [nombre=" + nombre				
				+ ", habilitado=" + habilitado2
				+ ", vehiculos=" + vehiculos 
				+ "]" +"\n";
	}

}
