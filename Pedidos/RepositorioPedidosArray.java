public class RepositorioPedidosArray implements RepositorioPedidos {
	Pedidos arrayPedido[] = new Pedidos[100];
    public boolean verificar(Pedidos pedido) {
    	for(int i =0; i<100; i++) {
    		if(arrayPedido[i].equals(pedido)) {
    			return true;
    		} 
    	}
    	return false;
    }
	public void inserir(Pedidos pedido) {
		for (int i = 0; i < 100; i++) {
			if (arrayPedido[i] == null) {
				arrayPedido[i] = pedido;
			}
		}
	}

	public void remover(Pedidos pedido) {
		for (int i = 0; i < 100; i++) {
			if (arrayPedido[i].equals(pedido)) {
				arrayPedido[i] = null;
			}
		}
	}
	public void atualizar(Pedidos pedido, int novaQuantidade) {
		for(int i=0; i<100; i++) {
			if(arrayPedido[i] == pedido) {
				pedido.setQuantidadePratos(novaQuantidade);
			}
		}
	}

	public String listar() {
		String tudo = "";
		for (int i = 0; i < 100 && !arrayPedido.equals(null); i++) {
			tudo += arrayPedido[i] + "\n";
		}
        return tudo;
	}
}