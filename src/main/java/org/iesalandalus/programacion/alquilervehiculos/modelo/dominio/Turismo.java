package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Turismo extends Vehiculo {
	private int cilindrada;
	public Turismo(String marca, String modelo, int cilindrada, String matricula) throws IllegalArgumentException {
		super();
		setMarca(marca);
		setModelo(modelo);
		setCilindrada(cilindrada);
		setMatricula(matricula);
	}

	public Turismo(Turismo turismo) {
		super();
		if (turismo == null) {
			throw new NullPointerException("ERROR: No es posible copiar un turismo nulo.");
		}
		{
			this.marca = turismo.marca;
			this.modelo = turismo.modelo;
			this.cilindrada = turismo.cilindrada;
			this.matricula = turismo.matricula;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) throws IllegalArgumentException {
		if (cilindrada >= 0 && cilindrada <= 5000) {
			this.cilindrada = cilindrada;
		}
		{
			throw new IllegalArgumentException("Cilindrada no es correcta");
		}
	}

	public String toString() {
		return "Turismo [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", matricula="
				+ matricula + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getCilindrada()="
				+ getCilindrada() + ", getMatricula()=" + getMatricula() + ", hashCode()=" + hashCode()
				+ ", getPrecioDiario()=" + getPrecioDiario() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	public int getPrecioDiario() {
		return 0;
		
	}
}