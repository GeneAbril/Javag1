package com.generation.F20220526;

import java.util.ArrayList;//Siempre importar array
import java.util.Collection;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// ARRAYLIST DINAMICOS, SE PUEDE MODIFICAR EL TAMAÑO
	//creando instancia de clase
//arrayList+ variable + nombre de variable +  = new ArrayList(); inicializada como objeto
ArrayList<String> colores = new ArrayList();//definir arreglo tipo objeto
ArrayList<Integer> numerosPares= new ArrayList();//definir arreglo tipo objeto

//add y agregamos elementos
System.out.println("*AGREGAR ELEMENTO*");
colores.add( "rojo");
colores.add("azul");
colores.add("verde");
colores.add("amarillo");
colores.add("celeste");
System.out.println(colores);

System.out.println("\n");
//acceder a un elemento
System.out.println("*ACCEDER AL ELEMENTO*");
System.out.println(colores.get(2));//se utiliza .get e indica el valor al que quieras acceder segun su posicion
System.out.println(colores.get(1));//se utiliza .get e indica el valor al que quieras acceder segun su posicion

System.out.println("\n");//SALTO DE LINEA
System.out.println("*TAMAÑO DEL ELEMENTO*");
System.out.println(colores.size());//acceder al tamaño, similar a length
System.out.println("\n");//SALTO DE LINEA

System.out.println("*MODIFICAR ELEMENTO*");
colores.set(1, "morado"); //para modificar un elemento se utiliza el set
System.out.println(colores);//ya no es azul, es morado
System.out.println("\n");//SALTO DE LINEA

System.out.println("*ELIMINAR UN ELEMENTO*");
colores.remove(2);//para remover un elemento
System.out.println(colores);//se eliminó verde
System.out.println("\n");//SALTO DE LINEA

//RECORER ARREGLO CON FOR
System.out.println("*RECORRER LOS ELEMENTOS CON FOR*");
for (int i = 0; i < colores.size(); i++) {
	System.out.print(colores.get(i));
	System.out.println("\n");//SALTO DE LINEA
	
}
System.out.println("*RECORRER LOS ELEMENTOS CON FOREACH*");
for (String color : colores) {
	System.out.print(color);
	System.out.println("\n");//SALTO DE LINEA
}
//ORDENA EL ARREGLO DE MANERA ASCENDENTE
System.out.println("*ORDENA EL ARREGLO ASCENDENTEMENTE*");
Collections.sort(colores);//se le puede pasar cualquier arreglo que tengamos, afecta al arreglo, no es temporal
System.out.println(colores);//imprime arreglo ordenado alfabeticamente
System.out.println("\n");//SALTO DE LINEA

System.out.println("*ELIMINAR TODOS LOS ELEMENTOS*");
colores.clear();
System.out.println(colores);
System.out.println("\n");//SALTO DE LINEA


//EJEMPLO CON NUMEROS
System.out.println("*EJEMPLO CON NUMEROS PARES*");
numerosPares.add(6);
numerosPares.add(12);
numerosPares.add(4);
numerosPares.add(2);
numerosPares.add(8);
System.out.println(numerosPares + " ");
System.out.println("\n");//SALTO DE LINEA


System.out.println("*ORDENAR FORMA ASCENDENTE*");
Collections.sort(numerosPares);
System.out.println(numerosPares);
System.out.println("\n");//SALTO DE LINEA


//siempre va a despues del sort para efecto descendente
System.out.println("*ORDEN REVERTIDO*");
Collections.reverse(numerosPares);//INVIERTE LOS DATOS, NO ORDENA DESCENDENTEMENTE, SOLO INVIERTE
System.out.println(numerosPares);

	}

}
