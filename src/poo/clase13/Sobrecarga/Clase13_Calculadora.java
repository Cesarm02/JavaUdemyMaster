package poo.clase13.Sobrecarga;

public class Clase13_Calculadora {

	public int sumar(int a, int b) {
		return a+b;
	}
	
	public float sumar(int a, float b) {
		return a+b;
	}
	
	public float sumar(float a, float b) {
		return a+b;
	}
	
	public float sumar(float a, int b) {
		return a+b;
	}
	
	//varargs
	public int sumar(int... args) {
		int suma = 0;
		for(int arg: args) {
			suma+= arg;
		}
		return suma;
	}
}
