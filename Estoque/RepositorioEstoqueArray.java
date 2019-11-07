package Projeto;

public class RepositorioEstoqueArray implements RepositorioEstoque {
	private Ingrediente[] estoque;
	private int contadorLista;

	public RepositorioEstoqueArray(int tamanho) {
		estoque = new Ingrediente[tamanho];
		contadorLista = 0;
	}
	
	// Adiciona algum ingrediente ao Estoque
	public void inserir(Ingrediente ingrediente) {
		this.estoque[contadorLista] = ingrediente;
		this.contadorLista++;
	}
// erro se o contadorLista estiver igual a .lenght do array, isso quer dizer estoque cheio
// erro se o usuario tentar inserir um ingrediente igual a outro, pensar em criterios
	
	// Remove algum ingrediente ao Estoque
	public void remover(Ingrediente ingrediente) {
		for (int contador = 0; contador < this.estoque.length; contador++)
			if (this.estoque[contador] == ingrediente) {
				for (; contador < this.estoque.length; contador++) {
					ingrediente = null;
					if (contador != (this.estoque.length - 1))
						this.estoque[contador] = this.estoque[contador + 1];
					else
						this.estoque[contador] = null;
				}
			}
//Se o ingrediente for diferente de null, mensagem de erro de produto não encontrado
	}
	
	//Atualiza os atributos de um ingrediente no estoque
	public void atualizar(Ingrediente ingrediente) {
		for (int contador = this.contadorLista; contador != 0; contador--)
			if (this.estoque[contador].getIdentificador() == ingrediente.getIdentificador())
				this.estoque[contador] = ingrediente;
	}

	// Analisa se algum ingrediente existe no estoque
	public boolean existe(Ingrediente ingrediente) {
		boolean resposta = false;
		for (int contador = this.contadorLista; contador != 0; contador--)
			if (this.estoque[contador].getIdentificador() == ingrediente.getIdentificador())
				resposta = true;
		return resposta;
	}

	// Retorna o status de um ingrediente
	public String listarIngrediente(Ingrediente ingrediente) {
		String resposta = "";
		for (int contador = 0; contador < this.estoque.length; contador++)
			if (this.estoque[contador] == ingrediente) {
				resposta = "Ingrediente: " + ingrediente.getNome() + "\n" + "Quantidade em Estoque: "
						+ ingrediente.getQtd() + ingrediente.getTipoEstoque() + "\n" + "Fornecedor: "
						+ ingrediente.getFornecedor() + "\n" + "Preço Unitário: " + ingrediente.getPreco() + "\n"
						+ "Validade: " + ingrediente.getValidade() + "\n";
				ingrediente = null;
				contador = this.estoque.length;
			}
		// Se o ingrediente for diferente de null, mensagem de erro de produto não
		// encontrado
		return resposta;
	}
	// Retorna todo o Estoque atual
	public String listarEstoque() {
		String resposta = "-------- Estoque --------";
		for (int contador = this.contadorLista; contador !=0; contador--) {
			resposta = "Ingrediente: " + this.estoque[contador].getNome() + "\n" + 
					"Quantidade em Estoque: " + this.estoque[contador].getQtd() + 
					this.estoque[contador].getTipoEstoque() + "\n" + 
					"Fornecedor: " + this.estoque[contador].getFornecedor() + "\n" +
					"Preço Unitário: " + this.estoque[contador].getPreco() + "\n" + 
					"Validade: " + this.estoque[contador].getValidade() + "\n" +
					"--------------------------";
		}
		return resposta;
	}

	// remover ainda defeituoso

}
