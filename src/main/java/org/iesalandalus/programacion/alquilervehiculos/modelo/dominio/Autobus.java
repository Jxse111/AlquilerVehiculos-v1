package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public abstract class Autobus {
private int FACTOR_PLAZAS;
private int plazas;

public Autobus(String marca,String modelo,int plazas,String matricula) {
super(marca,modelo,matricula);
setPlazas(plazas);
}

public int getPlazas() {
	return plazas;
}

public void setPlazas(int plazas) {
	this.plazas = plazas;
}

}
