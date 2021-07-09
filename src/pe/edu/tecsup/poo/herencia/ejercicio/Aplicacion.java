package pe.edu.tecsup.poo.herencia.ejercicio;
/*
Cuando se instancie una clase , el método información debe imprimir por consola lo siguiente:
- Auto ==> "Auto generico"
- AutoDeportivo ==> "Auto de lujo"
- SUV ==> "Auto famliar"
- Camioneta ==> "Auto generico"
*/
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto = new Auto();
		auto.informacion();
		
		Auto camioneta = new Camioneta();
		camioneta.informacion();

		Auto suv = new SUV();
		suv.informacion();
	}

}
