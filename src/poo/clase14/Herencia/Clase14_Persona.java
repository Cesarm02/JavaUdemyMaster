package poo.clase14.Herencia;

public class Clase14_Persona {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String email;
	
	public Clase14_Persona() {
		System.out.println("Persona: Iniciando constructor");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
