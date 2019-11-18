package ingredientes;

public class CadastroIngredientes {
	private RepositorioIngredientes estoque;

	public CadastroIngredientes(RepositorioIngredientes rep) {
		this.estoque = rep;
	}

	// Lembrar do problema dos ingredientes invalidos
	// Ingrediente deve ter um nome, fornecedor e preco/validade no minimo(Analisar
	// isso na fachada)

	// Insere um ingrediente no Estoque
	public void inserir(Ingrediente ingrediente) throws IngredienteJaCadastradoException {
		if (!this.estoque.existe(ingrediente.getIdentificador()))
			this.estoque.inserir(ingrediente);
		else
			throw new IngredienteJaCadastradoException();
	}

	// Remove um ingrediente no Estoque
	public void remover(String identificador) throws IngredienteNaoCadastradoException {
		if (this.estoque.existe(identificador))
			this.estoque.remover(identificador);
		else
			throw new IngredienteNaoCadastradoException();
	}

	// Atualiza o status de um ingrediente do Estoque
	public void atualizar(Ingrediente ingrediente) throws IngredienteNaoCadastradoException {
		if (this.estoque.existe(ingrediente.getIdentificador()))
			this.estoque.atualizar(ingrediente);
		else
			throw new IngredienteNaoCadastradoException();
	}

	// Procura um ingrediente no estoque
	public Ingrediente procurar(String identificador) throws IngredienteNaoCadastradoException {
		if (this.estoque.existe(identificador))
			return this.estoque.procurar(identificador);
		else
			throw new IngredienteNaoCadastradoException();
	}
	
	
}