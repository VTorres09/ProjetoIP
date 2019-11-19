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
	
	public String pedirConta(Mesa mesa) throws MesaNaoCadastradaException {
		if (this.mesas.getMesas().existeMesa(mesa)) {
			double consumo = (mesa.getPedidos().consumoMesa()) * (0.1);
			//cria um novo repositorio para mesa
			if(mesa.getPedidos() instanceof RepositorioPedidosArray) {
				RepositorioPedidosArray novoRep = new RepositorioPedidosArray();
				mesa.setRepPedidos(novoRep);
			} else if(mesa.getPedidos() instanceof RepositorioPedidosLista) {
				RepositorioPedidosLista novoRep = new RepositorioPedidosLista();
				mesa.setRepPedidos(novoRep);
			}
				return "Seu consumo foi de: R$ " + consumo + ". (A taxa de 10% opcional esta inclusa).";
		} else {
			throw new MesaNaoCadastradaException();
		}
	}

	//pedidos

	public void fazerPedido(Pedidos pedido, Mesa mesa) throws PedidoJaCadastradoException{
		if (mesa.getPedidos().existe(pedido)) {
			//pedido cadastrado no repositorio da mesa
			throw new PedidoJaCadastradoException();
		} else {					
			mesa.getPedidos().inserir(pedido);			
		}

	}

	public void cancelarPedido(Pedidos pedido, Mesa mesa) throws PedidoNaoCadastradoException {
		if (mesa.getPedidos().existe(pedido)) {
			//pedido removido no repositorio da mesa
			mesa.getPedidos().remover(pedido);
		} else {
			throw new PedidoNaoCadastradoException();
		}
	}

	public void atualizarPedido(Pedidos pedido, Mesa mesa) throws PedidoNaoCadastradoException {
		if (mesa.getPedidos().existe(pedido)) {
			//pedido atualizado no repositorio da mesa
			mesa.getPedidos().atualizar(pedido);
		} else {
			throw new PedidoNaoCadastradoException();
		}
	}
	
	//funcionarios
	
	public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException{
		if (this.funcionarios.getFuncionarios().existeFuncionario(funcionario)) {
			throw new FuncionarioJaCadastradoException();
		} else {					
			this.funcionarios.cadastrar(funcionario);			
		}

	}
	public void removerFuncionario(Funcionario funcionario) throws FuncionarioNaoExistenteException{
		if (this.funcionarios.getFuncionarios().existeFuncionario(funcionario)) {
			this.funcionarios.remover(funcionario);	
		} else {					
			throw new FuncionarioNaoExistenteException();
		}

	}
	
	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoExistenteException{
		if (this.funcionarios.getFuncionarios().existeFuncionario(funcionario)) {
			
			this.funcionarios.atualizarFuncionario(funcionario,funcionario);	
		} else {					
			throw new FuncionarioNaoExistenteException();
		}

	}
	

}
