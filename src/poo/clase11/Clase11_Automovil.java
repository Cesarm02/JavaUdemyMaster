package poo.clase11;

public class Clase11_Automovil {

	private String fabricante;
	private String modelo;
	private String color;
	private String cilindraje;
	private int capacidad = 40;
	
	private TipoAutomovil tipo;
	
	static String colorPatente = "Naranja";
	
	public Clase11_Automovil() {
		
	}
	
	public Clase11_Automovil(String fabricante, String modelo, String color, String cilindraje, int capacidad) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cilindraje = cilindraje;
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public static String getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(String colorPatente) {
		Clase11_Automovil.colorPatente = colorPatente;
	}

	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}

	public void detalle() {
		System.out.println("Fabricante " +this.fabricante);
		System.out.println("Modelo " +this.modelo);
		System.out.println("Color " +this.color);
		System.out.println("Cilindraje " +this.cilindraje);
		System.out.println("Patante " + colorPatente);
	}

	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenado";
	}

	public String acelerar(int rpm) {
		return "El auto " + this.fabricante + " acelerando a" + rpm + " rpm";
	}

	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + " \n " + frenar;
	}
	
	public float calcularConsumo(int km, float porcentajeBencina) {
		return km/(capacidad * porcentajeBencina);
	}

	public float calcularConsumo(int km, int porcentajeBencina) {
		return km/(capacidad * (porcentajeBencina/100f));
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Clase11_Automovil))
			return false;
		Clase11_Automovil a = (Clase11_Automovil) obj;
		return this.fabricante != null && this.modelo!= null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindraje="
				+ cilindraje + ", capacidad=" + capacidad + "]";
	}
	
}

