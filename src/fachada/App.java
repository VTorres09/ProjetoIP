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
	
	//programar os metodos novamente para chamar na classe programa
	
	
	
}
