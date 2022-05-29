package com.generation20222505;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//MENU
		System.out.println("ingrese opcion: 1° sumar, 2° restar, 3° multipicar, 4° dividir");
		
		int opcion = sc.nextInt();
		
		//VALIDAR INGRESO DE DATOS ERRONEOS
		while(opcion < 0 || opcion > 4) {//V I V=V
			System.out.println("Ingresar dato correcto: opcion 1, opcion 2, opcion 3, opcion 4");
			opcion = sc.nextInt();
		}
		System.out.println();
	switch (opcion) {
	case 1://sumar
		//accion para la opcion 1
		System.out.println("**Suma");
		break; //finaliza la accion
	case 2://restar
		System.out.println("**Resta");
		break;
	case 3://multiplicar
		System.out.println("**Multiplicar");
		break;
	case 4://dividir
		System.out.println("**Dividir");
		break;

//mensaje de error
	default:
		System.out.println("Opcion invalida");
		break;
	 }
	System.out.println("Fuera del Switch");
	}
	
}