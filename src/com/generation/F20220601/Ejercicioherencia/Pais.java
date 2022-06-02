package com.generation.F20220601.Ejercicioherencia;

public class Pais {

	private String continente;
	private String nombre;
	
	//CONSTRUCTOR VACIO
	public Pais() {
		super();
	}

	//CONSTRUCTOR CON PARAMETROS
	public Pais(String continente, String nombre) {
		super();
		this.continente = continente;
		this.nombre = nombre;
	}

	
	//GETTERS AND SETTERS
	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//CNSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Pais [continente=" + continente + ", nombre=" + nombre + "]";
	}
	
}
