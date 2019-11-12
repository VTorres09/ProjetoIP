package pedidos;

public class PedidoJaCadastradoException extends Exception {
	public PedidoJaCadastradoException() {
      super ("Esse pedido já está cadastrado.");
	}
}
