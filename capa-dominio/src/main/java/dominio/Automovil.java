package dominio;

import java.time.LocalDate;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Automovil extends Vehiculo {

	private String marca;
	private String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Automovil(String matricula, LocalDate fechaIngreso, Taller taller, Propietario propietario, String marca,
			String modelo) {
		super(matricula, fechaIngreso, taller, propietario);
		this.marca = marca;
		this.modelo = modelo;
	}

	public Automovil() {
	}

	@Override
	public String toString() {
		return "\n Automovil [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", fechaIngreso="
				+ fechaIngreso + "]";
	}
}
