package pe.edu.tecsup.poo.herencia.ejercicio;

public class SUV extends Auto {

	@Override
	public void informacion() {
		// Que imprimas la marca y el año
		System.out.println("Auto de lujo con marca " + super.getMarca() );
		System.out.println("Auto de lujo del año " + super.getAnho() );

	}

}
