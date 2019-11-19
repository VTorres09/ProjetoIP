package pedidos;

public class CadastroPedidos {
	private RepositorioPedidos repositorio;

	public CadastroPedidos(RepositorioPedidos repPedidos) {
		this.repositorio = repPedidos;
	}

	public void cadastrar(Pedidos pedido) throws PedidoJaCadastradoException, IngredientesInsuficientesException{
		boolean disponibilidade = true;
		if (repositorio.existe(pedido)) {
			throw new PedidoJaCadastradoException();		
		} else {
			for(int i = 0; i<pedido.getPrato().getIngredientes().length; i++) {
				if(pedido.getPrato().getIngredientes()[i].getQtd() == 0) {
					disponibilidade = false;
				}
			}		
			if(disponibilidade) {
				repositorio.inserir(pedido);
				} else {
					throw new IngredientesInsuficientesException();
				}		
		}
	}

	public void remover(Pedidos pedido)  throws PedidoNaoCadastradoException {
		if(repositorio.existe(pedido)) {
			repositorio.remover(pedido);
		} else {
			throw new PedidoNaoCadastradoException();
		}

	}
    public void atualizar(Pedidos pedido) throws PedidoNaoCadastradoException  {
    	if(repositorio.existe(pedido)) {
			repositorio.atualizar(pedido);
		} else {
			throw new PedidoNaoCadastradoException();
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
   
   boolean verificar(Pedidos pedido) {
	   if(repositorio.existe(pedido)) {
		   return true;
	   }
	   return false;
   }
   Pedidos procurar(Pedidos pedido) throws PedidoNaoCadastradoException {
	   return repositorio.procurar(pedido);
   }

}
