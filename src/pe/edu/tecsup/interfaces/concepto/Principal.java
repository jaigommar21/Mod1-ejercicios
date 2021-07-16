package pe.edu.tecsup.interfaces.concepto;

public class Principal {

	public static void main(String[] args) {
		
		// 
		ServiciosComprasInterface servicios = new ServiciosComprasMovil();

		servicios.realizarPedido();
		
		servicios.realizarPago();

		//
		ServiciosDeliveryInterface servicios_2 = new ServiciosComprasMovil();
		
		servicios_2.realizarSeguimientoPedido();
		
	}

}
