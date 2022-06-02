package com.generation.F20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String [] args) {// NO OLVIDAR PONER!!!
	//ARRAYLIST: 
	//LIST:	
		List <Alumno> listaGrupo2= new ArrayList<Alumno>();//CREACION DE LISTA TIPO LIST
//instancia de una clase: es un objeto que deriva de otro
//se debe crear variable de tipo objeto	

//objeto MY---variable MN--instancia con new--	
		
		//VARIABLES DE ALUMNOS
		Alumno gene = new Alumno ("Genesis","Quezada",27,"G1");
		Alumno gabo = new Alumno("Gabriel", "Guzman", 29, "G1");
		Alumno cata = new Alumno("Catalina", "Castillo", 26, "G1");
		Alumno carlos = new Alumno("Carlos", "Iturra", 26, "G1");
		Alumno nico = new Alumno("Nicolas", "Neira", 27, "G1");
		
		listaGrupo2.add(gene);// AGREGAR VARIABLE PARA SACAR INFO
		listaGrupo2.add(gabo);
		listaGrupo2.add(cata);
		listaGrupo2.add(carlos);
		listaGrupo2.add(nico);
//IMPRESION DE DATOS DE ALUMNOS
		System.out.println("*********************************");
		System.out.println("**********DATOS GRUPO 2**********");
		System.out.println("*********************************");
				System.out.println("Nombre completo: " + gene.getNombre() + " " +gene.getApellido() + " Edad: " + gene.getEdad() + " curso: " + gene.getCurso());
				System.out.println("\n");//Salto de linea
				System.out.println("Nombre completo: " + gabo.getNombre() + " " + gabo.getApellido() + " Edad: " + gabo.getEdad() + " Curso: " + gabo.getCurso());// get para obtener el atributo que tiene asignado mi variable
				System.out.println("\n");//Salto de linea
				System.out.println("Nombre completo: " + cata.getNombre()+" "+ cata.getApellido() + " Edad: " + cata.getEdad() + " Curso: " + cata.getCurso());
				System.out.println("\n");//Salto de linea
				System.out.println("Nombre completo: " + carlos.getNombre()+" " + carlos.getApellido() + " Edad: " + carlos.getEdad() + "  Curso: " + carlos.getCurso() );
				System.out.println("\n");//Salto de linea
				System.out.println("Nombre completo: " + nico.getNombre() +" "+ nico.getApellido() + " Edad: " + nico.getEdad() + " Curso: " + nico.getCurso());
				System.out.println("*********************************");
				System.out.println("*************GRACIAS!!***********");
				System.out.println("*********************************");
				
				System.out.println("\n");//Salto de linea
				System.out.println("*IMPRIMIR DESDE TOSTRING*");
		System.out.println(gene.toString());//IMPRIMIR DESDE toString
		
		
		//RECORRER CON FOR EACH
		System.out.println("\n");//Salto de linea
		System.out.println("*RECORRER CON FOR EACH*");
		for (Alumno dato : listaGrupo2) {
			//System.out.println(dato.getNombre());//muestra dato
			//System.out.println(dato.getApellido());//muestra dato con get, dato especifico
			
			
			System.out.println("\n");//Salto de linea
			System.out.println(dato.toString());//muestra datos de tostring 
		}
		
		//RECORRER CON FOR 
		System.out.println("\n");//Salto de linea
		System.out.println("*RECORRER CON FOR CON VALOR APELLIDO*");
		for(int i=0; i < listaGrupo2.size();i++) {
			System.out.println(listaGrupo2.get(i).getApellido());//DATO APELLIDO, obtener objeto
		}
}
	//EXTENDS: clase hija de otra, subclase
//IMPLEMENTS: indica si una clase implementa una o mas interfaces
	
}