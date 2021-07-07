package pe.edu.tecsup.poo.metodos.caso3;

public class Departamento {
	//
	private double largo;
	private double ancho;
	private int nroPiso;
	private String nroPuerta;
	
	//
	public Departamento() {
		this.largo=10.2;
		this.ancho=5.5;
		this.nroPiso= 4;
		this.nroPuerta="10";
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
	
}
