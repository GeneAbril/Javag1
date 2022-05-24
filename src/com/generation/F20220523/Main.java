package com.generation.F20220523;

public class Main {

	public static void main(String[] args) {
		//crear variables
		//Variale de texto
String Nombre = "GenesisQuezada\n1994";//tipo de dato, definicion de variable, nombre.
System.out.println(Nombre);//imprimir variable

char letraA='a';// vale 16 bits, con comilla simple es de solo un caracter, no con comillas dobles.
System.out.println(letraA);
//Variable tipo numerica
int numeroInt = 27;//32 bits variable, nombre de variable, valor de variable
System.out.println(numeroInt * 10);// impresion de variable, se puede sumar,restar, multiplicar, dividir
	
	byte numeroByte = 127;// 8 bits
			System.out.println(numeroByte);
			
			short numeroShort = 32767;// 16 bits
			System.out.println(numeroShort);
			
			long numeroLong = 12345;// long primitivo, 64 bits (2^263)
			System.out.println(numeroLong);
			
			//Variable booleana (verdadero o falso)
			boolean acepta = true;// o false
			
		//Variable genero	
			String Genero = "Genero: Femenino";
			System.out.println(Genero);
			
			//Variable color cabello
			String Cabello = "Color cabello: Negro";
			System.out.println(Cabello);
			
			//Variable compromiso
				boolean compromiso = false; // Indicar variable verdadera  o falsa, no ambas.
			if (compromiso) {//variable siempre debe ir con corchetes entrada y salida
				System.out.println("Si, estoy comprometida");
			}
			else { //debe ir con corchete de entrada y salida
				System.out.println("no, estoy comprometida");
				
			}
			
			//Variable Edad
			String edad = "Edad: 27 años";
			System.out.println(edad);
			
			//Variable Nombre
			String nombre1 = "Nombre: Genesis Quezada";
			System.out.println(nombre1);
			
			//Variable genero, otra funcion
			char genero2 = 'F';
			System.out.println(genero2);
			
			//Variables tipo objeto
			edad.charAt(1);// reutilizar variable
			Cabello.charAt(3);
			System.out.println(Cabello.charAt(3));
			
			//equals compara el string con otro dato
			String curso = "G1";
			if (curso.equalsIgnoreCase("g1")) {//IgnoreCase omite mayusculas
				System.out.println("iguales");
			
	}
			else {
				System.out.println("distinto");
			}
	if (curso.toLowerCase().equals("g1")){//convertir todo en minuscula
		System.out.println("iguales");
	}
	if (curso.toUpperCase().equals("g1")){//convertir todo en mayuscula
		System.out.println("distinto");
	}
	if(curso.equals("g1".toUpperCase())){
		System.out.println("iguales");
	}
	
	String curso2 = ""; //variable vacia
	String curso3 = null; //null
	curso.isBlank();
	curso.isEmpty();
	
	//Comparar un string con null se debe comparar con ==
	if(curso == curso3) {
		
	}
 //Float y Double
	float altura = (float) 1.63;// agregar f al final o casteo
	Float peso= 60.5f;
	//PARSE: convertir string a un tipo de numero
	Float gravedad = Float.parseFloat("9.6");
	//Parse;
	Integer.parseInt("23");//SIMIL DE INT
	Long.parseLong("1234566");
	Float.parseFloat("85.5");
	Double.parseDouble("1234567.56");
	
	
			
	
	
	//Ejercicio
	int valor1=12;
	String valor2 =Float.toString(valor1);
 //CONVERSION DE DATOS
	//automatica creciendo desde byte,desde mas pequeño al mas grande
	int num1 = 18;
	float num4f= num1;
	
			
	//manual 
 //double-float,long.int...
	Double peso2 = 75.9;
	float peso2PF = peso2.floatValue();
	Float peso2F = peso2PF;		
	
	Float pesoa= peso2.floatValue();//Cambiar double a Float

	
	float numPrimitivo = 123.4f;//es primitivo porque no figuran alternativas de funciones
	 Float numObjeto = 123.45f;
	 //DE FLOAT A INT SE PIERDEN LOS DECIMALES
	 //float a integer se pierden decimales
	 
	//+ - * / % (operadores)
	 //== != > >= < <= (comparacion)
	 int dos=2;
     int tres=3;
	 if (5 ==(tres+dos)) {// se hace con variables por el valor dentro de la variable
		
		 
	 }
	}

}
