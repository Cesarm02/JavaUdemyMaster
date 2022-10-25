package poo.clase12.Principal;

import java.util.Scanner;

import poo.clase12.modelo.*;

public class CLase12_EjemploFactura {

	public static void main(String[] args) {

		Clase12_Cliente cliente= new Clase12_Cliente();
		cliente.setNif("5555-5");
		cliente.setNombre("Cesar");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la descripción de la factura");
		String desc = in.nextLine();
		Clase12_Factura factura = new Clase12_Factura(desc, cliente);
		
		Clase12_Producto producto;
		System.out.println();
		
		for(int i = 0; i <5 ; i++) {
			producto = new Clase12_Producto();
			System.out.print("Ingrese producto n. "+producto.getCodigo() + " :");
			producto.setNombre(in.nextLine());
			
			System.out.print("Ingrese el precio: ");
			producto.setPrecio(in.nextFloat());
			
			System.out.print("Ingrese la cantidad: ");
			
			Clase12_ItemFactura item = new Clase12_ItemFactura(in.nextInt(), producto);
			factura.addItemFactura(item);
			
			System.out.println();
			in.nextLine();
		}
		System.out.println(factura.generarDetalle());
	}

}
