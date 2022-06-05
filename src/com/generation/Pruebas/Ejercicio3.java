package com.generation.Pruebas;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		//Declara dos variables numéricas
		System.out.println("Favor digite un numero");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		
		//muestra por consola la suma
		int suma= num1 + num2;
System.out.println("El resultado de la suma es: " + suma); 

		 //resta
int resta= num1 - num2;
System.out.println("El resultado de la resta es: " + resta); 

		 //multiplicación
int multiplicacion = num1 * num2;
System.out.println("El resultado de la multiplicacion es: " + multiplicacion); 

		 //división 
double division = num1 % num2;
System.out.println("El resultado de la division es: " + division);
	} 
	
}
}