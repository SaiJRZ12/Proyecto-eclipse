package Calculadora;

public class CalculadoraDeSimonRivas {
	private int num1, num2;
	
	public CalculadoraDeSimonRivas(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}
	
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}
	
	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
	
}
