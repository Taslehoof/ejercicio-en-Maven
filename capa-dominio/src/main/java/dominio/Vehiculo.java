package dominio;

import java.time.LocalDate;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Vehiculo {

	protected String matricula;
	protected LocalDate fechaIngreso;
	protected Taller taller;
	
	@Column(name = "PROPIETARIO_ID")
	@Persistent(defaultFetchGroup = "true")
	protected Propietario propietario;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Taller getTaller() {
		return taller;
	}

	public void setTaller(Taller taller) {
		this.taller = taller;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo(String matricula, LocalDate fechaIngreso, Taller taller, Propietario propietario) {
		super();
		this.matricula = matricula;
		this.fechaIngreso = fechaIngreso;
		this.taller = taller;
		this.propietario = propietario;
	}

	public Vehiculo() {
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fechaIngreso=" + fechaIngreso +", \n propietario=" + propietario + "]";
	}

}
