package com.generation.F20220523;

public class CalculoPromedio {

	public static void main(String[] args) {
		//Variable numerica int para notas
		//int cantidadNotas = 12; //12 NOTAS
		//arreglo, conjunto de datos separados por coma
		Integer[] notas= {20,50,67,99,10,0,88,77,58,79,33,50};
//Promedio: suma de todas las notas dividido en la cantidad de notas
		
		//crear variable acumuladora, guarda suma de todas las notas
		int sumaNotas= 0;//inicializada en cero
		
		//como recorrer el arreglo
		for (int i = 0; i < notas.length; i++) {//i=0
		sumaNotas= sumaNotas + 	notas [i];//hace el recorrido desde 0
			
		}
		System.out.println("suma de notas:"+" " + sumaNotas);
		
		//crear una variable para sacar promedio
	float promedio = sumaNotas / notas.length;
	/* validar el orden >=*/
	if (promedio >= 50 && promedio <= 100) {
		System.out.println("Resultado:"+ " " + "Aprobado");
	}else {
	System.out.println("Resulado:" + " " + "Reprobado");	
	}
	
	}

}
