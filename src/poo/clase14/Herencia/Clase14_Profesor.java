package poo.clase14.Herencia;

public class Clase14_Profesor extends Clase14_Persona{

	public Clase14_Profesor() {
		System.out.println("Profesor");
	}
	
	private String asignatura;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
	
}
