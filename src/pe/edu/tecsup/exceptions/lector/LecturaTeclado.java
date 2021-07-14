package pe.edu.tecsup.exceptions.lector;

import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
		
		System.out.print("Ingrese un texto : ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
		System.out.println("Mensaje ingresado : " + cadena);
		
	}

}
