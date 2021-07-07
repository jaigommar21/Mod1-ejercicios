package pe.edu.tecsup.poo.metodos.caso3;

// Ejercicio : usar la clase Departamento y crear el metodo
//             calcularArea() , el metodo debe retonar
//             los metros cuadrados 
//             Debe crear la clase Presupuesto [ main()] donde 
//             debe calcular el precio del Dpto sabiendo que el 
//             metro cuadrado esta 4000 soles

public class Presupuesto {
	
	public static double VALOR_METRO_2 = 4000;
	
	public static void main(String[] args) {
		// Define variables
		Departamento depa = new Departamento();
		double area;
		double precioDepartamento;

		// Inicializa valores del dpto.
		depa.setAncho(6);
		depa.setLargo(15);
		
		// Calcula el area
		area = depa.calcularArea();
		
		// Calcula el precio
		precioDepartamento = area * VALOR_METRO_2;

		// Muestra resultados	
		System.out.println(String.format("El precio del Departamento es S/ %.2f", precioDepartamento));
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento dpto = new Departamento(0, 0, 0);
		int a = 10;
		int b = 3;	
		int c = 4000;
		
	
		int pintar = dpto.pintar(a, b);
		System.out.println("El precio es " + pintar* c);
		
	}*/
}
