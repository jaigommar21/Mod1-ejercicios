package pe.edu.tecsup.interfaces.concepto;

public class Principal {

	public static void main(String[] args) {
		
		// 
		ServiciosComprasInterface servicios = new ServiciosComprasWeb();

		servicios.realizarPedido();
		
		servicios.realizarPago();

		//
		ServiciosDeliveryInterface servicios_2 = new ServiciosComprasWeb();
		
		servicios_2.realizarSeguimientoPedido();
		
	}

}
