package com.generation.F20220527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ColeccionesMap {

	public static void main(String[] args) {
		// COLECCIONES MAP
		//se trabaja con una clave valor
		
//HashMap<K,V> map= new HashMap<K,V>();1° forma de escribir hashmap,establece tipo de datos como clave-valor, se puede recorrer como string
//HashMap<K, V> = new HashMap();// 2° forma de escribir hashmap
//K= clave, V= valor		
//
//HashMap<String,String> map= new HashMap<String,String>();//si se escribe el valor como object se puede recorrer
HashMap  objHashMap = new HashMap(); //trabaja con objeto de objeto, se limita en cantidad y tipo de dato

//SON OBJETOS TIPO STRING
//.PUT PERMITE INGRESAR UN OBJETO COMO CLAVE Y VALOR
//------------clave----valor
System.out.println("*LLAVES Y DATOS INGRESADOS*");
objHashMap.put("nombre", "gene");//Indica clave y valor
objHashMap.put("segundo nombre", "abril");//Indica clave y valor
objHashMap.put("apellido", "quezada");//Indica clave y valor
objHashMap.put("segundo apellido", "rodriguez");//Indica clave y valor
objHashMap.put("edad", "27");//Indica clave y valor
System.out.println(objHashMap);
 
System.out.println("\n");//SALTO DE LINEA
System.out.println("*IMPRIMIR SOLO UN VALOR*");
System.out.println(objHashMap.get("segundo apellido"));//imprimir un solo valor indicando la clave
System.out.println("\n");//SALTO DE LINEA

System.out.println("*REMOVER UN VALOR*");
objHashMap.remove("edad");// remover un valor con clave
System.out.println(objHashMap);

System.out.println("\n");//SALTO DE LINEA
System.out.println("*MUESTRA LAS LLAVES DISPONIBLES*");
System.out.println(objHashMap.keySet());//MUESTRA TODAS LAS CLAVES

System.out.println("\n");//SALTO DE LINEA
System.out.println("*MUESTRA VALORES DENTRO DEL MAPA*");
System.out.println(objHashMap.values());

System.out.println("\n");//SALTO DE LINEA

//OBJETO TIPO ARRAYLIST
//EJEMPLO HACER VOCALES, SE HACE UN ARRAYLIST
ArrayList<String> vocales = new ArrayList<String>();//CREAR LISTA DE VOCALES
vocales.add("a");
vocales.add("e");
vocales.add("i");
vocales.add("o");
vocales.add("u");

System.out.println("*EJEMPLO CON VOCALES*");
objHashMap.put("vocales", vocales);//
System.out.println(objHashMap);
System.out.println("\n");//SALTO DE LINEA

System.out.println("*IMPRIMIR VALOR SELECCIONADO CON GET*");
System.out.println(objHashMap.get("vocales"));

//SI NO ENCUENTRA LA CLAVE RETORNA UN NULL EJEMPLO:
System.out.println("*SI NO ENCUENTRA LA CLAVE RETORNA UN NULL*");
System.out.println(objHashMap.get("Vocales"));
System.out.println("\n");//SALTO DE LINEA

//RECORRER HASHMAP CON FOREACH
System.out.println("*RECORRER VALORES CON FOREACH*");
for(Object clave : objHashMap.keySet()) {//INDICAR OBJECT PARA RECORRER CON 2° FORMA DE ESCRIBIR
	System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); //entrega valor y clave


	
}

	}

}
