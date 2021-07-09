package pe.edu.tecsup.poo.herencia.ejercicio;

public class Auto {

	private String marca;
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
	
	
	
}
