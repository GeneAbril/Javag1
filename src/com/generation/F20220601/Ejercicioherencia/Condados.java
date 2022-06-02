package com.generation.F20220601.Ejercicioherencia;

public class Condados extends Inglaterra {
	
	private String Cumbria;
	private String Durham;
	
	//CONSTRUCTOR VACIO
	public Condados() {
		super();
	}

	
	//CONSTRUCTOR CON PARAMETROS
	public Condados(String cumbria, String durham) {
		super();
		Cumbria = cumbria;
		Durham = durham;
	}

	
	//GETTERS AND SETTERSs

	public String getCumbria() {
		return Cumbria;
	}


	public void setCumbria(String cumbria) {
		Cumbria = cumbria;
	}


	public String getDurham() {
		return Durham;
	}


	public void setDurham(String durham) {
		Durham = durham;
	}


	@Override
	public String toString() {
		return "Condados [Cumbria=" + Cumbria + ", Durham=" + Durham + "]";
	}

}
