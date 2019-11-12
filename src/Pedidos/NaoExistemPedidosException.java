package Pedidos;

public class NaoExistemPedidosException extends Exception {
public NaoExistemPedidosException() {
	super ("Ainda não foram realizados pedidos.");
}
}
