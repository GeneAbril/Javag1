package com.generation.F20220602;

public class Administrativos {

	  //declaracion de variables
    private String tipoAdministrador;
    private String areaACargo;

    //constructores

    public Administrativos() {
    }

    public Administrativos(String tipoAdministrador, String areaACargo) {
        this.tipoAdministrador = tipoAdministrador;
        this.areaACargo = areaACargo;
    }
    //getters y setters


    public String getTipoAdministrador() {
        return tipoAdministrador;
    }

    public void setTipoAdministrador(String tipoAdministrador) {
        this.tipoAdministrador = tipoAdministrador;
    }

    public String getAreaACargo() {
        return areaACargo;
    }

    public void setAreaACargo(String areaACargo) {
        this.areaACargo = areaACargo;
    }
    //metodo toString


    @Override
    public String toString() {
        return "Administrativos{" +
                "tipoAdministrador='" + tipoAdministrador + '\'' +
                ", areaACargo='" + areaACargo + '\'' +
                '}';
    }
    public void entradaySalida(){

    }

}
