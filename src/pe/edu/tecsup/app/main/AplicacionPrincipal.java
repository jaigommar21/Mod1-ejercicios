package pe.edu.tecsup.app.main;


import pe.edu.tecsup.app.modelos.Persona;
import pe.edu.tecsup.app.utils.Fecha;

public class AplicacionPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fechaActual = Fecha.getFechaActual();
		System.out.println(fechaActual);

		Persona trabajador01 = new Persona();
		trabajador01.setNombre("Jaime");
		trabajador01.setApellido("Gomez");
		trabajador01.setDni("12345678");
		
//		System.out.println(trabajador01.getNombre());
//		System.out.println(trabajador01.getApellido());

		System.out.println(trabajador01);
//		System.out.println(trabajador01.toString());
	}

}
