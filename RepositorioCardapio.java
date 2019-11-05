
public interface RepositorioCardapio {
	void adicionarPrato(Prato prato);
	void removerPrato(Prato prato);
	String listarPrato();
	boolean existePrato(String nomePrato);
}
