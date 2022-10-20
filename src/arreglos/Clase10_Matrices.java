package arreglos;

public class Clase10_Matrices {

	public static void main(String[] args) {

		int[][] numeros = new int[2][4];
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = i * j;
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				System.out.println(numeros[i][j]);
			}
		}
		
		//Matrices variables
		int[][] matriz = new int[3][];
		matriz[0] = new int[2];
		matriz[1] = new int[3];
		matriz[2] = new int[4];
		
		System.out.println("matriz " + matriz.length);
		System.out.println("Fila 1: " + matriz[0].length);
		System.out.println("Fila 2: " + matriz[1].length);
	}

}
