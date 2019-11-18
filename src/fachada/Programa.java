package fachada;

import ingredientes.*;
import pratos.*;
import mesas.*;
import pedidos.*;

import java.util.Scanner;

import funcionarios.*;

public class Programa {

	public static void main(String[] args) {
		
		// Inicializando a Fachada
		
		RepositorioIngredientesLista repositorioIngredientesLista = new RepositorioIngredientesLista();
		RepositorioPratosLista repositorioPratosLista = new RepositorioPratosLista();
		RepositorioMesaLista repositorioMesaLista = new RepositorioMesaLista();
		RepositorioPedidosLista repositorioPedidosLista = new RepositorioPedidosLista();
		RepositorioFuncionariosLista repositorioFuncionariosLista = new RepositorioFuncionariosLista();
		
		App fachada = new App(repositorioIngredientesLista, repositorioPratosLista, repositorioMesaLista, repositorioPedidosLista, repositorioFuncionariosLista);
		
		// Inicializando os metodos
			Scanner in = new Scanner(System.in);
			String comando = "";
			String operacao = "";
			String auxiliar = "";

			// Colocar o sistema de senhas antes
			// Estar� dentro de outro for com o login e ele ter� a op��o encerrar programa
			for (boolean sessao = true; sessao == true;) {
				System.out.println("Digite o seu Login:");
				//Receber Login
				System.out.println("Digite sua senha:");
				//Receber Senha
				

				for (; sessao == true;) {

					System.out.println("Bem vindo ao SCR (Sistema de Controle de Restaurante) \n ");
					System.out.println(
							"Escolha um dos comandos abaixo para selecionar qual funcionalidade voc� deseja usar \n");
					System.out.println("1 - Pedidos");
					System.out.println("Selecione essa op��o para acessar as opera��es relacionadas a pedidos. \n");
					System.out.println("2 - Card�pio");
					System.out.println("Selecione essa op��o para acessar as opera��es relacionadas a card�pio. \n");
					System.out.println("3 - Mesas");
					System.out.println("Selecione essa op��o para acessar as opera��es relacionadas a mesas. \n");
					System.out.println("4 - Ingredientes");
					System.out.println("Selecione essa op��o para acessar as opera��es relacionadas a ingredientes. \n");
					System.out.println("5 - Funcion�rios");
					System.out.println("Selecione essa op��o para acessar as opera��es relacionadas a funcion�rios. \n");
					System.out.println("6 - Finalizar Sess�o");
					System.out.println("Selecione essa op��o para finalizar sua sess�o. \n");

					comando = in.next();
					// Voc� n�o tem permiss�o de acessar essa op��o

					if (comando.equals("1")) {
						System.out.println("Voc� escolheu a op��o Pedidos" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");
						
						//Inserir Pedidos
						//Remover Pedidos
						//Atualizar Pedidos					
						
						///////////////////////////////////////////////
					} else if (comando.equals("2")) {
						System.out.println("Voc� escolheu a op��o Card�pio" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");
						
						//Inserir Prato
						//Remover Prato
						//Atualizar Prato		
						
						///////////////////////////////////////////////
					} else if (comando.equals("3")) {
						System.out.println("Voc� escolheu a op��o Mesas" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");
						///////////////////////////////////////////////
					} else if (comando.equals("4")) {
						System.out.println("Voc� escolheu a op��o Ingredientes" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada: \n");
						System.out.println("1 - Cadastrar Ingrediente");
						System.out.println("Selecione essa op��o para inserir um novo ingrediente no estoque \n");
						System.out.println("2 - Remover Ingrediente");
						System.out.println("Selecione essa op��o para remover um ingrediente do estoque \n");
						System.out.println("3 - Atualizar Ingrediente");
						System.out.println("Selecione essa op��o para atualizar os status de um ingrediente do estoque \n");
						System.out.println("4 - Voltar");
						System.out.println("Selecione essa op��o para voltar para a tela anterior \n");

						operacao = in.next();


						if (operacao.equals("1")) {
							System.out.println("Voc� escolheu a op��o Cadastrar Ingrediente");
						} else if (operacao.equals("2")) {
							System.out.println("Voc� escolheu a op��o Remover Ingrediente");
						} else if (operacao.equals("3")) {
							System.out.println("Voc� escolheu a op��o Atualizar Ingrediente");
						} else if (operacao.equals("4")) {
						} else
							System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");

						///////////////////////////////////////////////
					} else if (comando.equals("5")) {
						System.out.println("Voc� escolheu a op��o Funcion�rios" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");
						///////////////////////////////////////////////
					} else if (comando.equals("6")) {
						System.out.println("Voc� deseja finalizar sua sess�o? \nDigite Sim para confirmar");
						auxiliar = in.next();
						if (auxiliar.equals("Sim") || auxiliar.equals("sim")) {
							System.out.println("Sua sess�o foi finalizada");
							sessao = false;
						} else
							System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial. \n");
						///////////////////////////////////////////////
					} else
						System.out.println("Comando inv�lido. Por favor digite um dos comandos abaixo. \n");

				}
			}
		}
		
}
