package dominio;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
public class Ubicacion {

	private String domicilio;
	private int numero;
	private String telefono;
	private Ciudad ciudad;

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Ubicacion(String domicilio, int numero, String telefono, Ciudad ciudad) {
		super();
		this.domicilio = domicilio;
		this.numero = numero;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public Ubicacion() {
	}

	@Override
	public String toString() {
		return "Ubicacion [domicilio=" + domicilio + ", numero=" + numero + ", telefono=" + telefono + "]";
	}

}
