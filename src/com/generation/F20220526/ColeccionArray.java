package com.generation.F20220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		//SON ARRAY ESTATICOS, NO SE PUEDE CAMBIAR EL TAMAÑO
		//Array-arreglo-matriz, la posicion inicial es 0
		// se pone en corchetes-se asigna nombre- se indica contenido
		String [] colores = {"red","yellow","orange","blue","black"};//forma de ingresar
		Integer[] numerosPares= {2,4,6,8,10};//forma de ingresar
		int [] primerosNumeros= {1,2,3,4,5,6,7,8,9};//forma de ingresar
		
System.out.println("posicion: " + colores[3]);//imprimir posicion segun array
System.out.println("posicion: " + numerosPares[3]);//imprimir posicion segun array
System.out.println("posicion: " + primerosNumeros[5]);//imprimir posicion segun array

numerosPares[3]=10;// Modificando el arreglo en esa posicion
System.out.println("posicion: " + numerosPares[3]);

System.out.println("\n");//SALTO DE LINEA

/*numerosPares[7]= 14; en java no permite agregar otra posicion, va a arrojar error*/

System.out.println("el tamaño es: " + colores.length);//consultar tamaño del arreglo
System.out.println("el tamaño es: " + numerosPares.length);//consultar tamaño del arreglo
System.out.println("el tamaño es: " + primerosNumeros.length);//consultar tamaño del arreglo

System.out.println("\n");//SALTO DE LINEA

System.out.println("tipo: " + colores);//se sabe el tipo de dato que contiene el array
System.out.println("tipo: " + numerosPares);//se sabe el tipo de dato que contiene el array
System.out.println("tipo: " +primerosNumeros);//se sabe el tipo de dato que contiene el array, se refleja como "I"

System.out.println("\n");//SALTO DE LINEA

	System.out.println("tipo2: " + colores.toString());//
	System.out.println("tipo2: " + numerosPares.toString());//
	System.out.println("tipo2: " + primerosNumeros.toString());//
	
	System.out.println("\n");//SALTO DE LINEA
	
	System.out.println("recorrer array: " + Arrays.toString(colores));//importa el arrays
	
	System.out.println("\n");//SALTO DE LINEA
	//FOR ARRAY
	for (int i = 0; i < primerosNumeros.length; i++) {//Forma de recorrer array o arreglo
		System.out.println("numeros son: " + primerosNumeros[i]);//Recorrer el arreglo completo
		
	}
	System.out.println("\n");//SALTO DE LINEA
	
	//EN INT
	//For each, saca el primer elemento y lo pasa a la variable
	//FOR EACH: permite recorrer la lista del array sin necesidad de poner el limite en este
	for (int elemento : primerosNumeros) {
		//1° elemento=1; 2° vuelve y avanza a la siguiente posicion y la asigna a la variable
		System.out.println("elemento es: " + elemento);
		
	}
	System.out.println("\n");//SALTO DE LINEA
	//EN STRING
	for (String color : colores) {//primero toma red y la asigna a la variable
		System.out.print("es:" + color+ " ");//imprimir todos los elementos que contenga la array 
		
	}
	System.out.println("\n");//SALTO DE LINEA
	
	for (int num : numerosPares) {
		System.out.print("es:" + num + " ");// si se quita ln se imprime hacia el lado
		
		
	}
	
	}
	

}
