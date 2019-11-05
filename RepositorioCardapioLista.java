
public class RepositorioCardapioLista implements RepositorioCardapio{
	private Prato prato;
	private RepositorioCardapioLista proximo;
	
	RepositorioCardapioLista(){
		this.prato = null;
		this.proximo = null;
	}
		
	public void adicionarPrato(Prato prato) {
		if (this.prato == null) {
			this.prato = prato;
			this.proximo = new RepositorioCardapioLista();
		} else {
			this.proximo.adicionarPrato(prato);
		}
	}
	
	public void removerPrato(Prato prato) {
		if (this.prato != null) {
			if (this.prato == prato) {
				this.prato = this.proximo.prato;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.removerPrato(prato);
			}
		} else {
			throw new RuntimeException("Erro");
		}
	}
	
	public String listarPrato(RepositorioCardapio repositorioCardapio) {
		String retorno = "";
		while (this.prato != null) {
			retorno = retorno +this.prato +", ";
			this.prato = this.proximo.prato;
			this.proximo = this.proximo.proximo;
		}
		return retorno ;
	}
	
	public boolean existePrato(String nomePrato) {
		if(this.prato != null) {
			if(this.prato.getNome() == nomePrato) {
				return true;
			} else {
				return this.proximo.existePrato(nomePrato);				
			}
		} else {
			return false;
		}
	}
	


}
	
	
	
	
	
	
	
	
	
	
	

