package projetoIP;

public interface RepositorioMesa {
	
	void inserirMesa(Mesa mesa);
	void removerMesa(Mesa mesa);
	void listar();
	boolean existeMesa(int numeroMesa);
	void atualizarMesa(int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos );

}
