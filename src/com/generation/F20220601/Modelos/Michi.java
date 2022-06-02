package com.generation.F20220601.Modelos;

public class Michi extends Gato {//OBJETO MICHI-HEREDAMOS (EXTENDS) DE GATO

	private Boolean famosoEnInternet;

	
	//CONSRUCTOR VACIO
	public Michi() {
		super();
	}
//CONSTRUCTOR CON PARAMETRI
	public Michi(Boolean famosoEnInternet) {
		super();
		this.famosoEnInternet = famosoEnInternet;
	}
	
	//SETTER AND GETTERS
	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}
	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Michi [famosoEnInternet=" +" " + famosoEnInternet + super.toString() + "]";
	}
	
}
