package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Vehiculo {

	private static final String ER_MARCA = "(Seat|Land Rover|KIA|Rolls-Royce|SsangYong)";
	private static final String ER_MATRICULA = "[0-9]{4}[BCDFGHJKLMNÑPQRSTVWXYZ]{3}";
	protected String marca;
	protected String modelo;
	protected String matricula;

	public static Turismo getTurismoConMatricula(String matricula) {
		return new Turismo ("Seat","León", 90, matricula);
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

	public boolean equals(Object o) {
		if (Object instanceof o);
	
		Turismo turismo = (Turismo) o;
	
		return matricula.equals(turismo.matricula);
	}

	public int hashCode() {
		return matricula.hashCode();
	}

	public Vehiculo() {
		super();
	}

}