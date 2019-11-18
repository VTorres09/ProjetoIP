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
			// Estará dentro de outro for com o login e ele terá a opção encerrar programa
			for (boolean sessao = true; sessao == true;) {
				System.out.println("Digite o seu Login:");
				//Receber Login
				System.out.println("Digite sua senha:");
				//Receber Senha
				

				for (; sessao == true;) {

					System.out.println("Bem vindo ao SCR (Sistema de Controle de Restaurante) \n ");
					System.out.println(
							"Escolha um dos comandos abaixo para selecionar qual funcionalidade você deseja usar \n");
					System.out.println("1 - Pedidos");
					System.out.println("Selecione essa opção para acessar as operações relacionadas a pedidos. \n");
					System.out.println("2 - Cardápio");
					System.out.println("Selecione essa opção para acessar as operações relacionadas a cardápio. \n");
					System.out.println("3 - Mesas");
					System.out.println("Selecione essa opção para acessar as operações relacionadas a mesas. \n");
					System.out.println("4 - Ingredientes");
					System.out.println("Selecione essa opção para acessar as operações relacionadas a ingredientes. \n");
					System.out.println("5 - Funcionários");
					System.out.println("Selecione essa opção para acessar as operações relacionadas a funcionários. \n");
					System.out.println("6 - Finalizar Sessão");
					System.out.println("Selecione essa opção para finalizar sua sessão. \n");

					comando = in.next();
					// Você não tem permissão de acessar essa opção

					if (comando.equals("1")) {
						System.out.println("Você escolheu a opção Pedidos" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");
						
						//Inserir Pedidos
						//Remover Pedidos
						//Atualizar Pedidos					
						
						///////////////////////////////////////////////
					} else if (comando.equals("2")) {
						System.out.println("Você escolheu a opção Cardápio" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");
						
						//Inserir Prato
						//Remover Prato
						//Atualizar Prato		
						
						///////////////////////////////////////////////
					} else if (comando.equals("3")) {
						System.out.println("Você escolheu a opção Mesas" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");
						///////////////////////////////////////////////
					} else if (comando.equals("4")) {
						System.out.println("Você escolheu a opção Ingredientes" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a operação desejada: \n");
						System.out.println("1 - Cadastrar Ingrediente");
						System.out.println("Selecione essa opção para inserir um novo ingrediente no estoque \n");
						System.out.println("2 - Remover Ingrediente");
						System.out.println("Selecione essa opção para remover um ingrediente do estoque \n");
						System.out.println("3 - Atualizar Ingrediente");
						System.out.println("Selecione essa opção para atualizar os status de um ingrediente do estoque \n");
						System.out.println("4 - Voltar");
						System.out.println("Selecione essa opção para voltar para a tela anterior \n");

						operacao = in.next();


						if (operacao.equals("1")) {
							System.out.println("Você escolheu a opção Cadastrar Ingrediente");
						} else if (operacao.equals("2")) {
							System.out.println("Você escolheu a opção Remover Ingrediente");
						} else if (operacao.equals("3")) {
							System.out.println("Você escolheu a opção Atualizar Ingrediente");
						} else if (operacao.equals("4")) {
						} else
							System.out.println("Comando inválido. Você será redirecionado para a página inicial.");

						///////////////////////////////////////////////
					} else if (comando.equals("5")) {
						System.out.println("Você escolheu a opção Funcionários" + "\n"
								+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");
						///////////////////////////////////////////////
					} else if (comando.equals("6")) {
						System.out.println("Você deseja finalizar sua sessão? \nDigite Sim para confirmar");
						auxiliar = in.next();
						if (auxiliar.equals("Sim") || auxiliar.equals("sim")) {
							System.out.println("Sua sessão foi finalizada");
							sessao = false;
						} else
							System.out.println("Comando inválido. Você será redirecionado para a página inicial. \n");
						///////////////////////////////////////////////
					} else
						System.out.println("Comando inválido. Por favor digite um dos comandos abaixo. \n");

				}
			}
		}
		
}
