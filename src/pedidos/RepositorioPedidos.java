package pedidos;

public interface RepositorioPedidos {
	void inserir(Pedidos pedido);
	void remover(Pedidos pedido);
	void atualizar(Pedidos pedido);
	String listar(); //metodo "procurar"
	boolean existe(Pedidos pedido);
	Pedidos procurar(Pedidos pedido) throws PedidoNaoExistenteException;
}