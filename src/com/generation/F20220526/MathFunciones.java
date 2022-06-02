package com.generation.F20220526;

public class MathFunciones {

	public static void main(String[] args) {
		//Math
		//elevar o potencia----------n°,exponente
		double numeroElevado = Math.pow(4.5, 1);//elevar numero a cualquier numero
		System.out.println(numeroElevado);
//redondear entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//redondear al entero menor
		double enteroMenor= Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//redondeo
		
	double enteroRedondeado = Math.round(numeroElevado);
	System.out.println(enteroRedondeado);
	//ejemplo
	double num1= 12;
	double num2 =5;
 double div = num1/num2;
			System.out.println(div);
			
//numeros aleatorios
			//mathrandon() genera numeros entre >= 0.0 y < 1.0
double aleatorio= Math.random();
System.out.println(aleatorio);

//numeros aleatorios entre 0 y 10, se multiplica por el numero
double num10=Math.random() * 10;
System.out.println(num10);

//numeros aleatorios entre 2 y 8
//-----------estabece menor-----establece mayor
double num11 = 2 + (Math.random()* (8-2));
System.out.println(num11);

//numeros negativos
double numNeg12 = Math.random() * (-10 + 0);
System.out.println(numNeg12);

double num13=Math.abs(10);
System.out.println(num13);
	}

}
