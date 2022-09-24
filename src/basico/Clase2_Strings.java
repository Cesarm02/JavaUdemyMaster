package basico;

public class Clase2_Strings {

	public static void main(String[] args) {

		String curso = "nuevo String";
		String curso2 = new String("nuevo String");
		
		boolean igual = curso.equals(curso2);
		
		//Que metodos son relevantes en clase String
		String nombre = "Cesar";
		
		System.out.println("nombre.length() = " + nombre.length());
		System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
		System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
		System.out.println("nombre.equals() = " + nombre.equals("Cesar"));
		System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("cesar"));
		System.out.println("nombre.compareTo() = " + nombre.compareTo("Cesar"));
		System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
	
		//Extensión de un archivo 
		String archivo = "alguno.txt";
		int i = archivo.indexOf(".");
		System.out.println("---------Archivo-------");
		System.out.println(archivo.length());
		System.out.println(archivo.substring(i, archivo.length()));
		
		
		
	}
	
}
