package Ingredientes;

public interface RepositorioIngredientes {
	void inserir(Ingrediente ingrediente);
	void remover(String identificador);
	void atualizar(Ingrediente ingrediente);
	boolean existe(String identificador);
	String listarIngrediente(String identificador);
	String listarEstoque();
	boolean existe(String nome, String fornecedor, String validade);
	String getIdentificador(String nome, String fornecedor, String validade);
	boolean estoqueVazio();
}