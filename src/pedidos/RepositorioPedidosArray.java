package pedidos;

import ingredientes.Ingrediente;
import pratos.Prato;

public class RepositorioPedidosArray implements RepositorioPedidos {
	Pedidos arrayPedido[] = new Pedidos[100];

	public boolean existe(Pedidos pedido) {
		for (int i = 0; i < 100; i++) {
			if (arrayPedido[i] != null && arrayPedido[i].equals(pedido)) {
				return true;
			}
		}
		return false;
	}

	public void inserir(Pedidos pedido) {
		int contador = 0;
		while (arrayPedido[contador] != null) {
			contador++;
		}
		arrayPedido[contador] = pedido;

	}

	public void remover(Pedidos pedido) {
		for (int i = 0; i < 100; i++) {
			if (!arrayPedido[i].equals(null) && arrayPedido[i].equals(pedido)) {
				arrayPedido[i] = null;
			}
		}
	}

	public void atualizar(Pedidos pedido) {
		for (int i = 0; i < 100; i++) {
			if (!arrayPedido[i].equals(null) && arrayPedido[i] == pedido) {
				arrayPedido[i] = pedido;
			}
		}
	}

	public Pedidos procurar(Pedidos pedido) throws PedidoNaoCadastradoException {
		for (int i = 0; i < 100 && arrayPedido[i] != null; i++) {
			if (arrayPedido[i] == pedido) {
				return pedido;
			}
		}
		throw new PedidoNaoCadastradoException();
	}

	public double consumoMesa() throws NaoExistemPedidosException{
		double conta = 0;
		for (int i = 0; i < 100 && arrayPedido[i] != null; i++) {
			conta += ((arrayPedido[i].getPrato().getPreco()) * (arrayPedido[i].getQuantidadePratos()));
		}
		return conta;
	}
}