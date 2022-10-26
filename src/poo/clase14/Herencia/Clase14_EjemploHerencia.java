package poo.clase14.Herencia;

public class Clase14_EjemploHerencia {

	public static void main(String[] args) {

		System.out.println("======ALUMNO");
		Clase14_Alumno alumno = new Clase14_Alumno();
		alumno.setNombre("Cesar");
		alumno.setApellido("Mesa");
		alumno.setNotaEsp(5.5);
		alumno.setNotaHis(6.3);
		alumno.setNotaMat(4.0);

		System.out.println("======ALUMNO INTERNACIONAL");
		Clase14_AlumnoInternacional alumnoInternacional = new Clase14_AlumnoInternacional();
		alumnoInternacional.setNombre("Peter");
		alumnoInternacional.setApellido("Goz");
		alumnoInternacional.setPais("AUS");
		alumnoInternacional.setEdad(15);
		alumnoInternacional.setNotaIdiomas(8.0);
		
		System.out.println("======PROFESOR");
		Clase14_Profesor profesor = new Clase14_Profesor();
		profesor.setNombre("Andres");
		profesor.setApellido("Guzman");
		profesor.setAsignatura("Mate");
	
		System.out.println(alumno.getNombre()+ " " + alumno.getApellido());
		System.out.println("Profesor: " + profesor.getNombre() +  " " + profesor.getApellido() + " Asignatura: " + profesor.getAsignatura());
	}

}
