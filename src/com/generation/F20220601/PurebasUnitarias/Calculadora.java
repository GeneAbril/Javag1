package com.generation.F20220601.PurebasUnitarias;

public class Calculadora {
//CREAR 4 METODOS BASICOS DE LAS REGLAS DE UNA CALCULADORA
	
	
	public int suma(int numero1, int numero2) {//CREAR METODO CON 2 VARIABLES A GESTIONAR
		return numero1+numero2;
	}
	
	public int resta(int numero1, int numero2) {//CREAR METODO CON 2 VARIABLES A GESTIONAR
		return numero1-numero2;
	}
	
	public int multiplicacion(int numero1, int numero2) {//CREAR METODO CON 2 VARIABLES A GESTIONAR
		return numero1*numero2;
	}
	
	public String division(int numero1, int numero2) {//CREAR METODO CON 2 VARIABLES A GESTIONAR
		if(numero2 != 0) {
			String resultado = Integer.toString(numero1/numero2);//cambiar de strins a int con Integer
		return resultado;
		}
		return "No se puede dividir por cero";
	}
}
