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
		//auto.marca = "Toyota";
		auto.setMarca("Toyota");
		auto.informacion();
		
		Auto camioneta = new Camioneta();
		camioneta.setMarca("Nissan");
		camioneta.informacion();

		Auto suv = new SUV();
		suv.setMarca("Chevrolet");
		//suv.setAnho("2020");
		suv.anho = "2020";
		suv.informacion();
		
		SUVEquipoFull suvFull = new SUVEquipoFull(); // new SUVEquipoFullPirata();
		suvFull.setMarca("Critroen");
		suvFull.setAnho("2019");
		suvFull.extraGarantia = "4";
		suvFull.informacion();
		
	}

}
