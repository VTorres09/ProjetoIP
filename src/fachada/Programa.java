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

				///////////////////////////////////////////////
				// Pedidos
				if (comando.equals("1")) {
					System.out.println("Você escolheu a opção Pedidos" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");

					System.out.println("1 - Cadastrar Pedido");
					System.out.println("Selecione essa opção para inserir um novo pedido no sistema \n");
					System.out.println("2 - Remover Pedido");
					System.out.println("Selecione essa opção para remover um pedido do sistema \n");
					System.out.println("3 - Atualizar Pedido");
					System.out.println("Selecione essa opção para atualizar os status de um pedido do sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opção para voltar para a tela anterior \n");

					operacao = in.next();

					// Pedidos Pedido
					int numeroMesa;

					if (operacao.equals("1")) {
						System.out.println("Você escolheu a opção cadastrar pedido");
					} else if (operacao.equals("2")) {
						System.out.println("Você escolheu a opção remover pedido");
					} else if (operacao.equals("3")) {
						System.out.println("Você escolheu a opção atualizar pedido");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inválido. Você será redirecionado para a página inicial.");

					///////////////////////////////////////////////
					// Cardapio (Falta teste)
				} else if (comando.equals("2")) {
					System.out.println("Você escolheu a opção Cardápio" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");

					System.out.println("1 - Cadastrar Prato");
					System.out.println("Selecione essa opção para inserir um novo prato no cardápio \n");
					System.out.println("2 - Remover Prato");
					System.out.println("Selecione essa opção para remover um prato do cardápio \n");
					System.out.println("3 - Atualizar Prato");
					System.out.println("Selecione essa opção para atualizar os status de um prato do cardápio \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opção para voltar para a tela anterior \n");

					operacao = in.next();
					in.nextLine();

					String nomePrato;
					double precoPrato;
					Ingrediente[] ingredientesPrato = new Ingrediente[10];
					int identificadorPrato;

					if (operacao.equals("1")) {
						System.out.println("Você escolheu a opção cadastrar prato \n");
						System.out.println("Digite o nome do novo prato");
						nomePrato = in.nextLine();
						System.out.println("Agora digite o preço desse prato:");
						precoPrato = in.nextDouble();
						in.nextLine();
						System.out.println(
								"Agora é necessário que você informe os ingredientes que são usados no prato : \n Ao terminar, digite fim");

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
							System.out.println("Agora digite o preço do ingrediente:");
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
						System.out.println("Você escolheu a opção remover prato");
						System.out.print("Digite o nome do prato");
						nomePrato = in.nextLine();
						System.out.print("Agora digite o preço desse prato:");
						precoPrato = in.nextDouble();
						in.nextLine();
						System.out.println(
								"Agora informe os ingredientes que são usados no prato(caso queira finalizar, digite fim. Se não, dê enter) : \n");
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
							System.out.println("Agora digite o preço do ingrediente:");
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
						System.out.println("Você escolheu a opção atualizar prato");
						System.out.print("Digite o nome do prato");
						nomePrato = in.nextLine();
						System.out.print("Agora digite o preço desse prato:");
						precoPrato = in.nextDouble();
						System.out.println(
								"Agora informe os ingredientes que são usados no prato : \n Ao terminar, digite FIM");

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
							System.out.println("Agora digite o preço do ingrediente:");
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
						System.out.println("Comando inválido. Você será redirecionado para a página inicial.");

					///////////////////////////////////////////////
					// Mesas
				} else if (comando.equals("3")) {
					System.out.println("Você escolheu a opção Mesas" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");

					System.out.println("1 - Cadastrar Mesa");
					System.out.println("Selecione essa opção para inserir uma nova mesa ao sistema \n");
					System.out.println("2 - Remover Mesa");
					System.out.println("Selecione essa opção para remover um mesa do sistema \n");
					System.out.println("3 - Atualizar Mesa");
					System.out.println("Selecione essa opção para atualizar os status de um mesa do sistema \n");
					System.out.println("4 - Finalizar Pedidos da Mesa");
					System.out.println("Selecione essa opção para atualizar os status de um mesa do sistema \n");
					System.out.println("5 - Voltar");
					System.out.println("Selecione essa opção para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Você escolheu a opção cadastrar mesa");
					} else if (operacao.equals("2")) {
						System.out.println("Você escolheu a opção remover mesa");
					} else if (operacao.equals("3")) {
						System.out.println("Você escolheu a opção atualizar mesa");
					} else if (operacao.equals("4")) {
						System.out.println("Você escolheu a opção finalizar pedidos da mesa");
					} else if (operacao.equals("5")) {
					} else
						System.out.println("Comando inválido. Você será redirecionado para a página inicial.");
					///////////////////////////////////////////////
					// Ingredientes (Falta teste)
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
					in.nextLine();

					String nomeIngrediente;
					int qtdIngrediente;
					String tipoEstoqueIngrediente;
					String fornecedorIngrediente;
					double precoIngrediente;
					String validadeIngrediente;
					String identificadorIngrediente;

					if (operacao.equals("1")) {
						System.out.println("Você escolheu a opção cadastrar ingrediente \n");
						System.out.print("Digite o nome do novo ingrediente:");
						nomeIngrediente = in.nextLine();
						System.out.print("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.print("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.print("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.print("Agora digite o preço do ingrediente:");
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
						System.out.println("Você escolheu a opção remover ingrediente \n");
						System.out.println("Digite o identificador do ingrediente que você quer remover:");
						identificadorIngrediente = in.nextLine();

						try {
							fachada.removerIngrediente(identificadorIngrediente);
						} catch (IngredienteNaoCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("3")) {
						System.out.println("Você escolheu a opção atualizar ingrediente");
						System.out.println("Digite o nome do ingrediente");
						nomeIngrediente = in.nextLine();
						System.out.println("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.println("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.println("Agora digite o preço do ingrediente:");
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
						System.out.println("Comando inválido. Você será redirecionado para a página inicial.");

					///////////////////////////////////////////////
					// Funcionarios
				} else if (comando.equals("5")) {
					System.out.println("Você escolheu a opção Funcionários" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operação desejada:");

					System.out.println("1 - Cadastrar Funcionário");
					System.out.println("Selecione essa opção para cadastrar um novo funcionário ao sistema \n");
					System.out.println("2 - Remover Funcionário");
					System.out.println("Selecione essa opção para remover um funcionário do sistema \n");
					System.out.println("3 - Atualizar Funcionário");
					System.out.println("Selecione essa opção para atualizar os status de um funcionário no sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opção para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Você escolheu a opção cadastrar funcionário");
						
						
						
						
					} else if (operacao.equals("2")) {
						System.out.println("Você escolheu a opção remover funcionário");
					} else if (operacao.equals("3")) {
						System.out.println("Você escolheu a opção atualizar funcionário");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando inválido. Você será redirecionado para a página inicial.");

					///////////////////////////////////////////////
					// Finalizar sessao
				} else if (comando.equals("6")) {
					System.out.println("Você deseja finalizar sua sessão? \nDigite Sim para confirmar");
					auxiliar = in.next();
					if (auxiliar.equals("Sim") || auxiliar.equals("sim")) {
						System.out.println("Sua sessão foi finalizada");
						sessao = false;
						programaAberto = false;
					} else
						System.out.println("Comando inválido. Você será redirecionado para a página inicial. \n");
					///////////////////////////////////////////////
				} else
					System.out.println("Comando inválido. Por favor digite um dos comandos abaixo. \n");

			}
		}
	}

}
