package mesas;

import funcionarios.Funcionario;
import ingredientes.RepositorioIngredientes;
import pedidos.RepositorioPedidos;

public class CadastroMesa {
	private RepositorioMesa repositorio;
	
	public CadastroMesa(RepositorioMesa repMesas){
		this.repositorio = repMesas;
	}
	
	public void cadastrar(Mesa mesa) throws MesaJaCadastradaException {
		if (!repositorio.existeMesa(mesa)) {
			repositorio.inserirMesa(mesa);
			
		}else {
			throw new MesaJaCadastradaException();
		}
	}
	
	public void remover(Mesa mesa) throws MesaNaoCadastradaException{
		if (repositorio.existeMesa(mesa)) {
			repositorio.removerMesa(mesa);
		}else {
			throw new MesaNaoCadastradaException();
		}
	}
	
	public void listar() {}
	
	public boolean existe(Mesa mesa) {
		return repositorio.existeMesa(mesa);
	}
	
	public void atualizar(Mesa mesa ,int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos ) throws MesaNaoCadastradaException {
		if (repositorio.existeMesa(mesa)) {
			repositorio.atualizarMesa(mesa, numeroMesa, funcionario, pedidos);
		}else {
			throw new MesaNaoCadastradaException();
		}
	}

}
