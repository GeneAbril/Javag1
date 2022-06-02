package com.generation.F20220527;

public class Auto {
	//una clase es un modelo o prototipo para crear objetos, se crea a partir de este
//Objeto nace a partir de la clase, caracteristica o atributo
	//algo concreto se convierte en abstracto(no tangible)
	//Tangible: usamos uno o mas de los  5 sentidos para describirlos
	//traer algo de la vida real al codigo
	//GENENOTA:objeto nace desde clase para entregar caracteristicas no tangibles de algo de la vida real
	
//--------------------------------------------------------------------------------------------------------//
	//EJEMPLO AUTO
	//SUS ATRIBUTOS GENERALES:color;ruedas;marca;luces;shasis;carroceria;modelo;puertas;asientos;
	//FUNCIONES: traslado; trabajo;cargar;encender;frenar;reproducir musica;retroceder/avanzar;
    
//--------------------------------------------------------------------------------------------------------//

	
	//ESTRUCTURA DE CODIGO
	// ATRIBUTO
	//accesador-tipo-nombre de atributo
	 private String color;
	 private String marca;
	 private String modelo;
	 private Double velocidad;
	 
	 
	//-CONSTRUCTORES, ASIGNA VALORES A ATRIBUTO
	 //source-> gen. constructor using fields ---- constructor con parametro
	public Auto(String color, String marca, String modelo, Double velocidad) {//Constructr con parametro auto
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	//private: solo accede la clase, publico: todo el mundo//
	
		//-ACCESADORES Y MUTADORES(get,set), SOURCE-> GETTERS AND SETTERS
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}


	public Auto() {// genera constructor vacío seleccionando nada
		
	}
	 
//LAS FUNCIONES CREADAS EN UN OBJETO NO LLEVAN EL STATIC//
	//-METODOS Y FUNCIONES (personalizadas)
	//la funcion se escribe, parentesis y llave
	public void aumentarVelocidad() {//aumentar la velocidad
		
		//this + variable+valor+ d de double ya que no es string
		this.velocidad = 10d;// a esta variable se le asigna un valor
		
	}
}
