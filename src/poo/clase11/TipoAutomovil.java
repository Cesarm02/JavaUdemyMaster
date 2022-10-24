package poo.clase11;

public enum TipoAutomovil {

	SEDAN("Sedan", "Mediano",4),
	PICKUP("Pickup", "Camioneta",4);
	
	private final String nombre;
	private final int numeroPuerta;
	private final String descripcion;
	
	private TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
		this.nombre=nombre;
		this.numeroPuerta = numeroPuertas;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
