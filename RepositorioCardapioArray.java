
public class RepositorioCardapioArray implements RepositorioCardapio {
	private Prato[] arrayPratos;
	private int cont;
	
	RepositorioCardapioArray(int tamanho){
		this.arrayPratos = new Prato[tamanho];
		this.cont = 0;
	}

	public void adicionarPrato(Prato prato) {
		arrayPratos[cont] = prato;
		cont++;
	}

	public void removerPrato(Prato prato) {
		for(int i = 0; i<cont; i++) {
			if(arrayPratos[i] == prato) {
				for(int k = i+1; k<cont; k++) {
					arrayPratos[k-1] = arrayPratos[k];
				}
			}
		}
		cont--;

	}

	public String listarPrato() {
		String retorno = "-------- Cardápio --------" + "\n";
		for (int i = 0; i < cont; i++) {			
			retorno += "Nome: " + arrayPratos[i].getNome() + "\n" + "Preço: " + arrayPratos[i].getPreco() + "\n"
					+ "Ingredientes: " + arrayPratos[i].getIngredientes() + "\n" + "--------------------------" + "\n";	
		}
		return retorno;
	}

	public boolean existePrato(String nomePrato) {
		boolean retorno = false;
		for(int i = 0; i<cont; i++) {
			if(arrayPratos[i].getNome().equals(nomePrato)) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	public void atualizarPrato(Prato prato) {
		
	}


} 