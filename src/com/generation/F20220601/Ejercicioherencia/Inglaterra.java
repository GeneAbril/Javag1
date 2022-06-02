package com.generation.F20220601.Ejercicioherencia;

public class Inglaterra extends Pais {
	
	private String localidadGeografica;
	private String condados;
	private String distritos;
	
	//CONSTRUCTOR VACIO
	public Inglaterra() {
		super();
	}

	//CONSTRUCTORES CON PARAMETROS
	public Inglaterra(String localidadGeografica, String condados, String distritos) {
		super();
		this.localidadGeografica = localidadGeografica;
		this.condados = condados;
		this.distritos = distritos;
	}

	
	//GETTERS AND SETTERS
	public String getLocalidadGeografica() {
		return localidadGeografica;
	}

	public void setLocalidadGeografica(String localidadGeografica) {
		this.localidadGeografica = localidadGeografica;
	}

	public String getCondados() {
		return condados;
	}

	public void setCondados(String condados) {
		this.condados = condados;
	}

	public String getDistritos() {
		return distritos;
	}

	public void setDistritos(String distritos) {
		this.distritos = distritos;
	}

	
	//CONSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Inglaterra [localidadGeografica=" + localidadGeografica + ", condados=" + condados + ", distritos="
				+ distritos +  "]";
	}
	

}
