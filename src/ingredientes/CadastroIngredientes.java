package ingredientes;

public class CadastroIngredientes {
	private RepositorioIngredientes estoque;

	public CadastroIngredientes(RepositorioIngredientesLista rep) {
		this.estoque = rep;
	}
	//Comentar o que cada metodo faz
	//Melhorar a descrição dos erros
	//Lembrar do problema dos ingredientes invalidos
	//Ingrediente deve ter um nome, fornecedor e preco/validade no minimo(Analisar isso na fachada)
	public void inserir(Ingrediente ingrediente) throws IngredienteJaCadastradoException {
		if (!estoque.existe(ingrediente.getIdentificador())) {
			this.estoque.inserir(ingrediente);
		}else
			throw new IngredienteJaCadastradoException();
	}
	
	public void remover(String identificador) throws IngredienteNaoCadastradoException{
		if(estoque.existe(identificador))
			this.estoque.remover(identificador);
		else
			throw new IngredienteNaoCadastradoException();
	}
	
	public void atualizar(Ingrediente ingrediente) throws IngredienteNaoCadastradoException{
		if(estoque.existe(ingrediente.getIdentificador())) {
			estoque.atualizar(ingrediente);
		}else
			throw new IngredienteNaoCadastradoException();
	}
	
	public String listarIngrediente(String identificador) throws IngredienteNaoCadastradoException{
		if(estoque.existe(identificador))
			return estoque.listarIngrediente(identificador);
		else
			throw new IngredienteNaoCadastradoException(); 
	}
	
	public String listarEstoque() throws NaoExistemIngredientesException{
		if (!this.estoque.estoqueVazio())
			return this.estoque.listarEstoque();
		else
			throw new NaoExistemIngredientesException();
	}
	
	public String getIdentificador(String nome, String fornecedor, String validade) throws IngredienteNaoCadastradoException{
		if (this.estoque.existe(nome, fornecedor, validade))
			return this.estoque.getIdentificador(nome, fornecedor, validade);
		else
			throw new IngredienteNaoCadastradoException();
	}
	
	
	
	
	
	
	//Inserir Ingrediente*
		//Classe erro, ingrediente para cadastro e inutil(null ou outra coisa)
		//Classe erro, ingrediente ja cadastrado(Nome+algo igual)
	//Remover Ingrediente*
		//Classe erro, ingrediente para cadastro e inutil(null ou outra coisa)
		//Classe erro, ingrediente nao cadastrado (Nenhum Identificador igual)*
	
	//Receber o Identificador do Ingrediente	
		//Classe erro, ingrediente nao cadastrado (Nenhum Nome+algo igual)
	
	
	//Alterar os status de algum ingrediente do estoque*
		//Classe erro, ingrediente nao cadastrado (Nenhum Nome+algo igual)
		//Classe erro, ingrediente para cadastro e inutil(null ou outra coisa)
	
	
	//Listar Ingrediente*
		//Classe erro, ingrediente para cadastro e inutil(null ou outra coisa)
		//Classe erro, ingrediente nao cadastrado (Nenhum Identificador igual)*
	//Listar Estoque*
		//Classe erro, estoque vazio*
	

}