package pedidos;
public class RepositorioPedidosArray implements RepositorioPedidos {
	Pedidos arrayPedido[] = new Pedidos[100];
	
    public boolean verificar(Pedidos pedido) {
    	for(int i =0; i<100; i++) {
    		if(arrayPedido[i]!=null && arrayPedido[i].equals(pedido)) {
    			return true;
    		} 
    	}
    	return false;
    }
	public void inserir(Pedidos pedido) {
		int contador = 0;
		while(arrayPedido[contador]!=null) {
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
	public void atualizar(Pedidos pedido, int novaQuantidade) {
		for(int i=0; i<100; i++) {
			if(!arrayPedido[i].equals(null) && arrayPedido[i] == pedido) {
				pedido.setQuantidadePratos(novaQuantidade);
			}
		}
	}

	public String listar() {
		String tudo = "";
		for (int i = 0; i < 100 && arrayPedido[i]!= null; i++) {
			tudo += arrayPedido[i] + "\n";
		}
        return tudo;
	}
	
	public Pedidos procurar(Pedidos pedido)  throws PedidoNaoExistenteException {
		for(int i =0; i<100 && arrayPedido[i]!=null; i++) {
			if(arrayPedido[i] == pedido) {
				return pedido;
			} 
		
			}
		throw new PedidoNaoExistenteException();
	}
}