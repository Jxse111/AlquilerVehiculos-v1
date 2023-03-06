package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public abstract class Vehiculo extends Autobus {
	private static final String ER_MARCA = "(Seat|Land Rover|KIA|Rolls-Royce|SsangYong)";
	private static final String ER_MATRICULA = "[0-9]{4}[BCDFGHJKLMNÑPQRSTVWXYZ]{3}";
	private String marca;
	private String modelo;
	private String matricula;

	protected Vehiculo(String marca, String modelo, int plazas, String matricula) {
		super(marca, modelo, plazas, matricula);
	}

	protected Vehiculo(Vehiculo vehiculo) {
	}

	public abstract void copiar(Vehiculo vehiculo);

	protected static Turismo getTurismoConMatricula(String matricula) {
		return new Turismo("Seat", "León", 90, matricula);
	}

	public abstract int getFactorPrecio();

	public String getMarca() {
		return marca;
	}

	public void setMarca() {
		if (marca == null) {
			throw new NullPointerException("ERROR: la marca no puede ser nula.");
		}
	}

	public String getModelo() {
		return modelo;

	}

	public void setModelo(String matricula) throws IllegalArgumentException {
		throw new IllegalArgumentException("Matrícula no tiene un formato válido");

	}

	public void setMatricula(String matricula) throws IllegalArgumentException {
		throw new IllegalArgumentException("Matrícula no tiene un formato válido");
	}

	@Override
	public int hashCode() {
		return matricula.hashCode();
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