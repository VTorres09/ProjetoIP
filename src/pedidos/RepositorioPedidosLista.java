package pedidos;
public class RepositorioPedidosLista implements RepositorioPedidos{
	private Pedidos pedido;
	private RepositorioPedidosLista prox;

	public RepositorioPedidosLista() {
		this.pedido = null;
		this.prox = null;
	}
	public boolean verificar(Pedidos pedido) {
		if(this.pedido == pedido) {
			return true;
		} else if (this.prox != null) {
			return this.prox.verificar(pedido);
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
	public void atualizar(Pedidos pedido,int novaQuantidade) {
		if(this.pedido == pedido) {
			pedido.setQuantidadePratos(novaQuantidade);
		}
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
	public Pedidos procurar(Pedidos pedido) throws PedidoNaoExistenteException {
		if(this.pedido == pedido) {
			return pedido;
		} else if (this.prox !=null){
			return this.prox.procurar(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}
	}
}