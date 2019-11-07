
public class ConjuntoPedidos {
	private RepositorioPedidos repositorio;

	public ConjuntoPedidos(RepositorioPedidos repositorio) {
		this.repositorio = repositorio;
	}

	public void cadastrar(Pedidos pedido) {
		if (repositorio.verificar(pedido)) {
			repositorio.inserir(pedido);
		}
	}

	void cancelar(Pedidos pedido) {
		repositorio.remover(pedido);

	}
    
	void alterar(Pedidos pedido, int novaQuantidade) {
		if(repositorio.verificar(pedido)) {
			repositorio.atualizar(pedido, novaQuantidade);
		}
	}
	
   String imprimir(){
	 return  repositorio.listar();
   }

}
