package pedidos;

public class CadastroPedidos {
	private RepositorioPedidos repositorio;

	public CadastroPedidos(RepositorioPedidos repPedidos) {
		this.repositorio = repPedidos;
	}

	public void cadastrar(Pedidos pedido) throws PedidoJaCadastradoException {
		if (repositorio.existe(pedido)) {
			throw new PedidoJaCadastradoException();
			
		} else {
			repositorio.inserir(pedido);
		}
	}

	public void remover(Pedidos pedido)  throws PedidoNaoExistenteException {
		if(repositorio.existe(pedido)) {
			repositorio.remover(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}

	}
    public void atualizar(Pedidos pedido) throws PedidoNaoExistenteException  {
    	if(repositorio.existe(pedido)) {
			repositorio.atualizar(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}
    }
	
   public String imprimir() throws NaoExistemPedidosException{
	   if(repositorio.listar().contentEquals("")) {
	    throw new NaoExistemPedidosException();
	   } else {
		  return repositorio.listar();
	   }
   }
   public RepositorioPedidos getPedidos() {
	   return this.repositorio;
   }

}
