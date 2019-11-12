package Pedidos;

public interface RepositorioPedidos {
	void inserir(Pedidos pedido);
	void remover(Pedidos pedido);
	void atualizar(Pedidos pedido, int novaQuantidade);
	String listar(); //metodo "procurar"
	boolean verificar(Pedidos pedido);
	Pedidos procurar(Pedidos pedido) throws PedidoNaoExistenteException;
}