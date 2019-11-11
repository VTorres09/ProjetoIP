package Pedidos;

public class ConjuntoPedidos {
	private static RepositorioPedidos repositorio;

	public ConjuntoPedidos(String tipo) {
		if(tipo.equals("Lista")) this.repositorio = new RepositorioPedidosLista();
		if(tipo.equals("Array")) this.repositorio = new RepositorioPedidosArray();
	}

	public static void cadastrar(Pedidos pedido) throws PedidoJaCadastradoException {
		if (repositorio.verificar(pedido)) {
			throw new PedidoJaCadastradoException();
			
		} else {
			repositorio.inserir(pedido);
		}
	}

	void cancelar(Pedidos pedido)  throws PedidoNaoExistenteException {
		if(repositorio.verificar(pedido)) {
			repositorio.remover(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}

	}
    
	void alterar(Pedidos pedido, int novaQuantidade) throws CadastroNaoRealizadoException {
		if(repositorio.verificar(pedido)) {
			repositorio.atualizar(pedido, novaQuantidade);
		} else {
			throw new CadastroNaoRealizadoException();
		}
	}
   static String imprimir() throws NaoExistemPedidosException{
	   if(repositorio.listar().contentEquals("")) {
	    throw new NaoExistemPedidosException();
	   } else {
		  return repositorio.listar();
	   }
   }

}
