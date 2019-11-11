package Mesas;

import Funcionarios.Funcionario;
import Pedidos.RepositorioPedidos;

public interface RepositorioMesa {
	
	void inserirMesa(Mesa mesa);
	void removerMesa(Mesa mesa);
	void listar();
	boolean existeMesa(Mesa mesa);
	void atualizarMesa(Mesa mesa, int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos );

}
