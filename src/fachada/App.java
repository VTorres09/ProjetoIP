package fachada;

import ingredientes.*;
import pratos.*;
import mesas.*;
import pedidos.*;
import funcionarios.*;

public class App {
	
	private CadastroIngredientes ingredientes;
	private CadastroPratos pratos;
	private CadastroMesa mesas;
	private CadastroPedidos pedidos;
	private CadastroFuncionarios funcionarios;
	
	public App(RepositorioIngredientes repIngredientes, RepositorioPratos repPratos, RepositorioMesa repMesas, RepositorioPedidos repPedidos, RepositorioFuncionarios repFuncionarios){
		
		this.ingredientes = new CadastroIngredientes(repIngredientes);
		this.pratos = new CadastroPratos(repPratos);
		this.mesas = new CadastroMesa(repMesas);
		this.pedidos = new CadastroPedidos(repPedidos);
		this.funcionarios = new CadastroFuncionarios(repFuncionarios);
		
	}
	
	// Pratos

	public void cadastrarPrato(Prato prato) throws PratoJaCadastradoException {

		if (this.pratos.getPratos().existePrato(prato.getNome())) {
			throw new PratoJaCadastradoException();
		} else {
			this.pratos.cadastrar(prato);
		}
	}

	public void removerPrato(Prato prato) throws PratoNaoCadastradoException {

		if (this.pratos.getPratos().existePrato(prato.getNome())) {
			this.pratos.remover(prato);
		} else {
			throw new PratoNaoCadastradoException();
		}
	}
	
	
	public void atualizarPrato(Prato prato) {
		if (this.pratos.getPratos().existePrato(prato.getNome())) {
			this.pratos.atualizar(prato.getIdentificador(), prato.getNome(), prato.getPreco(), prato.getIngredientes());
		} else {
			throw new PratoNaoCadastradoException();
		}	
	}
	
	
}
