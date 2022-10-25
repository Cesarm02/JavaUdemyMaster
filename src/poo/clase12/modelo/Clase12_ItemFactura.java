package poo.clase12.modelo;

public class Clase12_ItemFactura {

	private int cantidad;

	private Clase12_Producto producto;
	
	public Clase12_ItemFactura(int cantidad, Clase12_Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Clase12_Producto getProducto() {
		return producto;
	}

	public void setProducto(Clase12_Producto producto) {
		this.producto = producto;
	}

	public float CalcularImporte() {
		return this.cantidad * this.producto.getPrecio();
	}

	@Override
	public String toString() {
		return producto + "\t" + cantidad + "\t" +  CalcularImporte();
	}
	
}
