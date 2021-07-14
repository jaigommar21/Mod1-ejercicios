package pe.edu.tecsup.exceptions.lector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
		
		// Ingreso de texto
		
		System.out.print("Ingrese un texto : ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
		System.out.println("Mensaje ingresado : " + cadena);

		
		
		// Ingreso de entero
		
		System.out.print("Ingrese un entero : ");
		boolean flag = true;
		while(flag)
			try {
				int entero = sc.nextInt();	// 12 (Enter)
				flag = false;
				System.out.println("Numero ingresado : " + entero);
			} catch(InputMismatchException e) {
				System.err.println("Debe ingresar un valor entero!");
				sc.nextLine();
			}
		
		sc.close();
	}

}
