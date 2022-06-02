package com.generation.F20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.F20220601.Modelos.Gato;
import com.generation.F20220601.Modelos.Mascota;//se importa para ser utilizada en este package
import com.generation.F20220601.Modelos.Michi;
import com.generation.F20220601.Modelos.Perro;

public class Main {
	public static void main(String[] args) {
//HERENCIA: entregar algo a una clase hija
	Mascota mascota = new Mascota();
	mascota.setColor("gris");
	mascota.setNombre("morocha");
	
	
	Perro perro = new Perro();//Instancia de gato
	perro.setColor("negro");//asignar valor
	perro.setSexo("macho");//asignar valor
	
	Gato gato= new Gato();//Instancia de gato
	gato.setColor("blanco");//asignar valor
	gato.setNombre("pulga");//asignar valor
	
	//ESCANEO DE CLASE
	System.out.println("*EXTENDS DE MASCOTA*");
	System.out.println(gato.toString());//LLamar a los metodos de cada clase
	System.out.println("\n");
	System.out.println(perro.toString());//LLamar a los metodos de cada clase
	System.out.println("\n");
	
	//INSTANCIA DE CLASE MICHI
	System.out.println("*EXTENDS DE GATO*");
	Michi michi = new Michi(true);//indicar valor- SOBREESCRIBIMOS DE CLASE PADRE (GATO)
	System.out.println(michi.toString());//escanear valor
	
	//POLIMORFISMO : capacidad que tienen los objetos de una clase en ofrecer respuesta distinta e independiente en función de los parámetros 
	//ejemplo:
	List<Mascota> listaMascotas = new ArrayList<Mascota>();//arraylist de mascotas, arreglo de mascotas
//DEBAJO DE LISTA VAN LOS .ADD
	
	//INSTANCIA DE REGALON(SUBCLASE)//MUCHAS FORMAS DE RESPUESTA
	Mascota regalon = new Mascota("negro","Canes", "Pelo", "Firulais",1.5f,"Macho");
	listaMascotas.add(regalon);
	regalon.hacerSonido();//SE IMPRIME SONIDO INDICADO EN MASCOTA
	
	//SEGUNDA INSTANCIA
	Mascota felix = new Gato();//VARIABLE TIPO MASCOTA QUE SE VISUALIZA COMO GATO.
	felix.setColor("Blanco");
	felix.setNombre("Felix");
	listaMascotas.add(felix);//añadir elemento
	felix.hacerSonido();//SE IMPRIME SONIDO INDICADO EN GATO
	
	//TERCERA INSTANCIA
	Mascota chocolo= new Perro();
	chocolo.setNombre("Chocolo");
	chocolo.setColor("cafe");
	chocolo.setPeso(10);
	listaMascotas.add(chocolo);//añadir elemento
	regalon.hacerSonido();//SE IMPRIME SONIDO INDICADO EN PERRO
	System.out.println("\n");
	//recorrer arreglo ListaMascotas, SE PROCESA LA MASCOTA COMO U SLO TIPO Y DESPUES SE ESPECIFICA
	for (Mascota mascota2 : listaMascotas) {
		mascota2.hacerSonido();
	}
//TRANSFORMAR OBJETO 
	Perro perrochocolo = (Perro) chocolo;//castear a (Perro)
	perrochocolo.setCantPaseos(6);
	}
}

