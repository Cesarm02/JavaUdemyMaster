package poo.clase14.Herencia;

public class Clase14_AlumnoInternacional extends Clase14_Alumno {

	private String pais;
	private double notaIdiomas;
	
	public Clase14_AlumnoInternacional() {
		System.out.println("Internacional");
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}
	
	
	
}
