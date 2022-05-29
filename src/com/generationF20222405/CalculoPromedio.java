package com.generationF20222405;

public class CalculoPromedio {

	public static void main(String[] args) {
		//Variable numerica int para notas
		//int cantidadNotas = 12; //12 NOTAS
		//arreglo, conjunto de datos separados por coma
		Integer[] notas= {20,50,-67,99,10,0,-88,77,58,79,33,50};
//Promedio: suma de todas las notas dividido en la cantidad de notas
		
		//crear variable acumuladora, guarda suma de todas las notas
		int sumaNotas= 0;//inicializada en cero
		int notasFueraRango= 0;
		//como recorrer el arreglo
		for (int i = 0; i < notas.length; i++) {//i=0
			//Validar la nota con condicional,(var negativa o >100)
			if(notas[i]<0 || notas[i]>100) {
				//CONTATENAR INFORMACION
				System.out.println("La nota:" + notas[i] + "en la posicion" + " "+ (i+1) +" "+ "está fuera de rango");
				notasFueraRango++;
			}
			
		sumaNotas= sumaNotas + 	notas [i];//hace el recorrido desde 0,accede a los valores
			
		}
		if (notasFueraRango == 0) {//no hay notas fuera de rango
			
		}
		System.out.println("suma de notas:"+" " + sumaNotas);
		
		//crear una variable para sacar promedio
	float promedio = sumaNotas / notas.length;
	System.out.println("Su promedio es: " + promedio);
	/* validar el orden >=*/
	//PUNTO CRITICO, ESTABLECEN LA PROBLEMATICA
	//0<>=reprobado<=49; 50>=aprobado <=100
	if (promedio >= 50 && promedio <= 100) {
		System.out.println("Aprobado");
		//se controla punto clave 0<>=reprobado<=49
	}else if(promedio >= 0 && promedio <=49) {
System.out.println("Reprobado");
	}else {
	System.out.println("Calculo erroneo, verifique datos ingresados");
	}
	
	}

}
