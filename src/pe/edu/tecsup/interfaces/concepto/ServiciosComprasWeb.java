package pe.edu.tecsup.interfaces.concepto;

public class ServiciosComprasWeb 
	implements ServiciosComprasInterface {

	@Override
	public void realizarPedido() {
		System.out.println("Realizar pedido desde la web");
	}

	@Override
	public void realizarPago() {
		System.out.println("Realizar pago desde la web");

	}

}
