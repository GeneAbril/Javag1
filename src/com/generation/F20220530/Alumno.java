package com.generation.F20220530;

public class Alumno {
	//Atributos
	
	//otros tipos de accesadores: public o protected
	//protected: acceden todos los que esten dentro del package
	//public: todos tienen acceso
	//private: encapsulamiento o encapsulacion: se puede proteger la información, se accede solo dentro de la misma clase
//Long es un numero grande
	
	//accesador-- variable--nombre de variable en singular
	private String nombre;
	private String apellido; 
	private int edad;
	private String curso;// puede ser string o int por el ascenso de curso por año 
	
	//CONSTRUCTORES:
	public Alumno() {// VACIO, asigna valor a los atributos
		super();
	}


	public Alumno(String nombre, String apellido, int edad, String curso) {//CON ELEMENTOS
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
}
