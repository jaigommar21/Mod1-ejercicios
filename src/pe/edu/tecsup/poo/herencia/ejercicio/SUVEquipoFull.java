package pe.edu.tecsup.poo.herencia.ejercicio;

public class SUVEquipoFull extends SUV {
	
	protected String extraGarantia;

	@Override
	public void informacion() {
		// Que imprimas la marca y el año
		System.out.println("Auto de lujo con marca " + super.getMarca() );
		System.out.println("Auto de lujo del año " + super.anho );
		System.out.println("Auto de lujo con extra garantia de " + this.extraGarantia );

	}
}
