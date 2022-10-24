package poo.clase11;

public class Clase11_Persona {

	private String nombre;
	private String apellido;
	
	public Clase11_Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
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

	@Override
	public String toString() {
		return "Clase11_Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
