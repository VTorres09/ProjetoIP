public interface RepositorioCardapio {
	void adicionarPrato(Prato prato);

	void removerPrato(Prato prato);

	String listarPrato();

	boolean existePrato(String nomePrato);
	
	void atualizarPrato(Prato prato);
	
	String listarIngredientes(Prato prato);
		
}
