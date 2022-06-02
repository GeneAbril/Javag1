package com.generation.F20220601.Modelos;

public class Gato extends Mascota {//HEREDAR CON EXTENDS

	//ATRIBUTOS
	private Boolean garraRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;
	
	
	//CONSTRUCTOR VACIO
	public Gato() {
		super();
	}
	
	
//CONSTRUCTOR CON PARAMETRO
	public Gato(Boolean garraRetractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garraRetractil = garraRetractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}
	
	
	//CONSTRUCTOR TO STRING
	
	public String toString() {//TOSTRING EN CLASE, BENEFICIOS POR ROL Y EN GENERAL-sobreescribe clase padre Mascota
		return "Gato [garraRetractil=" + garraRetractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal="
				+ sonidoVocal +" "+ super.toString() + "]";//AGREGAR SUPER PARA ENLAZAR DESDE CLASE PADRE - sobreescribir metodo-busca de clase superior en este caso Mascota
	}
	
	
	//SETTER Y GETTERS
	public Boolean getGarraRetractil() {
		return garraRetractil;
	}
	public void setGarraRetractil(Boolean garraRetractil) {
		this.garraRetractil = garraRetractil;
	}
	public Boolean getVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public String getSonidoVocal() {
		return sonidoVocal;
	}
	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}
	
	@Override 
	public void hacerSonido() {
		System.out.println("Miau,miau");
	}
}
