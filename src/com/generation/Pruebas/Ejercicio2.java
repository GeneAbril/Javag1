package com.generation.Pruebas;

import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int [5];
		
		for(int i= 5 - 1; i>=0;i--) {
			System.out.println( "Digite un numero");
			numeros[i]=sc.nextInt();
		}
		for (int i : numeros) {
			
			System.out.println("numeros: " + i);
			
		}
		
	}
}
	