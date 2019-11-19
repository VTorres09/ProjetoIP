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

		App fachada = new App(repositorioIngredientesLista, repositorioPratosLista, repositorioMesaLista,
				repositorioPedidosLista, repositorioFuncionariosLista);

		// Inicializando os metodos
		Scanner in = new Scanner(System.in);
		String comando = "";
		String operacao = "";
		String auxiliar = "";

		for (boolean sessao = false, programaAberto = true; programaAberto == true;) {
			System.out.println("Digite o seu Login:");
			// Receber Login
			System.out.println("Digite sua senha:");
			// Receber Senha

			sessao = true;
			// if senha e login sao validos, sessao true, senao sessao invalidada

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

				///////////////////////////////////////////////
				// Pedidos
				if (comando.equals("1")) {
					System.out.println("Voc� escolheu a op��o Pedidos" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");

					System.out.println("1 - Cadastrar Pedido");
					System.out.println("Selecione essa op��o para inserir um novo pedido no sistema \n");
					System.out.println("2 - Remover Pedido");
					System.out.println("Selecione essa op��o para remover um pedido do sistema \n");
					System.out.println("3 - Atualizar Pedido");
					System.out.println("Selecione essa op��o para atualizar os status de um pedido do sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa op��o para voltar para a tela anterior \n");

					operacao = in.next();

					// Pedidos Pedido
					int numeroMesa;

					if (operacao.equals("1")) {
						System.out.println("Voc� escolheu a op��o cadastrar pedido");
					} else if (operacao.equals("2")) {
						System.out.println("Voc� escolheu a op��o remover pedido");
					} else if (operacao.equals("3")) {
						System.out.println("Voc� escolheu a op��o atualizar pedido");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");

					///////////////////////////////////////////////
					// Cardapio (Falta teste)
				} else if (comando.equals("2")) {
					System.out.println("Voc� escolheu a op��o Card�pio" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");

					System.out.println("1 - Cadastrar Prato");
					System.out.println("Selecione essa op��o para inserir um novo prato no card�pio \n");
					System.out.println("2 - Remover Prato");
					System.out.println("Selecione essa op��o para remover um prato do card�pio \n");
					System.out.println("3 - Atualizar Prato");
					System.out.println("Selecione essa op��o para atualizar os status de um prato do card�pio \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa op��o para voltar para a tela anterior \n");

					operacao = in.next();
					in.nextLine();

					String nomePrato;
					double precoPrato;
					Ingrediente[] ingredientesPrato = new Ingrediente[10];
					int identificadorPrato;

					if (operacao.equals("1")) {
						System.out.println("Voc� escolheu a op��o cadastrar prato \n");
						System.out.println("Digite o nome do novo prato");
						nomePrato = in.nextLine();
						System.out.println("Agora digite o pre�o desse prato:");
						precoPrato = in.nextDouble();
						in.nextLine();
						System.out.println(
								"Agora � necess�rio que voc� informe os ingredientes que s�o usados no prato : \n Ao terminar, digite fim");

						for (String fim = ""; !fim.equals("fim");) {
							int contador = 0;
							String nomeIngrediente;
							int qtdIngrediente;
							String tipoEstoqueIngrediente;
							String fornecedorIngrediente;
							double precoIngrediente;
							String validadeIngrediente;
							String identificadorIngrediente;

							System.out.println("Digite o nome do ingrediente");
							nomeIngrediente = in.nextLine();
							System.out.println("Agora digite a quantidade desse ingrediente:");
							qtdIngrediente = in.nextInt();
							in.nextLine();
							System.out.println("Agora digite o fornecedor desse ingrediente:");
							fornecedorIngrediente = in.nextLine();
							System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
							tipoEstoqueIngrediente = in.nextLine();
							System.out.println("Agora digite o pre�o do ingrediente:");
							precoIngrediente = in.nextDouble();
							in.nextLine();
							System.out.println("Agora digite a validade desse ingrediente:");
							validadeIngrediente = in.nextLine();
							System.out.println("Agora digite um identificador para seu ingrediente:");
							identificadorIngrediente = in.nextLine();
							System.out.println("fim?");
							fim = in.nextLine();

							Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
									tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente,
									validadeIngrediente, identificadorIngrediente);
							ingredientesPrato[contador] = ingrediente;
							contador++;
						}

						System.out.println("Agora digite o identificador desse prato:");
						identificadorPrato = in.nextInt();

						Prato prato = new Prato(nomePrato, precoPrato, ingredientesPrato, identificadorPrato);

						try {
							fachada.cadastrarPrato(prato);
						} catch (PratoJaCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("2")) {
						System.out.println("Voc� escolheu a op��o remover prato");
						System.out.print("Digite o nome do prato");
						nomePrato = in.nextLine();
						System.out.print("Agora digite o pre�o desse prato:");
						precoPrato = in.nextDouble();
						in.nextLine();
						System.out.println(
								"Agora informe os ingredientes que s�o usados no prato(caso queira finalizar, digite fim. Se n�o, d� enter) : \n");
						for (String fim = ""; !fim.equals("fim");) {
							int contador = 0;
							String nomeIngrediente;
							int qtdIngrediente;
							String tipoEstoqueIngrediente;
							String fornecedorIngrediente;
							double precoIngrediente;
							String validadeIngrediente;
							String identificadorIngrediente;

							System.out.println("Digite o nome do ingrediente");
							nomeIngrediente = in.nextLine();
							System.out.println("Agora digite a quantidade desse ingrediente:");
							qtdIngrediente = in.nextInt();
							in.nextLine();
							System.out.println("Agora digite o fornecedor desse ingrediente:");
							fornecedorIngrediente = in.nextLine();
							System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
							tipoEstoqueIngrediente = in.nextLine();
							System.out.println("Agora digite o pre�o do ingrediente:");
							precoIngrediente = in.nextDouble();
							in.nextLine();
							System.out.println("Agora digite a validade desse ingrediente:");
							validadeIngrediente = in.nextLine();
							System.out.println("Agora digite um identificador para seu ingrediente:");
							identificadorIngrediente = in.nextLine();
							System.out.println("fim?");
							fim = in.nextLine();

							Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
									tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente,
									validadeIngrediente, identificadorIngrediente);
							ingredientesPrato[contador] = ingrediente;
							contador++;
						}
						System.out.println("Agora digite o identificador desse prato:");
						identificadorPrato = in.nextInt();
						Prato prato = new Prato(nomePrato, precoPrato, ingredientesPrato, identificadorPrato);

						try {
							fachada.removerPrato(prato);
						} catch (PratoNaoCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("3")) {
						System.out.println("Voc� escolheu a op��o atualizar prato");
						System.out.print("Digite o nome do prato");
						nomePrato = in.nextLine();
						System.out.print("Agora digite o pre�o desse prato:");
						precoPrato = in.nextDouble();
						System.out.println(
								"Agora informe os ingredientes que s�o usados no prato : \n Ao terminar, digite FIM");

						for (String fim = ""; !fim.equals("fim");) {
							int contador = 0;
							String nomeIngrediente;
							int qtdIngrediente;
							String tipoEstoqueIngrediente;
							String fornecedorIngrediente;
							double precoIngrediente;
							String validadeIngrediente;
							String identificadorIngrediente;

							System.out.println("Digite o nome do ingrediente");
							nomeIngrediente = in.nextLine();
							System.out.println("Agora digite a quantidade desse ingrediente:");
							qtdIngrediente = in.nextInt();
							in.nextLine();
							System.out.println("Agora digite o fornecedor desse ingrediente:");
							fornecedorIngrediente = in.nextLine();
							System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
							tipoEstoqueIngrediente = in.nextLine();
							System.out.println("Agora digite o pre�o do ingrediente:");
							precoIngrediente = in.nextDouble();
							in.nextLine();
							System.out.println("Agora digite a validade desse ingrediente:");
							validadeIngrediente = in.nextLine();
							System.out.println("Agora digite um identificador para seu ingrediente:");
							identificadorIngrediente = in.nextLine();
							System.out.println("fim?");
							fim = in.nextLine();

							Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
									tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente,
									validadeIngrediente, identificadorIngrediente);
							ingredientesPrato[contador] = ingrediente;
							contador++;
						}

						System.out.println("Agora digite o identificador desse prato:");
						identificadorPrato = in.nextInt();
						Prato prato = new Prato(nomePrato, precoPrato, ingredientesPrato, identificadorPrato);

						try {
							fachada.atualizarPrato(prato);
						} catch (PratoNaoCadastradoException e) {
							System.out.println("\n");
							System.out.println(e);
						}

					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");

					///////////////////////////////////////////////
					// Mesas
				} else if (comando.equals("3")) {
					System.out.println("Voc� escolheu a op��o Mesas" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");

					System.out.println("1 - Cadastrar Mesa");
					System.out.println("Selecione essa op��o para inserir uma nova mesa ao sistema \n");
					System.out.println("2 - Remover Mesa");
					System.out.println("Selecione essa op��o para remover um mesa do sistema \n");
					System.out.println("3 - Atualizar Mesa");
					System.out.println("Selecione essa op��o para atualizar os status de um mesa do sistema \n");
					System.out.println("4 - Finalizar Pedidos da Mesa");
					System.out.println("Selecione essa op��o para atualizar os status de um mesa do sistema \n");
					System.out.println("5 - Voltar");
					System.out.println("Selecione essa op��o para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Voc� escolheu a op��o cadastrar mesa");
					} else if (operacao.equals("2")) {
						System.out.println("Voc� escolheu a op��o remover mesa");
					} else if (operacao.equals("3")) {
						System.out.println("Voc� escolheu a op��o atualizar mesa");
					} else if (operacao.equals("4")) {
						System.out.println("Voc� escolheu a op��o finalizar pedidos da mesa");
					} else if (operacao.equals("5")) {
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");
					///////////////////////////////////////////////
					// Ingredientes (Falta teste)
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
					in.nextLine();

					String nomeIngrediente;
					int qtdIngrediente;
					String tipoEstoqueIngrediente;
					String fornecedorIngrediente;
					double precoIngrediente;
					String validadeIngrediente;
					String identificadorIngrediente;

					if (operacao.equals("1")) {
						System.out.println("Voc� escolheu a op��o cadastrar ingrediente \n");
						System.out.print("Digite o nome do novo ingrediente:");
						nomeIngrediente = in.nextLine();
						System.out.print("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.print("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.print("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.print("Agora digite o pre�o do ingrediente:");
						precoIngrediente = in.nextDouble();
						in.nextLine();
						System.out.print("Agora digite a validade desse ingrediente:");
						validadeIngrediente = in.nextLine();
						System.out.print("Agora digite um identificador para seu ingrediente:");
						identificadorIngrediente = in.nextLine();

						Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
								tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente, validadeIngrediente,
								identificadorIngrediente);

						try {
							fachada.cadastrarIngrediente(ingrediente);
						} catch (IngredienteJaCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("2")) {
						System.out.println("Voc� escolheu a op��o remover ingrediente \n");
						System.out.println("Digite o identificador do ingrediente que voc� quer remover:");
						identificadorIngrediente = in.nextLine();

						try {
							fachada.removerIngrediente(identificadorIngrediente);
						} catch (IngredienteNaoCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("3")) {
						System.out.println("Voc� escolheu a op��o atualizar ingrediente");
						System.out.println("Digite o nome do ingrediente");
						nomeIngrediente = in.nextLine();
						System.out.println("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.println("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.println("Agora digite o pre�o do ingrediente:");
						precoIngrediente = in.nextDouble();
						in.nextLine();
						System.out.println("Agora digite a validade desse ingrediente:");
						validadeIngrediente = in.nextLine();
						System.out.println("Agora digite um identificador para seu ingrediente:");
						identificadorIngrediente = in.nextLine();

						Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
								tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente, validadeIngrediente,
								identificadorIngrediente);
					
						try {
							fachada.atualizarIngrediente(ingrediente);
						} catch (IngredienteNaoCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");

					///////////////////////////////////////////////
					// Funcionarios
				} else if (comando.equals("5")) {
					System.out.println("Voc� escolheu a op��o Funcion�rios" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a opera��o desejada:");

					System.out.println("1 - Cadastrar Funcion�rio");
					System.out.println("Selecione essa op��o para cadastrar um novo funcion�rio ao sistema \n");
					System.out.println("2 - Remover Funcion�rio");
					System.out.println("Selecione essa op��o para remover um funcion�rio do sistema \n");
					System.out.println("3 - Atualizar Funcion�rio");
					System.out.println("Selecione essa op��o para atualizar os status de um funcion�rio no sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa op��o para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Voc� escolheu a op��o cadastrar funcion�rio");
						
						
						
						
					} else if (operacao.equals("2")) {
						System.out.println("Voc� escolheu a op��o remover funcion�rio");
					} else if (operacao.equals("3")) {
						System.out.println("Voc� escolheu a op��o atualizar funcion�rio");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial.");

					///////////////////////////////////////////////
					// Finalizar sessao
				} else if (comando.equals("6")) {
					System.out.println("Voc� deseja finalizar sua sess�o? \nDigite Sim para confirmar");
					auxiliar = in.next();
					if (auxiliar.equals("Sim") || auxiliar.equals("sim")) {
						System.out.println("Sua sess�o foi finalizada");
						sessao = false;
						programaAberto = false;
					} else
						System.out.println("Comando inv�lido. Voc� ser� redirecionado para a p�gina inicial. \n");
					///////////////////////////////////////////////
				} else
					System.out.println("Comando inv�lido. Por favor digite um dos comandos abaixo. \n");

			}
		}
	}

}
