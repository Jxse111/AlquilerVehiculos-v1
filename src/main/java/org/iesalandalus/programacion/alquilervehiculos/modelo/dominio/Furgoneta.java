package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Furgoneta extends Vehiculo {
private int FACTOR_PMA;
private int FACTOR_PLAZAS;
private int pma;
private int plazas;
public Furgoneta(String marca,String modelo,int plazas,String matricula) {
super(marca, modelo, plazas, matricula);
setPlazas(plazas);
setPma(pma);
}
public int getPma() {
	return pma;
}
public void setPma(int pma) {
	this.pma = pma;
}
public int getPlazas() {
	return plazas;
}
public void setPlazas(int plazas) {
	this.plazas = plazas;
}

public int getFactorPrecio() {
	return 0;
}

}


