package com.generation.Pruebas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String nombre;
		nombre = JOptionPane.showInputDialog("Indique su nombre");// MENSAJE EMERGENTE PARA PEDIR DATOS
		System.out.println("Bienvenida " + nombre);
	}
}
