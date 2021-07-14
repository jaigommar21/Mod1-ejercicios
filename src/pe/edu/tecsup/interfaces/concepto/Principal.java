package pe.edu.tecsup.interfaces.concepto;

public class Principal {

	public static void main(String[] args) {
		
		ServicioComprasInterface servicio = new ServiciosComprasWeb();

		servicio.realizarPedido();
		
		servicio.realizarPago();

	}

}
