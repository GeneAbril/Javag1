package com.generation.F20220601.Modelos;

public class Perro extends Mascota {//HEREDAR CON EXTENDS
	
	//ATRIBUTOS
private Integer cantPaseos;
private Float tama�oHocico;
private String sonidoVocal;


//CONSTRUCTOR VACIO
public Perro() {
	super();
}


//CONSTRUCTOR CON PARAMETROS
public Perro(Integer cantPaseos, Float tama�oHocico, String sonidoVocal) {
	super();
	this.cantPaseos = cantPaseos;
	this.tama�oHocico = tama�oHocico;
	this.sonidoVocal = sonidoVocal;
}


//GETTER AND SETTER
public Integer getCantPaseos() {
	return cantPaseos;
}
public void setCantPaseos(Integer cantPaseos) {
	this.cantPaseos = cantPaseos;
}
public Float getTama�oHocico() {
	return tama�oHocico;
}
public void setTama�oHocico(Float tama�oHocico) {
	this.tama�oHocico = tama�oHocico;
}
public String getSonidoVocal() {
	return sonidoVocal;
}
public void setSonidoVocal(String sonidoVocal) {
	this.sonidoVocal = sonidoVocal;
}


//CONSTRUCTOS TO STRING
@Override
public String toString() {
	return "Perro [cantPaseos=" + cantPaseos + ", tama�oHocico=" + tama�oHocico + ", sonidoVocal=" + sonidoVocal + " "+ super.toString() +"]";
}


//FUNCION DE SONIDO DEL ANIMAL
@Override //SOBREESCRIBIR METODO DE MASCOTA
public void hacerSonido() {
	System.out.println("Guau,guau");
}

}
