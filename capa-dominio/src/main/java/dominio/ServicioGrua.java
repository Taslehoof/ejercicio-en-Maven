package dominio;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
public class ServicioGrua {

	private String nombre;
	private String telefono;
	private double precioAcarreo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getPrecioAcarreo() {
		return precioAcarreo;
	}

	public void setPrecioAcarreo(double precioAcarreo) {
		this.precioAcarreo = precioAcarreo;
	}

	public ServicioGrua(String nombre, String telefono, double precioAcarreo) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.precioAcarreo = precioAcarreo;
	}

	public ServicioGrua() {
	}

	@Override
	public String toString() {
		return "ServicioGrua [nombre=" + nombre + ", telefono=" + telefono + ", precioAcarreo=" + precioAcarreo + "]";
	}

}
