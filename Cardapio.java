
public class Cardapio {
	private RepositorioCardapio pratos;
	
	Cardapio(RepositorioCardapio rep){
		this.pratos = rep;
	}
	
	public void cadastrar(Prato prato) {
		String nomePrato = prato.getNome();
		if(!pratos.existePrato(nomePrato)) {
			pratos.adicionarPrato(prato);
		} else {
			throw new RuntimeException("Ja cadastrado");
		}
				
	}
	
	public void remover(Prato prato) {
		String nomePrato = prato.getNome();
		if(pratos.existePrato(nomePrato)) {
			pratos.removerPrato(prato);
		} else {
			throw new RuntimeException("Nao cadastrado");
		}
	}
	
	public String listar() {
		return pratos.listarPrato();
	}
	//completar com outras funcionalidades de cardapio
	
	
	
}
