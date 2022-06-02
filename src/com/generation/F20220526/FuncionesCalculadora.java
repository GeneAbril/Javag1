package com.generation.F20220526;

import java.util.Scanner;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated m	Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero1");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese un numero2");
		int numero2 = sc.nextInt();
		suma(numero1, numero2);
		resta(numero1, numero2);
		multiplicacion(numero1, numero2);
		division(numero1, numero2);
		resto(numero1, numero2);
		suma(2,3);		
	}
	
 public static Integer suma(int num1,int num2) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Ingrese numero");//pedir primer dato
	 Integer suma= sc.nextInt();
	 System.out.println("Ingrese numero 2");//pedir segundo dato
	 Integer suma1= sc.nextInt();
	 int resultadoSuma = suma + suma1;
	 System.out.println("El resultado de la suma es: " + resultadoSuma);
	
return resultadoSuma;

 }
 public static void resto(int num1, int num2){
		if(num1 % 2 == 0) {
			 System.out.println("Numero1 es par");
		}else {
			System.out.println("Numero1 es impar");
		}
		if(num2 % 2 == 0) {
			 System.out.println("Numero2 es par");
		}else {
			System.out.println("Numero2 es impar");
		}
		multiplicacion(1,3);
 }
 public static Integer multiplicacion(int n1, int n2) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese primer numero");
		int num1 = sc.nextInt();
		System.out.println("ingrese segundo numero");
		int num2 = sc.nextInt();
		int producto = num1 * num2;
		System.out.println("El resultado de la multiplicacion es: " + producto);

		return producto;
	}
 public static Integer resta(int num1,int num2){
	 int resultadoResta = num1 - num2;
	    
	    return resultadoResta;
	    
	    
	  }
 public static Double division(double num1, double num2 ){
	 if(num2!=0){ return num1/num2;
	 }else {return null;}
 }
 }
 



 

