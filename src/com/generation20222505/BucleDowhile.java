package com.generation20222505;

import java.util.Scanner;

public class BucleDowhile {

	public static void main(String[] args) {
		//Do while
		//al menos se ejecuta una vez
		int termino= 8;//se ingresa la variable antes del do
		do {
			System.out.println("el valor del termino es: "+ termino);
			termino++;//incremento de variable
		} while(termino <= 10);//condicion de la variable
System.out.println("************");//impresion

while (termino <= 10) {
	System.out.println("el valor de termino es: " + termino);
	termino++;
}
System.out.println("****FIN****");


Scanner sc = new Scanner(System.in);
//MENU
System.out.println("ingrese opcion: 1° sumar, 2° restar, 3° multipicar, 4° dividir");

int opcion = sc.nextInt();

do {
	System.out.println("ingrese opcion: 1° sumar, 2° restar, 3° multipicar, 4° dividir");
	opcion = sc.nextInt();
	
} while (opcion < 0 || opcion > 4);
System.out.println("****Fuera de while****");
	}

}
