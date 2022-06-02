package com.generation.F20220601.Ejercicioherencia;

public class Ciudad extends Chile {
	
	private String santiago;
	private String valparaiso;
	
	//CONSTRUCTOR VACIO
	public Ciudad() {
		super();
	}

	//CONSTRUCTOR CON PARAMETROS
	public Ciudad(String santiago, String valparaiso) {
		super();
		this.santiago = santiago;
		this.valparaiso = valparaiso;
	}
	
	//GETTERS AND SETTERS

	public String getSantiago() {
		return santiago;
	}

	public void setSantiago(String santiago) {
		this.santiago = santiago;
	}

	public String getValparaiso() {
		return valparaiso;
	}

	
	//CONSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Ciudad [santiago=" + santiago + ", valparaiso=" + valparaiso + "]";
	}

	public void setValparaiso(String valparaiso) {
		this.valparaiso = valparaiso;
	}

}
