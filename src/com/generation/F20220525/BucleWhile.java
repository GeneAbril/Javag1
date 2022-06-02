package com.generation.F20220525;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//0° ingresar scanner
		System.out.println("Ingresar opcion (1) Entrar ; (0) Salir ");//crear sysou
		int opcion= sc.nextInt();//2° capturar el ingreso por consola
		
//3° Valida que la condicion sea verdadera, mientras no se cumpla se debe repetir
		while (opcion != 1 && opcion != 0) {// 4° Hacer la comparacion con || o &&
			System.out.println("Ingresar opcion (1) Entrar ; (0) Salir"); //5° enviar respuesta a consola
	opcion = sc.nextInt();//6° imprimir en consola
}
	
System.out.println("Fuera del while");
		

	}

}
