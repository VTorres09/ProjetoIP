package pedidos;

import pratos.Prato;

public interface RepositorioPedidos {
	void inserir(Pedidos pedido);
	void remover(Pedidos pedido);
	void atualizar(Pedidos pedido);
	String listar(); 
	boolean existe(Pedidos pedido);
	Pedidos procurar(Pedidos pedido) throws PedidoNaoCadastradoException;
	double consumoMesa();
}