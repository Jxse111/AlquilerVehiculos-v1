package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public abstract class Turismo extends Vehiculo {
	private int cilindrada;
	public Turismo(String marca, String modelo, int cilindrada, String matricula) throws IllegalArgumentException {
		super(marca,modelo,cilindrada, matricula);
		setCilindrada(cilindrada);
		
	}

	public Turismo(Turismo turismo) {
		super(turismo);
		if (turismo == null) {
			throw new NullPointerException("ERROR: No es posible copiar un turismo nulo.");
		}
		{ 
			this.cilindrada = turismo.cilindrada;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	private void setCilindrada(int cilindrada) throws IllegalArgumentException {
		if (cilindrada >= 0 && cilindrada <= 5000) {
			this.cilindrada = cilindrada;
		}
		{
			throw new IllegalArgumentException("Cilindrada no es correcta");
		}
	}

	@Override
	public String toString() {
		return "Turismo [cilindrada=" + cilindrada + ", getCilindrada()=" + getCilindrada() + ", getPrecioDiario()="
				+ getPrecioDiario() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getFactorPrecio()=" + getFactorPrecio() + ", hashCode()=" + hashCode() + ", getPlazas()="
				+ getPlazas() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public int getPrecioDiario() {
		return 0;
		
	}
}