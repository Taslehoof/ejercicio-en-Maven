package dominio;

import java.time.LocalDate;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Camioneta extends Vehiculo {

	private TipoMotor tipoMotor;

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public Camioneta(String matricula, LocalDate fechaIngreso, Taller taller, Propietario propietario,
			TipoMotor tipoMotor) {
		super(matricula, fechaIngreso, taller, propietario);
		this.tipoMotor = tipoMotor;
	}

	public Camioneta() {
	}

	@Override
	public String toString() {
		return "\n Camioneta [tipoMotor=" + tipoMotor + ", matricula=" + matricula + ", fechaIngreso=" + fechaIngreso + "]";
	}
}
