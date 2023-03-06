package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public abstract class Autobus {
private int FACTOR_PLAZAS=2;
private int plazas;

public Autobus(String marca,String modelo,int plazas,String matricula) {
super();
setPlazas(plazas);
}

public int getPlazas() {
	return plazas;
}

public void setPlazas(int plazas) {
	this.plazas = plazas;
}
public int getFactorPrecio() {
return FACTOR_PLAZAS/plazas;

}

@Override
public String toString() {
	return "Autobus [FACTOR_PLAZAS=" + FACTOR_PLAZAS + ", plazas=" + plazas + ", getPlazas()=" + getPlazas()
			+ ", getFactorPrecio()=" + getFactorPrecio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}
