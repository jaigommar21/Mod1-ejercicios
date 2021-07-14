package pe.edu.tecsup.util.math;

public class EjercicioMath {

	/*
	   Crear 5 numeros aleatorios entre 0 y 50
	   Agregar 3 a cada numero aleatorio
	   Encontrar el entero superior proximo
	   Elevar a las potencia de 2 los numeros obtenidos en el paso anterio
	 */

	final static int MAX_VALOR = 50;
	final static int MIN_VALOR = 35;
	final static int OFFSET = 0;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		for(int i=0;i<5;i++) {
            double num=0;
            num= (Math.random()*100); //(MAX_VALOR-MIN_VALOR)+OFFSET);
            //Aumento 3
            //num=num+3;
            //Entero superior
            System.out.println("num >> " + num);
            double enteroSuperior=Math.ceil(num);
            System.out.println("enteroSuperior >> " + enteroSuperior);
            //Elevar a la potencia
            double potencia=Math.pow(enteroSuperior,2);
            System.out.println("potencia >> " +potencia);
        }
		//*
		double [] numerosRandom = new double[5];
        for(int i=0; i<numerosRandom.length; i++){
            numerosRandom[i]= Math.ceil(Math.random() * 50);
            System.out.println("Numero: " + numerosRandom[i] + 
            		" - Elevado: " + Math.pow(numerosRandom[i], 2));
        }
	     //*/   
	}

}
