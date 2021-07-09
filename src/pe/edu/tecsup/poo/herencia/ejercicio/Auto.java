package pe.edu.tecsup.poo.herencia.ejercicio;

public class Auto {

	private String marca; // 1.- No puede ser accedida desde los hijos 
	                      // 2.- No puede ser accedida desde una instancia
	private String anho;
	
	public void informacion() {
		System.out.println("Auto generico con marca : " + this.marca );
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnho() {
		return anho;
	}

	public void setAnho(String anho) {
		this.anho = anho;
	}
	
	
	
}
