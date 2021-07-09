package pe.edu.tecsup.poo.herencia.ejercicio;

public class Auto {

	//public 
	
	private String marca; // 1.- No puede ser accedida desde los hijos 
	                      // 2.- No puede ser accedida desde una instancia
	protected String anho;  // 1.- las clases del mismo paquete pueden
	                        //     acceder a los atributos/metodos protected.
	                        // 2.- Las clases hijas pueden acceder a los 
	                        //     atributos/metodos protected.
	                        // 3.- Clases de otros paquetes no pueden acceder 
	                        //     a los atributos/metodos protected
	// default
	
	
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
