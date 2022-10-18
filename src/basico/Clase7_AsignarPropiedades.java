package basico;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Clase7_AsignarPropiedades {

	public static void main(String[] args) {

		try {
			FileInputStream archivo = new FileInputStream("src/config.properties");
			Properties p = new Properties(System.getProperties());
			p.load(archivo);
			p.setProperty("mi.propiedad", "personalizada");
			
			System.setProperties(p);
			
			System.out.println("Propiedad = " + p.getProperty("config.autor.nombre"));
			
			System.getProperties().list(System.out);
			
		}catch(Exception e) {
			System.out.println("No existe el archivo " + e);
		}
		
		
	}

}
