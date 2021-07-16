package pe.edu.tecsup.util.math;

public class TestMathApp {

	public static void main(String[] args) {
		
		// random
		for(int i=0; i<10; i++) {
			double valor = Math.random();
			System.out.println("valor: " + valor);
		}
		
		System.out.println(Math.round(4.7));
		System.out.println(Math.round(4.2));
		
		
		// 1 - 100
		for(int i=0; i<10; i++) {
			// [ round(0*100); round(1*100) >
			long valor = Math.round(Math.random() * 5) + 5;
			System.out.println("valor: " + valor);
		}
		
		
		double test = 12.3;
		System.out.println( Math.round(test) );
		System.out.println( Math.ceil(test) );
		System.out.println( Math.floor(test) );
		
		test = 12.7;
		System.out.println( Math.round(test) );
		System.out.println( Math.ceil(test) );
		System.out.println( Math.floor(test) );
		
		System.out.println(Math.pow(10, 2));
		
		



	/*  TAREA para el JUEVES 
	   Crear 5 numeros aleatorios entre 0 y 50
	   Agregar el valor 3 a cada numero aleatorio
	   Encontrar el entero superior proximo
	   Elevar a las potencia de 2 los numeros obtenidos en el paso anterio
	
	 */
	

		double numero; 
		int enteroSuperior;
		double potencia;
		for (int i = 1; i <= 5; i++) {
			numero = Math.random() * 50 + 3;
			enteroSuperior = (int) Math.ceil(numero);
			potencia =  Math.pow(enteroSuperior, 2);
			System.out.println(	numero + 
								String.format("%c", 9) + enteroSuperior +
								String.format("%c", 9) + potencia);
		}

	}
	
}
