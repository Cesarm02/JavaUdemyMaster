package basico;

public class Clase4_For {

	public static void main(String[] args) {
		
		for(int x = 0; x <= 5; x++)
			System.out.println("Numero " + x);
		
		
		String[] names = {"Andres" , "pepe" , "cesar", "paco"};
		
		for(int i = 0; i < names.length; i ++) {
			if(names[i].equalsIgnoreCase("cesar")) {
				System.out.println("Es Cesar");
				break;
			}
			System.out.println("Nombre : " + names[i]);
		}
		System.out.println("----- For each ---");
		for(String name : names) {
			System.out.println("Nombre " + name);
		}
		
	}
	
}
