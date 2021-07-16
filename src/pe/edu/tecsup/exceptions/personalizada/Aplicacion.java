package pe.edu.tecsup.exceptions.personalizada;

public class Aplicacion {

	public static void main(String[] args) {
		
		String nota = "12as" ; //"12as";
		
		try {

			if (evaluarNota(nota) )
				throw new MiExcepcion("Error personal");
			
			
			int notaInt = Integer.parseInt(nota);
			System.out.println(notaInt + 2);
			
		} catch (MiExcepcion e) {
			System.err.println(e.getMessage());
		}
		
		
	}

	private static boolean evaluarNota(String nota) {
		// TODO
		return true;
	}

}

/*
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "12as"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at pe.edu.tecsup.exceptions.personalizada.Aplicacion.main(Aplicacion.java:8)
*/
