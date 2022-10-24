package poo.clase11;

public class Clase11_Main {

	public static void main(String[] args) {

		Clase11_Automovil auto = new Clase11_Automovil();
		auto.setModelo("Spark");
		auto.setColor("Rojo");
		auto.setFabricante("Chevrolet");
		auto.setCilindraje("100 cc");
		auto.detalle();
		System.out.println(auto.acelerar(300));
		System.out.println(auto.frenar());
		System.out.println(auto.acelerarFrenar(50));
		
		System.out.println("kilometros por litro " + auto.calcularConsumo(300, 075f));
	
		System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));
	}

}
