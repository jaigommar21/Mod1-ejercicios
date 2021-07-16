package pe.edu.tecsup.interfaces.concepto;

public class ServiciosComprasMovil 
	implements ServiciosComprasInterface, 
				ServiciosDeliveryInterface {

	@Override
	public void realizarSeguimientoPedido() {
		System.out.println("Realizar seguimiento de pedido desde el movil");

	}

	@Override
	public void realizarPedido() {
		System.out.println("Realizar pedido desde el movil");

	}

	@Override
	public void realizarPago() {
		System.out.println("Realizar pago del pedido desde el movil");


	}

}
