package basico;

import java.util.Calendar;
import java.util.Date;

public class Clase6_Calendar {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(2022, 8, 30, 0, 10,5);
		
		Date fecha = calendario.getTime();
		System.out.println(calendario);
		System.out.println(fecha);
		
		Date fechaActual = new Date();
		String añoNacimiento = "1999";
		
		int edad =  (fechaActual.getYear()+1900) - Integer.parseInt(añoNacimiento)  ;
		System.out.println("Edad = " + edad);
	}
	
}
