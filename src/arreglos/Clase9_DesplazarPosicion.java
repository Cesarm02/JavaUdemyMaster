package arreglos;

public class Clase9_DesplazarPosicion {

	public static void main(String[] args) {

		int[] numeros = {2,5,3,6,7};
		int ultimo = numeros[numeros.length-1];
		for(int i = numeros.length-2; i >=0 ; i--) {
			numeros[i+1] = numeros[i];
		}
		numeros[0] = ultimo;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}

}
