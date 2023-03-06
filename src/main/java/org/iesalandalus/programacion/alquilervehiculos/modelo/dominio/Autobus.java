package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public abstract class Autobus {

	private static final String ER_MARCA = "(Seat|Land Rover|KIA|Rolls-Royce|SsangYong)";
	private static final String ER_MATRICULA = "[0-9]{4}[BCDFGHJKLMNÑPQRSTVWXYZ]{3}";
	private String marca;
	private String modelo;
	private String matricula;

	public static Turismo getTurismoConMatricula(String matricula) {
		return new Turismo("Seat", "León", 90, matricula);
	}

	public Autobus() {
		super();
	}

	protected String Vehiculo() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}

	public void copiar(Vehiculo Vehiculo) {
	this.marca = Vehiculo.marca;
	this.matricula = Vehiculo.matricula;
	this.modelo = Vehiculo.modelo;
	}

	public String getVehiculoConMatricula() {
		return Vehiculo.ER_MATRICULA;
	}

	public abstract void getFactorPrecio();

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) throws IllegalArgumentException {
		if (marca == null) {
			throw new NullPointerException("ERROR: la marca no puede ser nula.");
		}
	
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) throws IllegalArgumentException {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		{
			throw new IllegalArgumentException("Modelo no puede estar en blanco");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws IllegalArgumentException {
		if (matricula.matches(ER_MATRICULA)) {
			this.matricula = matricula;
		}
		throw new IllegalArgumentException("Matrícula no tiene un formato válido");
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, matricula, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(modelo, other.modelo);
	}

}