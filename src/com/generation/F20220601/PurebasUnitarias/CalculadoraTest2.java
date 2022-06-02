/**
 * 
 */
package com.generation.F20220601.PurebasUnitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author clientes
 *
 */
public class CalculadoraTest2 {
	
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12,42);//54
		
		//assertEquals: (valor esperado y respuesta) los compara
		
		assertEquals(54, resultado);
	} 
	

	/**
	 * Test method for {@link com.generation.F20220601.PurebasUnitarias.Calculadora#resta(int, int)}.
	 */
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(12,42);//54
		
		//assertEquals: (valor esperado y respuesta) los compara
		
		assertEquals(-30, resultado);
	} 
	

	/**
	 * Test method for {@link com.generation.F20220601.PurebasUnitarias.Calculadora#multiplicacion(int, int)}.
	 */
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(12,42);//54
		
		//assertEquals: (valor esperado y respuesta) los compara
		
		assertEquals(504, resultado);
	} 
	

	/**
	 * Test method for {@link com.generation.F20220601.PurebasUnitarias.Calculadora#division(int, int)}.
	 */
	@Test
	public void  testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(10,2);//54
		assertEquals( "5",resultado );//1° mensaje-2° valor esperado, 3° resultado
		
		//assertEquals: (valor esperado y respuesta) los compara
		
		
	} 
	}


	
