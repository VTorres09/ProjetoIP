package Pratos;

import Ingredientes.Ingrediente;

public interface RepositorioPratos {
	void adicionarPrato(Prato prato);

	void removerPrato(Prato prato);

	String listarPrato();

	boolean existePrato(String nomePrato);
	
	void atualizarPrato(int identificador, String nome, double preco, Ingrediente[] ingredientes);
	
	String listarIngredientes(Prato prato);
		
}
