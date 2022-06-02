package com.generation.F20220531;

import java.util.List;

public class Cliente {
	//DATOS DE CLIENTE
	//DEFAULT NO AGREGA DATO A VARIABLE Y SE ACCEDE DESDE EL MISMO PACKAGE
//String rut;//
//PPRIVATE SOLO SE ACCEDE DENTRO DE LA MISMA CLASE
//private String rut;//
	 //PUBLIC SE ACCEDE DESDE CUALQUIER PACKAGE CON LA INSTANCIA
	//public String rut;//
	
private String rut;
private Integer id;
private List <Integer> numeroVenta;//para crear numeros de ventas
public String nombre; 
private String correo;

public Cliente() {//se le asigna el contenido despues
	super();
}
//con parametros se le asigna el valor a todos los atributos
public Cliente(String rut, Integer id, List<Integer> numeroVenta, String nombre, String correo) {
	super();
	this.rut = rut;
	this.id = id;
	this.numeroVenta = numeroVenta;
	this.nombre = nombre;
	this.correo = correo;
}
//ACCESADORES PARA ACCEDER DESDE OTRA CLASE 
public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public List<Integer> getNumeroVenta() {
	return numeroVenta;
}
public void setNumeroVenta(List<Integer> numeroVenta) {
	this.numeroVenta = numeroVenta;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}

//con parametros se le asigna el valor a todos los atributos

@Override
public String toString() {//se puede utilizar en otra clase para imprimir datos
	return "Cliente [rut=" + rut + ", id=" + id + ", numeroVenta=" + numeroVenta + ", nombre=" + nombre + ", correo="
			+ correo + "]";
}







}
