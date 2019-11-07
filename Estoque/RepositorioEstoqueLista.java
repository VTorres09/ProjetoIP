package Projeto;

public class RepositorioEstoqueLista implements RepositorioEstoque {

//vencimento estoque (Incluido no filtro, mas funcao separada)
//pensar em como colocar um filtro para ser usado, naipe da questao 5 da lista 6
//remover quantidade de um ingrediente (Essencial)
//adicionar uma quantidade de um ingrediente (Essencial)

	private Ingrediente ingrediente;
	private RepositorioEstoqueLista proximo;

	public RepositorioEstoqueLista() {
		this.ingrediente = null;
		this.proximo = null;
	}

	// Adiciona algum ingrediente ao Estoque
	public void inserir(Ingrediente ingrediente) {
		if (this.ingrediente == null) {
			this.ingrediente = ingrediente;
			this.proximo = new RepositorioEstoqueLista();
		} else
			this.proximo.inserir(ingrediente);

		// erro se o usuario tentar inserir um ingrediente igual a outro, pensar em
		// criterios
	}

	// Remove algum ingrediente ao Estoque
	public void remover(Ingrediente ingrediente) {
		// Mensagem de erro se o ingrediente for nulo
		if (this.ingrediente.equals(ingrediente)) {
			this.ingrediente = this.proximo.ingrediente;
			this.proximo = this.proximo.proximo;
		} else
			this.proximo.remover(ingrediente);
	}

	// Atualiza os atributos de um ingrediente no estoque
	public void atualizar(Ingrediente ingrediente) {
		if (this.ingrediente.getIdentificador() == ingrediente.getIdentificador()) {
			this.ingrediente = ingrediente;
		} else
			this.proximo.atualizar(ingrediente);
	}

	// Analisa se algum ingrediente existe no estoque
	public boolean existe(Ingrediente ingrediente) {
		if (this.ingrediente == null)
			return false;
		else if (this.ingrediente.getIdentificador() == ingrediente.getIdentificador())
			return true;
		else
			return this.proximo.existe(ingrediente);
	}

	// Retorna o status de um ingrediente
	public String listarIngrediente(Ingrediente ingrediente) {
		// mensagem de erro pois o ingrediente é nulo (Fazer na classe negocio)
		if (this.ingrediente.equals(ingrediente)) {
			String resposta = "Ingrediente: " + ingrediente.getNome() + "\n" + "Quantidade em Estoque: "
					+ ingrediente.getQtd() + ingrediente.getTipoEstoque() + "\n" + "Fornecedor: "
					+ ingrediente.getFornecedor() + "\n" + "Preço Unitário: " + ingrediente.getPreco() + "\n"
					+ "Validade: " + ingrediente.getValidade() + "\n";
			return resposta;
		} else
			return this.proximo.listarIngrediente(ingrediente);
	}

	// Retorna todo o Estoque atual
	public String listarEstoque() {
		// mensagem de erro pois o ingrediente é nulo (Fazer na classe negocio)
		String resposta = "-------- Estoque --------";
		while (this.ingrediente != null) {
			resposta = "Ingrediente: " + ingrediente.getNome() + "\n" + "Quantidade em Estoque: " + ingrediente.getQtd()
					+ ingrediente.getTipoEstoque() + "\n" + "Fornecedor: " + ingrediente.getFornecedor() + "\n"
					+ "Preço Unitário: " + ingrediente.getPreco() + "\n" + "Validade: " + ingrediente.getValidade()
					+ "\n" + "--------------------------";
			this.proximo.listarEstoque();
		}
		return resposta;
	}
}
