package poo.clase12.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clase12_Factura {

	private int folio;
	private String descripcion;
	private Date fecha;
	
	private Clase12_Cliente cliente;
	private Clase12_ItemFactura[] items;
	private int indiceItems;
	public static final int MAX_ITEMS = 12;
	private static int ultimoFolio;
	
	public Clase12_Factura(String descripcion, Clase12_Cliente cliente) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items = new Clase12_ItemFactura[MAX_ITEMS];
		this.folio = ++ultimoFolio;
		this.fecha = new Date();
	}
	
	public int getFolio() {
		return folio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Clase12_Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Clase12_Cliente cliente) {
		this.cliente = cliente;
	}
	public Clase12_ItemFactura[] getItems() {
		return items;
	}

	public void addItemFactura(Clase12_ItemFactura item) {
		if(indiceItems < MAX_ITEMS) {
			this.items[indiceItems++] = item;
		}
	}
	
	public float calcularTotal() {
		float total = 0.0f;
		for(Clase12_ItemFactura item : this.items) {
			if(item == null) {
				continue;
			}
			total += item.CalcularImporte();
		}
		return total;
	}
	
	public String generarDetalle() {
		StringBuilder sb = new StringBuilder("Factura N");
		sb.append(folio)
		.append("\nCliente: ")
		.append(this.cliente.getNombre())
		.append("\t NIF: ")
		.append(cliente.getNif())
		.append("\nDescripcion:")
		.append(this.descripcion)
		.append("\n");
		sb.append("-----------------------------\n");
		SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
		sb.append("Fecha Emisión: ")
		.append(df.format(fecha))
		.append("\n")
		.append("\n#\tNombre:\t$\t Cant. \tTotal\n");
		sb.append("-----------------------------\n");
		for(Clase12_ItemFactura item: this.items) {
			if(item != null) {
				sb.append(item)
				.append("\n");
			}
		}
		sb.append("-----------------------------------\n");
		sb.append("\nGran Total: ")
		.append(calcularTotal());
		
		return sb.toString();
		
	}

	@Override
	public String toString() {
		return generarDetalle();
	}
	
}
