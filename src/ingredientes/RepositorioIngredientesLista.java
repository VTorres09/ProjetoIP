package ingredientes;

public class RepositorioIngredientesLista implements RepositorioIngredientes {

//vencimento estoque (Incluido no filtro, mas funcao separada)
//pensar em como colocar um filtro para ser usado, naipe da questao 5 da lista 6
//remover quantidade de um ingrediente (Essencial)
//adicionar uma quantidade de um ingrediente (Essencial)

	private Ingrediente ingrediente;
	private RepositorioIngredientesLista proximo;

	public RepositorioIngredientesLista() {
		this.ingrediente = null;
		this.proximo = null;
	}

	// Adiciona algum ingrediente ao Estoque
	public void inserir(Ingrediente ingrediente) {
		if (this.ingrediente == null) {
			this.ingrediente = ingrediente;
			this.proximo = new RepositorioIngredientesLista();
		} else
			this.proximo.inserir(ingrediente);
	}

	// Remove algum ingrediente ao Estoque
	public void remover(String identificador) {
		// Mensagem de erro se o ingrediente for nulo
		if (this.ingrediente.getIdentificador().equals(identificador)) {
			this.ingrediente = this.proximo.ingrediente;
			this.proximo = this.proximo.proximo;
		} else
			this.proximo.remover(identificador);
	}

	// Atualiza os atributos de um ingrediente no estoque
	public void atualizar(Ingrediente ingrediente) {
		if (this.ingrediente.getIdentificador().equals(ingrediente.getIdentificador())) {
			this.ingrediente = ingrediente;
		} else
			this.proximo.atualizar(ingrediente);
	}

	// Analisa se algum ingrediente existe no estoque
	public boolean existe(String identificador) {
		if (this.ingrediente == null)
			return false;
		else if (this.ingrediente.getIdentificador().equals(identificador))
			return true;
		else
			return this.proximo.existe(identificador);
	}

	// Retorna o status de um ingrediente
	public String listarIngrediente(String identificador) {
		String resposta = "--------------------------" + "\n";
		if (this.ingrediente.getIdentificador().equals(identificador)) {
			resposta += "Ingrediente: " + this.ingrediente.getNome() + "\n" + "Quantidade em Estoque: "
					+ this.ingrediente.getQtd() + this.ingrediente.getTipoEstoque() + "\n" + "Fornecedor: "
					+ this.ingrediente.getFornecedor() + "\n" + "Preço Unitário: " + this.ingrediente.getPreco() + "\n"
					+ "Validade: " + this.ingrediente.getValidade() + "\n"
					+ "Identificador: " + this.ingrediente.getIdentificador() + "\n" +
					"--------------------------" + "\n";
			return resposta;
		} else
			return this.proximo.listarIngrediente(identificador);
	}

	// Retorna todo o Estoque atual
	public String listarEstoque() {
		String resposta = "-------- Estoque ---------" + "\n";
		while (this.ingrediente != null) {
			resposta += "Ingrediente: " + this.ingrediente.getNome() + "\n" + "Quantidade em Estoque: "
					+ this.ingrediente.getQtd() + " " + this.ingrediente.getTipoEstoque() + "\n" + "Fornecedor: "
					+ this.ingrediente.getFornecedor() + "\n" + "Preço Unitário: "
					+ this.ingrediente.getPreco() + "\n" + "Validade: " + this.ingrediente.getValidade() + "\n"
					+ "Identificador: " + this.ingrediente.getIdentificador() + "\n";
			resposta += "--------------------------" + "\n";
			this.ingrediente = this.proximo.ingrediente;
			this.proximo = this.proximo.proximo;
		}
		return resposta;
	}
	
	public boolean existe(String nome, String fornecedor, String validade) {
		boolean resposta = false;
		if (this.ingrediente == null) {
		}else{
			if (this.ingrediente.getNome().equals(nome) &&
				this.ingrediente.getFornecedor().equals(fornecedor)&&
				this.ingrediente.getValidade().equals(validade))
					resposta = true;
			else
				return this.proximo.existe(nome, fornecedor, validade);
		}	
		return resposta;
	}
	
	public String getIdentificador(String nome, String fornecedor, String validade) {
		String resposta = "";
		if (this.ingrediente.getNome().equals(nome) &&
			this.ingrediente.getFornecedor().equals(fornecedor)&&
			this.ingrediente.getValidade().equals(validade))
			resposta = this.ingrediente.getIdentificador();
		else
			return this.proximo.getIdentificador(nome, fornecedor, validade);
		return resposta;
	}

	public boolean estoqueVazio() {
		if(this.ingrediente == null)
			return true;
		else
			return false;
	}
}
