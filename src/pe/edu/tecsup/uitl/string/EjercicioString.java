package pe.edu.tecsup.uitl.string;

public class EjercicioString {
		/*
	    Crear un aplicacion para reemplazar la palabra
	    "Jueves" por "Miercoles" , y luego imprimir
	    todas las palabra de la frase por linea en mayuscula
		 */
		public static void main(String[] args) {
			
			String s = "Hoy es Jueves por la noche";
			
			s = s.replace("Jueves", "Miércoles");
			
			String palabras[] = s.split(" ");
			for(String item : palabras) {
				System.out.println(item.toUpperCase());
			}
		}
}
