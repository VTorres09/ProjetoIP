package Projeto;

public interface RepositorioEstoque {
	void inserir(Ingrediente ingrediente);
	void remover(Ingrediente ingrediente);
	void atualizar(Ingrediente ingrediente);
	boolean existe(Ingrediente ingrediente);
	String listarIngrediente(Ingrediente ingrediente);
	String listarEstoque();
}