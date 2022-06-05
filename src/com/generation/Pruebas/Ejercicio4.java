package com.generation.Pruebas;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// Declara 2 variables numéricas
	System.out.println("Favor digite un numero");
	int num1=sc.nextInt();
	System.out.println("Favor digite un numero");
	int num2=sc.nextInt();
	
	
	// indica cual es mayor de los dos
	
	if (num1 > num2) {
		System.out.println("Numero mayor es: " + num1);
	}else { 
		System.out.println("Numero mayor es: " + num2);
	}
	//Si son iguales indicarlo también
	if (num1==num2) {
		System.out.println("Numeros son iguales");
	}
	
	
	
}
}