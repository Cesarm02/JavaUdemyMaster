package poo.clase14.Herencia;

public class Clase14_Alumno extends Clase14_Persona{
	private String instituto;
	private double notaMat;
	private double notaEsp;
	private double notaHis;

	public Clase14_Alumno() {
		System.out.println("Alumno");
	}
	
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public double getNotaMat() {
		return notaMat;
	}
	public void setNotaMat(double notaMat) {
		this.notaMat = notaMat;
	}
	public double getNotaEsp() {
		return notaEsp;
	}
	public void setNotaEsp(double notaEsp) {
		this.notaEsp = notaEsp;
	}
	public double getNotaHis() {
		return notaHis;
	}
	public void setNotaHis(double notaHis) {
		this.notaHis = notaHis;
	}
	
	
}
