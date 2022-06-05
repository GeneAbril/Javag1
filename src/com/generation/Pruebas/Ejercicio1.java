package com.generation.Pruebas;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//verificar si el numero es par o impar y sumar el total de los numeros ingresados
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int suma=0;
	int sumaPar=0;
	int sumaImpar=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Ingrese primer numero");
	num1=sc.nextInt(); 
	if(num1 % 2 ==0) {
		System.out.println("Numero es par");
	}else {
		System.out.println("Numero es impar");
	}
	
	System.out.println("Ingrese segundo numero");
	num2=sc.nextInt(); 
	if(num2 % 2 ==0) {
		System.out.println("Numero es par");
	}else {
		System.out.println("Numero es impar");
	}
	
	System.out.println("Ingrese tercer numero");
	num3=sc.nextInt(); 
	if(num3 % 2 ==0) {
		System.out.println("Numero es par");
	}else {
		System.out.println("Numero es impar");
	}
	
	System.out.println("Ingrese cuarto numero");
	num4=sc.nextInt(); 
	if(num4 % 2 ==0) {
		System.out.println("Numero es par");
	}else {
		System.out.println("Numero es impar");
	}
	
	suma= (num1 + num2+ num3+num4);
	System.out.println("La suma total es: " + suma);
	

	
}
}
