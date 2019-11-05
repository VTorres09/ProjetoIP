public class RepositorioCardapioLista implements RepositorioCardapio {
	private Prato prato;
	private RepositorioCardapioLista proximo;

	RepositorioCardapioLista() {
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
			retorno = retorno + "Nome: " + this.prato.getNome() + "\n" + "Valor: " + this.prato.getPreco() + "\n"
					+ "Ingredientes: " + listarIngredientes(this.prato) + "\n" + "--------------------------" + "\n";
			this.prato = this.proximo.prato;
			this.proximo = this.proximo.proximo;
		}
		return retorno;
	}
	
	public String listarIngredientes(Prato prato) {
	String retorno = "";
		if (this.prato != null) {
			if (this.prato == prato) {
				for(int i = 0; i<this.prato.getIngredientes().length; i++) {
					if(i == this.prato.getIngredientes().length-1) {
					retorno += this.prato.getIngredientes()[i].getNome() + ".";
					} else {
					retorno += this.prato.getIngredientes()[i].getNome() + ", ";
					}
					
				}
			} else {
				this.proximo.listarIngredientes(prato);
			}
			
		} else {
			throw new RuntimeException("Esse prato nao existe");
		}
		return retorno;
	}

	public boolean existePrato(String nomePrato) {
		if (this.prato != null) {
			if (this.prato.getNome().equals(nomePrato)) {
				return true;
			} else {
				return this.proximo.existePrato(nomePrato);
			}
		} else {
			return false;
		}
	}

	public void atualizarPrato(Prato prato) {
		
	}

}
