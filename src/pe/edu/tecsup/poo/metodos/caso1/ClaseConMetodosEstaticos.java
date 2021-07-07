package pe.edu.tecsup.poo.metodos.caso1;

/**
 *  Usando metodos estaticos
 *  
 * @author mbtec22
 *
 */
public class ClaseConMetodosEstaticos {

	public static void main(String[] args) {

		int ope1 = 12;
		int ope2 = 14;
		
		imprimirSuma(ope1,ope2);
		imprimirResta(ope1, ope2);
		imprimirSignoDeResta(ope1, ope2);

		int suma = retornarSuma(ope1,ope2);
		System.out.println("La suma es " + suma);
		
	}

	/**
	 *  Metodo que recibe 2 parametros y no retorna ningun valor
	 * @param a
	 * @param b
	 */
	public static void imprimirSuma(int a, int b) {

		int suma = a + b ;
		System.out.println("La suma es " + suma);
		//System.out.format("La suma es %d",suma);
		
	}
	
	// Implementar un metodo estatico que imprima 
	// la resta de dos numero
	
	public static void imprimirResta(int a, int b) {
		int resta = a-b;
		System.out.println("La resta es "+resta);
	}
	
	
	// Implementar un metodo estatico que imprima
	// si la resta es positiva o negativa.
	public static void imprimirSignoDeResta(int a , int b) {
		int resta = a-b;
		if(resta>= 0) {
			System.out.println("La resta es positiva");
		}else {
			System.out.println("La resta es negativa");
		}
	}
	
	
	
	/**
	 *  Metodo que recibe 2 parametros y retorna la suma
	 * @param a
	 * @param b
	 */
	public static int retornarSuma(int a, int b) {

		int suma = a + b ;
		return suma ;
		
	}

	// Implementar un metodo para retornar la resta
	// de dos numeros
	
	
	// Implementar un metodo para retornar el signo
	// ("positivo" o "negativo") de una resta

}
