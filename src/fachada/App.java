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

	public App(RepositorioIngredientes repIngredientes, RepositorioPratos repPratos, RepositorioMesa repMesas,
			RepositorioPedidos repPedidos, RepositorioFuncionarios repFuncionarios) {

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

	public void atualizarPrato(Prato prato) throws PratoNaoCadastradoException {
		if (this.pratos.getPratos().existePrato(prato.getNome())) {
			this.pratos.atualizar(prato.getIdentificador(), prato.getNome(), prato.getPreco(), prato.getIngredientes());
		} else {
			throw new PratoNaoCadastradoException();
		}
	}

	// ingredientes

	public void cadastrarIngrediente(Ingrediente ingrediente) throws IngredienteJaCadastradoException {
		if (this.ingredientes.getIngredientes().existe(ingrediente.getIdentificador())) {
			throw new IngredienteJaCadastradoException();
		} else {
			this.ingredientes.inserir(ingrediente);
		}
	}

	public void removerIngrediente(Ingrediente ingrediente) throws IngredienteNaoCadastradoException {
		if (this.ingredientes.getIngredientes().existe(ingrediente.getIdentificador())) {
			this.ingredientes.remover(ingrediente.getIdentificador());
		} else {
			throw new IngredienteNaoCadastradoException();
		}
	}

	public void atualizarIngrediente(Ingrediente ingrediente) throws IngredienteNaoCadastradoException {
		if (this.ingredientes.getIngredientes().existe(ingrediente.getIdentificador())) {
			this.ingredientes.atualizar(ingrediente);
		} else {
			throw new IngredienteNaoCadastradoException();
		}
	}

	// mesas
	
	public void cadastrarMesa(Mesa mesa) throws MesaJaCadastradaException {
		if (this.mesas.getMesas().existeMesa(mesa)) {
			throw new MesaJaCadastradaException();
		} else {
			this.mesas.cadastrar(mesa);
		}
	}

	public void removerMesa(Mesa mesa) throws MesaNaoCadastradaException {
		if (this.mesas.getMesas().existeMesa(mesa)) {
			this.mesas.remover(mesa);		
		} else {
			throw new MesaNaoCadastradaException();
		}
	}

	public void atualizarMesa(Mesa mesa) throws MesaNaoCadastradaException {
		if (this.mesas.getMesas().existeMesa(mesa)) {
			this.mesas.atualizar(mesa, mesa.getNum(), mesa.getFuncionario(), mesa.getPedidos());		
		} else {
			throw new MesaNaoCadastradaException();
		}
	}

	//pedidos

	public void fazerPedido(Pedidos pedido) throws PedidoJaCadastradoException, IngredientesInsuficientesException{
		if (this.pedidos.getPedidos().existe(pedido)) {
			throw new PedidoJaCadastradoException();
		} else {					
			this.pedidos.cadastrar(pedido);	
		}

	}

	public void cancelarPedido(Pedidos pedido) throws PedidoNaoExistenteException {
		if (this.pedidos.getPedidos().existe(pedido)) {
			this.pedidos.remover(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}
	}

	public void atualizarPedido(Pedidos pedido) throws PedidoNaoExistenteException {
		if (this.pedidos.getPedidos().existe(pedido)) {
			this.pedidos.getPedidos().atualizar(pedido);
		} else {
			throw new PedidoNaoExistenteException();
		}
	}
	
	//funcionarios

}
