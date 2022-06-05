package com.generation.Pruebas;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//SACAR AREA DE UN CIRCULO PIDIENDO DATO DE RADIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un digito");
		double num= sc.nextDouble();//PEDIR PRIMER NUMERO
		double radio= Math.pow(num, 2);//SACAR VALOR DE RADIO CON EL DIGITO INGRESADO
		double pi = 3.14;//VALOR DE PI
		
		
		//RESULTADO DEL AREA
		double areaDeUnCirculo= pi * radio;
		System.out.println("El area del circulo es: " + areaDeUnCirculo);
}
}