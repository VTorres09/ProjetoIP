
public class RepositorioCardapioArray implements RepositorioCardapio {
	private Prato[] arrayPratos = new Prato[100];

	public void adicionarPrato(Prato prato) {
		boolean parada = true;

		for (int i = 0; i < arrayPratos.length; i++) {
			while (parada) {
				if (arrayPratos[i] == null) {
					arrayPratos[i] = prato;
					parada = false;
				}
			}
		}
	}

	public void removerPrato(Prato prato) {
		boolean parada2 = true;
		for (int i = 0; i < arrayPratos.length; i++) {
			while (parada2) {
				if (arrayPratos[i] == prato) {
					arrayPratos[i] = null;
					parada2 = false;
				}
			}
		}

	}

	public String listarPrato(RepositorioCardapio repositorioCardapio) {
		String retorno = "";
		boolean parada3 = true;
		for (int i = 0; i < arrayPratos.length; i++) {
			while(arrayPratos[i] != null) {
			retorno = "Nome: " + arrayPratos[i].getNome() + "\n" + "Preço: " + arrayPratos[i].getPreco() + "\n"
					+ "Ingredientes: " + arrayPratos[i].getIngredientes();
		}
		}
		return retorno;
	}

	public boolean existePrato(String nomePrato) {
		boolean retorno = false;
		for(int i = 0; i<arrayPratos.length; i++) {
			if(arrayPratos[i] != null) {
			if(arrayPratos[i].getNome() == nomePrato) {
				retorno = true;
			}
			}
		}
		return retorno;
	}


}
