
public interface RepositorioCardapio {
	void adicionarPrato(Prato prato);
	void removerPrato(Prato prato);
	String listarPrato(RepositorioCardapio repositorioCardapio);
	boolean existePrato(String nomePrato);
}
