package fachada;

import ingredientes.*;
import pratos.*;
import mesas.*;
import pedidos.*;
import funcionarios.*;

public class Programa {

	public static void main(String[] args) throws 
		
		FuncionarioJaCadastradoException,
		FuncionarioNaoExistenteException,
		NaoHaFuncionariosException,
		IngredienteJaCadastradoException,
		IngredienteNaoCadastradoException,
		NaoExistemIngredientesException,
		MesaJaCadastradaException,
		MesaNaoCadastradaException,
		CadastroNaoRealizadoException,
		NaoExistemPedidosException,
		PedidoJaCadastradoException,
		PedidoNaoExistenteException,
		PratoJaCadastradoException,
		PratoNaoCadastradoException
	
	{
		
		// criando repositorios lista
		
		RepositorioIngredientesLista repositorioIngredientesLista = new RepositorioIngredientesLista();
		RepositorioPratosLista repositorioPratosLista = new RepositorioPratosLista();
		RepositorioMesaLista repositorioMesaLista = new RepositorioMesaLista();
		RepositorioPedidosLista repositorioPedidosLista = new RepositorioPedidosLista();
		RepositorioFuncionariosLista repositorioFuncionariosLista = new RepositorioFuncionariosLista();
		
		App fachada = new App(repositorioIngredientesLista, repositorioPratosLista, repositorioMesaLista, repositorioPedidosLista, repositorioFuncionariosLista);
		
		// testando ingredientes
		Ingrediente cafe = new Ingrediente("Cafe (Tres Coracoes)", 30, "Pacotes", "Tres Coracoes LTDA", 20.00, "30/09/2021", "01");
		CadastroIngredientes.inserir(cafe);
		
	}

}
