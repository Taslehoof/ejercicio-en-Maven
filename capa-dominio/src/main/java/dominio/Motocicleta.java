package dominio;

import java.time.LocalDate;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class Motocicleta extends Vehiculo {

	private int cilindrada;
	private int numeroCilindros;
	private String tipo;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getNumeroCilindros() {
		return numeroCilindros;
	}

	public void setNumeroCilindros(int numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Motocicleta(String matricula, LocalDate fechaIngreso, Taller taller, Propietario propietario, int cilindrada,
			int numeroCilindros, String tipo) {
		super(matricula, fechaIngreso, taller, propietario);
		this.cilindrada = cilindrada;
		this.numeroCilindros = numeroCilindros;
		this.tipo = tipo;
	}

	public Motocicleta() {
	}

	@Override
	public String toString() {
		return "\n Motocicleta [cilindrada=" + cilindrada + ", numeroCilindros=" + numeroCilindros + ", tipo=" + tipo
				+ ", matricula=" + matricula + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
