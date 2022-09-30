package basico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clase6_Date {

	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
		String fechaStr = df.format(fecha);
		System.out.println(fechaStr);
		
		long j = 0;
		for(int x = 0; x < 10000; x++) {
			j +=1;
		}

		Date fecha2 = new Date();
		long tiempoFinal = fecha2.getTime() - fecha.getTime();
		System.out.println("Tiempo final " + tiempoFinal + " ms");
		
	}
	
}
