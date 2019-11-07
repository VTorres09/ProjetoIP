package Pedidos;

public class PedidoNaoExistenteException extends Exception{
public PedidoNaoExistenteException() {
	super ("Não foi possível cancelar pedido. Pedido não existe.");
}
}
