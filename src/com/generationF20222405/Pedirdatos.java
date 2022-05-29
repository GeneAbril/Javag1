package com.generationF20222405;

import java.util.Scanner;

public class Pedirdatos {

	public static void main(String[] args) {
//PEDIR SIGUIENTES DATOS
	     Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese su nombre y apellido");
	        String nombreapellido = sc.nextLine();
	        System.out.println("Ingrese su direccion");
	        String direccion = sc.nextLine();
	        System.out.println("Ingrese su numero de casa");
	        int numeroCasa = sc.nextInt();


	        System.out.println("Ingrese su edad");
	        int edad = sc.nextInt();

	        int Mayoriaedad = 18;
	        System.out.println("\nIngrese su saldo");
	        int saldo = sc.nextInt();
	        int minsaldo = 50000;
	        if (edad >= Mayoriaedad) {

	            System.out.println("Bienvenido!");


	        }else if (saldo >= minsaldo ){


	                System.out.println("Apueste lo que quiera");




	        } else {
	            System.out.println("PA FUERA");
	        }



	        int minapuesta = 10000;


	        if (saldo >= minsaldo ){

	            System.out.println("Apueste lo que quiera");

	        } else {
	            System.out.println("PA FUERA");
	        }

	        System.out.println("\nIngrese su apuesta, la minima apuesta hoy es de 10000");
	        int apuesta = sc.nextInt();

	        if (apuesta > minapuesta){

	            System.out.println("Disfrute su partida");

	        } else {
	            System.out.println("Ingrese un saldo mayor");
	        }



	    }
	
	}


