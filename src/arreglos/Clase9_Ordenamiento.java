package arreglos;

public class Clase9_Ordenamiento {

	public static void main(String[] args) {
		//Ordenamiento burbuja
		int[] numeros = {3,9,4,3,6,5};
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				if(numeros[i] < numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}

		for(int x = 0; x < numeros.length; x++) {
			System.out.println(numeros[x]);
		}
		
		System.out.println("Burbuja Optimizado");
		
		//Burbuja optimizado 
		int[] numeros2 = {3,9,4,3,6,5};
		for(int i = 0; i < numeros2.length; i++) {
			for(int j = 0; j < numeros2.length-1; j++) {
				if(numeros2[j+1] < numeros2[j]) {
					int aux = numeros2[j];
					numeros2[j] = numeros2[j+1];
					numeros2[j+1] = aux;
				}
			}
		}
		
		for(int x = 0; x < numeros.length; x++) {
			System.out.println(numeros2[x]);
		}
		
		System.out.println("¿Ordenados?");
		//Revisar si estan ordenados
		boolean asc = false;
		boolean des = false;
		int[] numeros3 = {6,5,4,3,2,1};
		for(int i = 0; i < numeros3.length-1; i++) {
			if(numeros3[i] > numeros3[i+1]) {
				des = true;
			}
			if(numeros3[i] < numeros3[i+1]) {
				asc = true;
			}
		}
		if(asc == true && des == true) {
			System.out.println("Arreglo desorganizado");
		}
	
		if(asc == false && des == false) {
			System.out.println("Todos son iguales");
		}
		
		if(asc == true && des == false) {
			System.out.println("Ascendente");
		}
		
		if(asc == false && des == true) {
			System.out.println("Descendente");
		}
		
	}
	

}
