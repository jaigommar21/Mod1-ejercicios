package pe.edu.tecsup.colecciones;

import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio {

	/*
	  Crear una collecion de dias de la semana, incluir "feriado"	  
	  Cuantos dias hay
	  Luego eliminar feriado
	  Verificar si el dia miercoles esta en listado
	*/
	public static void main(String[] args) {

		Collection<String> diasSemanas 
			= new ArrayList<String>();
		
		diasSemanas.add("lunes");
		diasSemanas.add("martes");
		diasSemanas.add("miercoles");
		diasSemanas.add("feriado");
		
		System.out.println(diasSemanas.size());
		
		diasSemanas.remove("feriado");
		System.out.println(diasSemanas);
		
		if (diasSemanas.contains("miercoles")) {
			System.out.println("Tiene el dia miercoles");
		} else {
			System.out.println("NO tiene el dia miercoles");
		}
		
		
		
		
	}

}
