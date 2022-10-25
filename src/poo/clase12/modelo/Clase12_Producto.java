package poo.clase12.modelo;

public class Clase12_Producto {

	private int codigo;
	private String nombre;
	private float precio;
	
	private static int ultimoCodigo;
	
	public Clase12_Producto() {
		this.codigo = ++ultimoCodigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return codigo + "\t" + nombre +"\t" + precio;
	}
	
	
	
}
