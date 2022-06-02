package com.generation.F20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {//Main es una funcion, para crear otra debe ser fuera del main
		Scanner scanner = new Scanner(System.in);
		// 4 TIPO DE FUNCIONES
		//no se puede CREAR un metodo dentro de otro metodo, si se puede llamar
saludo();
calculoSumaPares(false,21,"12","sumar",50l);
//crear variable que captura el valor de retorno que entrega esa funcion
// pide info - entrega info
int edad=  obtenerEdad();
System.out.println(edad);

boolean mayorOMenor = validarMayorEdad(edad);
if(mayorOMenor == true ) {
	System.out.println("Puede ingresar al curso");
}else {
	System.out.println("No tiene la edad suficiente para acceder al curso");
}
	}
	//funciones 2 retornan 2 no retornan
	//funcion Void:no retornan nada
	//
//accesador---- tipo de retorno--nombre de la funcion(parametro a recibir)
	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, String accion, Long numero3) {
		  //imprimir variable----------------convertir string a int
		System.out.println((numero1+numero3+ Integer.parseInt(numero2)));
	}
	//solo imprime funcion, no la retorna
	public static void saludo() {//static permite acceder al metodo
		//solicitar ingreso de dato o mensaje a emitir
		System.out.println("Buenos dias!");
		
	}
	
	//Funciones que retornan un tipo de dato, cualquier tipo de dato.
	//accesador---- tipo de retorno--nombre de la funcion(parametro a recibir)
	public static Integer obtenerEdad() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = scanner.nextInt();//18;
		return edad;//retornar el contenido de la variable
		
	}   
	
	//accesador---- tipo de retorno--nombre de la funcion(parametro a recibir)
	public static Boolean validarMayorEdad(Integer edad) {
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false;
		}
		
		//return true; //false
	}
}
