package Mesas;

import Funcionarios.Funcionario;
import Pedidos.RepositorioPedidos;

public interface RepositorioMesa {
	
	void inserirMesa(Mesa mesa);
	void removerMesa(Mesa mesa);
	void listar();
	boolean existeMesa(int numeroMesa);
	void atualizarMesa(int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos );

}
