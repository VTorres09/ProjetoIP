
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
	
	public String listarPrato() {
		String retorno = "-------- Cardápio --------" + "\n";
		while (this.prato != null) {
			retorno = retorno + "Nome: " + this.prato.getNome() +"\n" + "Valor: " + this.prato.getPreco() + "\n" + "Ingredientes: "+this.prato.getIngredientes() + "\n" + "--------------------------" + "\n";
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
	
	
	
	
	
	
	
	
	
	
	

