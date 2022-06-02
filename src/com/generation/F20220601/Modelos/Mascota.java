package com.generation.F20220601.Modelos;

public class Mascota {//OBJETO
//METODOS 
	private String color;
	private String especie;
	private String pelaje;
	private String nombre;
	private float peso;
	private String sexo;
	
	
	
//CONSTRUCTOR VACIO
	public Mascota() {
		super();
	}

//CONSTRUCTOR CON PARAMETROS
	public Mascota(String color, String especie, String pelaje, String nombre, float peso, String sexo) {
		super();
		this.color = color;
		this.especie = especie;
		this.pelaje = pelaje;
		this.nombre = nombre;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	//SETTER Y GETTERS

	@Override
	public String toString() {//PARA UTILIZAR EN OTRA CLASE COMO TO STRING
		return "Mascota [color=" + color + ", especie=" + especie + ", pelaje=" + pelaje + ", nombre=" + nombre
				+ ", peso=" + peso + ", sexo=" + sexo +  "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	//CREAR FUNCION DE SONIDO DEL ANIMAL
	
public void hacerSonido() {
	System.out.println("Muu");
}
}
