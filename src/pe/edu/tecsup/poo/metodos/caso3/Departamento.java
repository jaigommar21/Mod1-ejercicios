package pe.edu.tecsup.poo.metodos.caso3;

public class Departamento {
	//
	private double largo;
	private double ancho;
	private int nroPiso;
	private String nroPuerta;

	
	//
	public Departamento() {

	}
	
	public Departamento(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public Departamento(double largo) {
		this.largo = largo;
	}
	
	
	public Departamento(double largo, double ancho, int nroPiso, String nroPuerta) {
		this.largo = largo;
		this.ancho = ancho;
		this.nroPiso = nroPiso;
		this.nroPuerta = nroPuerta;
	}
	
	public void info() {
		System.out.print("El ancho del departamente es: "+ancho+" y el largo es "+largo);
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public int getNroPiso() {
		return nroPiso;
	}
	public void setNroPiso(int nroPiso) {
		this.nroPiso = nroPiso;
	}
	public String getNroPuerta() {
		return nroPuerta;
	}
	public void setNroPuerta(String nroPuerta) {
		this.nroPuerta = nroPuerta;
	}
	
	public double calcularArea() {
		return getAncho() * getLargo();
	}
	
	public int pintar(int a, int b) {
		int pintar = a * b ;
		System.out.println("El area es de " + pintar);
		return pintar;
		
	}
}
