package com.generation.F20220601.PurebasUnitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class CalculadoraTest {//PROBAR LOS METODOS

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12,42);//54
		
		//assertEquals: (valor esperado y respuesta) los compara
		
		assertEquals(54, resultado);
		
	} 
	//ASSERTNOTNULL
	@Test
	public void testSumaNotNull() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12,42);//54
		
		assertNotNull(resultado);
}
	
	//ASSERTSAME
	@Test
	public void testSumaSame() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12,42);
		Integer resultadoTest = 54;
		assertSame(resultadoTest, resultado);//son 2 objetos y se refieren a esos 2 objetos
		
	}
	
	
	
}