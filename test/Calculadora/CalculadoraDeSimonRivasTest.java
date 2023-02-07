package Calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import Calculadora.CalculadoraDeSimonRivas;

class CalculadoraDeSimonRivasTest {
	
	@BeforeEach                                         
    void setUp() {
		CalculadoraDeSimonRivas calcu = new CalculadoraDeSimonRivas(10, 20);
    }
	
	@RepeatedTest(5)
	@Test
	void testSuma() {
		CalculadoraDeSimonRivas calcu=new CalculadoraDeSimonRivas(10, 20);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
		
	}

	@Test
	void testResta() {
		CalculadoraDeSimonRivas calcu=new CalculadoraDeSimonRivas(20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
		CalculadoraDeSimonRivas calcu=new CalculadoraDeSimonRivas(10, 20);
		int resultado = calcu.multiplica();
		assertEquals(20, resultado);
		assertTrue("Error", false);
	}

	@Test
	void testDivide() {
		CalculadoraDeSimonRivas calcu=new CalculadoraDeSimonRivas(20, 0);
		int resultado = calcu.divide();
		assertEquals(2, resultado);
	}
	
	@Test
	public void testException() {
		try {
			CalculadoraDeSimonRivas calcu = new CalculadoraDeSimonRivas(20,0);
			int resultado = calcu.divide();
			fail("Fallo, deberia haber ñanzado la excepcion");
		} catch (ArithmeticException e) {
			//Prueba satisfactoria
		}
	}

}
