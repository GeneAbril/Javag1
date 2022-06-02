package com.generation.F20220524;

import java.util.Scanner; //agregar import

public class Condicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//solicitar ingreso de edad
		//Validar la mayoria de edad
		//establecer punto critico -> 18 años
		int edadMayoria = 18;
		
		//solicitar ingreso de edad
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();//permite el uso de scanner con la variable sc
				
		if(edad >= edadMayoria) {//validacion de datos
			System.out.println("Permitido acceso");
		}else {
			System.out.println("Acceso denegado");
		}

	}

}
