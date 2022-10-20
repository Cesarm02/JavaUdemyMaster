package arreglos;

import java.util.Arrays;

public class Clase9_Arreglos {

	public static void main(String[] args) {
		
		int[] numeros = new int[4];
		String[] productos = new String[5];
		productos[0] = "Kingston";
		productos[1] = "Samsung";
		productos[2] = "Samsu";
		productos[3] = "Samng";
		productos[4] = "Msung";
		Arrays.sort(productos);
		
		//For each
		for(String producto:productos) {
			System.out.println(producto);
		}
		
		//Inverso
		System.out.println("======");
		for(int i = productos.length-1; i >= 0; i-- ) {
			System.out.println(productos[i]);
		}
		
	}
	
}
