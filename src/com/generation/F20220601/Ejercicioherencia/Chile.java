package com.generation.F20220601.Ejercicioherencia;

public class Chile extends Pais {

	private String localidadGeografica;
	private String regiones;
	private String ciudades;
	private String comunas;
	
	//constructor vacio
	public Chile() {
		super();
	}

	//constructor con parametros
	public Chile(String localidadGeografica, String regiones, String ciudades, String comunas) {
		super();
		this.localidadGeografica = localidadGeografica;
		this.regiones = regiones;
		this.ciudades = ciudades;
		this.comunas = comunas;
	}
	
	
	//GETTERS AND SETTERS

	public String getLocalidadGeografica() {
		return localidadGeografica;
	}

	public void setLocalidadGeografica(String localidadGeografica) {
		this.localidadGeografica = localidadGeografica;
	}

	public String getRegiones() {
		return regiones;
	}

	public void setRegiones(String regiones) {
		this.regiones = regiones;
	}

	public String getCiudades() {
		return ciudades;
	}

	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}

	public String getComunas() {
		return comunas;
	}

	public void setComunas(String comunas) {
		this.comunas = comunas;
	}

	
	//CONSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Chile [localidadGeografica=" + localidadGeografica + ", regiones=" + regiones + ", ciudades=" + ciudades
				+ ", comunas=" + comunas + super.toString() + "]";
	}
	
}
