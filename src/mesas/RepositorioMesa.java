package mesas;

import funcionarios.Funcionario;
import pedidos.RepositorioPedidos;

public interface RepositorioMesa {
	
	void inserirMesa(Mesa mesa);
	void removerMesa(Mesa mesa);
	void listar();
	boolean existeMesa(Mesa mesa);
	void atualizarMesa(Mesa mesa, int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos );

}
