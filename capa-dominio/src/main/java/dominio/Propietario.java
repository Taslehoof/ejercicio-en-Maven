package dominio;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.InheritanceStrategy;

@PersistenceCapable(detachable = "true")
public class Propietario {

	private String nombre;
	private String apellido;
	private int documento;
	private String telefono;

	@Persistent(mappedBy = "propietario", defaultFetchGroup = "true")
	private Vehiculo vehiculo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Propietario(String nombre, String apellido, int documento, String telefono, Vehiculo vehiculo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.telefono = telefono;
		this.vehiculo = vehiculo;
	}

	public Propietario() {
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", telefono="
				+ telefono + ", \n vehiculo=" + vehiculo + "]";
	}
}
