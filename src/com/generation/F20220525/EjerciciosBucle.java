package com.generation.F20220525;

import java.util.Scanner;

public class EjerciciosBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inferior = 0;
		int superior = 0;

		do {
			System.out.println("Ingrese un numero para el limite inferior");
			inferior = sc.nextInt();
			System.out.println("Ingrese un numero mayor para el limite superior");
			superior = sc.nextInt();

			if (superior < inferior) {
				System.out.println("Limite inferior es mayor al superior. Ingrese numeros validos");
			}

		} while (superior < inferior);

		int datoIngresado = 0;
		int sumaDentroRango = 0;
		int contadorFueraRango = 0;
		int contadorIgualLimites = 0;

		System.out.println("a continuacion, ingrese numeros a gusto, para terminar ingrese un 0");
		do {

			System.out.println("Ingrese un numero.");
			datoIngresado = sc.nextInt();

			if (datoIngresado != 0) {
				if (datoIngresado < inferior || datoIngresado > superior) {
					contadorFueraRango++;
				} else {
					sumaDentroRango += datoIngresado;
				}

				if (datoIngresado == inferior || datoIngresado == superior) {
					contadorIgualLimites++;
				}
			}
		} while (datoIngresado != 0);

		System.out.println("Sumas de numero ingresados dentro del rango: " + sumaDentroRango);
		System.out.println("Numero fuera de rango: " + contadorFueraRango);
		System.out.println("Numero igual a limite inferior o superior: " + contadorIgualLimites);

	}

}
		
		