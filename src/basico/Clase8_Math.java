package basico;

import java.util.Random;

public class Clase8_Math {

	public static void main(String[] args) {

		int absoluto = Math.abs(-5);
		System.out.println(absoluto);
		
		double max = Math.max(3.5, absoluto);
		System.out.println(max);
		
		double abajo = Math.floor(3.5);
		System.out.println(abajo);
		
		double arriba = Math.ceil(3.5);
		System.out.println(arriba);
		
		double pi = Math.PI;
		System.out.println(pi);
		
		double random = Math.random();
		System.out.println(random);
		
		double randomSiente = Math.random()*7;
		System.out.println(randomSiente);
		
		System.out.println(Math.floor(randomSiente));
		
		String [] colores = {"azul", "rojo", "amarillo"};
		double randomColor = Math.random();
		randomColor*=colores.length;
		randomColor = Math.floor(randomColor);
		System.out.println(colores[(int) randomColor]);
		
		//Random Util
		Random randomObj = new Random();
		int randomInt = randomObj.nextInt(5);
		System.out.println(randomInt);
		
	}

}
