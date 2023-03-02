package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public abstract class Vehiculo {

	private static final String ER_MARCA = "(Seat|Land Rover|KIA|Rolls-Royce|SsangYong)";
	private static final String ER_MATRICULA = "[0-9]{4}[BCDFGHJKLMNÑPQRSTVWXYZ]{3}";
	private String marca;
	private String modelo;
	private String matricula;

	public static Turismo getTurismoConMatricula(String matricula) {
		return new Turismo("Seat", "León", 90, matricula);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) throws IllegalArgumentException {
		if (marca == null) {
			throw new NullPointerException("ERROR: la marca no puede ser nula.");
		}

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) throws IllegalArgumentException {
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

	public abstract double getFactorPrecio();

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

	public Vehiculo() {
		super();
	}

}