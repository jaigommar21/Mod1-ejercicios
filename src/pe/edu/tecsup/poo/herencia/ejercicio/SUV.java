package pe.edu.tecsup.poo.herencia.ejercicio;

public class SUV extends Auto {

	@Override
	public void informacion() {
		// TODO Auto-generated method stub
		System.out.println("Auto de lujo con marca " + super.getMarca() );
	}

}
