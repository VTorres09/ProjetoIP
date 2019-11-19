package pedidos;

import ingredientes.Ingrediente;
import pratos.Prato;

public class RepositorioPedidosLista implements RepositorioPedidos{
	private Pedidos pedido;
	private RepositorioPedidosLista prox;

	public RepositorioPedidosLista() {
		this.pedido = null;
		this.prox = null;
	}
	public boolean existe(Pedidos pedido) {
		if(this.pedido == pedido) {
			return true;
		} else if (this.prox != null) {
			return this.prox.existe(pedido);
		} else {
			return false;
		}
	}
	public void inserir(Pedidos pedido) {
		if(this.pedido == null) {
			this.pedido = pedido;
			this.prox = new RepositorioPedidosLista();
		} else {
			this.prox.inserir(pedido);
		}
	}
	public void remover(Pedidos pedido) {
		if(this.prox.pedido == pedido) {
			this.prox = this.prox.prox;
			this.prox = null;
		} else {
			this.prox.remover(pedido);
		}
	}
	public void atualizar(Pedidos pedidos) {
		if (this.pedido.getIdentificador().equals(pedidos.getIdentificador())) {
			this.pedido = pedidos;
		} else
			this.prox.atualizar(pedidos);
	}

	public String listar() {
		String tudo = "";
		if(this.pedido == null) {
			tudo += "";
		} else {
			tudo += this.pedido.toString() + "\n";
		}
		return tudo;
	}
	
	public Pedidos procurar(Pedidos pedido) throws PedidoNaoCadastradoException {
		if(this.pedido == pedido) {
			return pedido;
		} else if (this.prox !=null){
			return this.prox.procurar(pedido);
		} else {
			throw new PedidoNaoCadastradoException();
		}
	}

	public double consumoMesa() {
		double conta = 0;
		if(this.pedido == null) {
			conta += 0;
		} else {
			conta += ((this.pedido.getPrato().getPreco())*(this.pedido.getQuantidadePratos())) + (this.prox.consumoMesa());
		}
		return conta;
	}
}