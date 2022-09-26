package basico;

import java.util.Scanner;

public class Clase4_FlujosControl {

	public static void main(String[] args) {
		
		int edad = 20;
		
		if(edad >= 18)
			System.out.println("Mayor de edad");
		else
			System.out.println("Menos de edad");

		//Año bisiesto
		System.out.println("---- Año bisiesto ----");
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe el mes (número)");
		int mes = in.nextInt();
		int numeroDias = 0;
		System.out.println("Escribe el año");
		int anio = in.nextInt();
		if(mes ==1  || mes == 3 || mes ==5 || mes ==7 || mes == 8 || mes == 10 || mes == 12) {
			numeroDias = 31;
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			numeroDias = 30;
		}
		else if ( mes == 2 ) {
			if( anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
				numeroDias = 29;
			}else {
				numeroDias = 28;
			}
		}
		if(numeroDias == 29)	
			System.out.println("numero días  = " + numeroDias + " Año bisiesto");
		else
			System.out.println("numero días  = " + numeroDias + " Año no Bisiesto");
		
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numeroDias = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numeroDias = 30;
				break;
			case 2:
				if( anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
					numeroDias = 29;
				}else {
					numeroDias = 28;
				}
				break;
		}
		
		if(numeroDias == 29)	
			System.out.println("numero días  = " + numeroDias + " Año bisiesto");
		else
			System.out.println("numero días  = " + numeroDias + " Año no Bisiesto");
		
		
	}

}
