package fachada;

import ingredientes.*;
import pratos.*;
import mesas.*;
import pedidos.*;

import java.util.Scanner;

import funcionarios.*;

public class Programa {

	public static void main(String[] args){

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
						"Escolha um dos comandos abaixo para selecionar qual funcionalidade voce deseja usar \n");
				System.out.println("1 - Pedidos");
				System.out.println("Selecione essa opcao para acessar as operacoes relacionadas a pedidos. \n");
				System.out.println("2 - Cardapio");
				System.out.println("Selecione essa opcao para acessar as operacoes relacionadas a cardapio. \n");
				System.out.println("3 - Mesas");
				System.out.println("Selecione essa opcao para acessar as operacoess relacionadas a mesas. \n");
				System.out.println("4 - Ingredientes");
				System.out.println("Selecione essa opcao para acessar as operacoes relacionadas a ingredientes. \n");
				System.out.println("5 - Funcionarios");
				System.out.println("Selecione essa opcao para acessar as operacoes relacionadas a funcionarios. \n");
				System.out.println("6 - Finalizar Sessao");
				System.out.println("Selecione essa opcao para finalizar sua sessao. \n");

				comando = in.next();

				///////////////////////////////////////////////
				// Pedidos
				if (comando.equals("1")) {
					System.out.println("Voce escolheu a opcao Pedidos" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operacao desejada:");

					System.out.println("1 - Cadastrar Pedido");
					System.out.println("Selecione essa opcao para inserir um novo pedido no sistema \n");
					System.out.println("2 - Remover Pedido");
					System.out.println("Selecione essa opcao para remover um pedido do sistema \n");
					System.out.println("3 - Atualizar Pedido");
					System.out.println("Selecione essa opcao para atualizar os status de um pedido do sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opcao para voltar para a tela anterior \n");

					operacao = in.next();

					// Pedidos Pedido
					int numeroMesa;

					if (operacao.equals("1")) {
						System.out.println("Voce escolheu a opcao cadastrar pedido");
					} else if (operacao.equals("2")) {
						System.out.println("Voce escolheu a opcao remover pedido");
					} else if (operacao.equals("3")) {
						System.out.println("Voce escolheu a opcao atualizar pedido");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial.");

					///////////////////////////////////////////////
					// Cardapio (Falta teste)
				} else if (comando.equals("2")) {
					System.out.println("Voce escolheu a opcao Cardapio" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operacao desejada:");

					System.out.println("1 - Cadastrar Prato");
					System.out.println("Selecione essa opcao para inserir um novo prato no cardapio \n");
					System.out.println("2 - Remover Prato");
					System.out.println("Selecione essa opcao para remover um prato do cardapio \n");
					System.out.println("3 - Atualizar Prato");
					System.out.println("Selecione essa opcao para atualizar os status de um prato do cardapio \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opcao para voltar para a tela anterior \n");

					operacao = in.next();
					in.nextLine();

					String nomePrato;
					String fim;
					double precoPrato;
					int contador = 0;
					String identificadorIngrediente = "";
					Ingrediente[] ingredientesPrato = new Ingrediente[10];
					int identificadorPrato;

					if (operacao.equals("1")) {
						System.out.println("Voce escolheu a opcao cadastrar prato \n");
						System.out.println("Digite o nome do novo prato");
						nomePrato = in.nextLine();
						System.out.println("Agora digite o preco desse prato:");
						precoPrato = in.nextDouble();
						in.nextLine();
						System.out.println(
								"Agora e necessario que voce informe os ingredientes que sao usados no prato : \n Ao terminar, digite fim");

						for (fim = ""; !fim.equals("fim");) {
							
							
							System.out.println("Digite um identificador para seu ingrediente:");
							identificadorIngrediente = in.nextLine();
                                                  
							System.out.println("Fim?");
							fim = in.nextLine();	

						}
						Ingrediente ingrediente;
						try {
							ingrediente = fachada.procurarIngrediente(identificadorIngrediente);
							ingredientesPrato[contador] = ingrediente;
							contador++;		
							System.out.println("Agora digite o identificador desse prato:");
							identificadorPrato = in.nextInt();

							Prato prato = new Prato(nomePrato, precoPrato, ingredientesPrato, identificadorPrato);
							System.out.println("Prato cadastrado com sucesso!");
							System.out.println("-----------------------------------");
							try {
								try {
									fachada.cadastrarPrato(prato);
								} catch (IngredientesInsuficientesException e) {
									e.printStackTrace();
								}
							} catch (PratoJaCadastradoException e) {
								System.out.println(e);
							}
							
						} catch (IngredienteNaoCadastradoException e) {
							
							e.printStackTrace();
							in.nextLine();
							fim = "fim";
						}
						

					} else if (operacao.equals("2")) {
						System.out.println("Voce escolheu a opcao remover prato");
						System.out.print("Digite o nome do prato: ");
						nomePrato = in.nextLine();
						
						Prato pratoRemover;
						try {
							pratoRemover = fachada.procurarPrato(nomePrato);
							try {
								fachada.removerPrato(pratoRemover);
								System.out.println("Prato removido com sucesso!");
								System.out.println("-----------------------------------");
							} catch (PratoNaoCadastradoException e) {
								e.printStackTrace();
								in.nextLine();
							}
						} catch (PratoNaoCadastradoException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							in.nextLine();
						}


					} else if (operacao.equals("3")) {
						contador = 0;
						Ingrediente ingrediente;
						System.out.println("Voce escolheu a opcao atualizar prato");
						System.out.print("Digite o nome do prato: ");
						String novoNomePrato = in.nextLine();
						System.out.print("Digite o novo preco do prato (Se desejado): ");
						Double novoPrecoPrato = in.nextDouble(); 
						in.nextLine();
						System.out.println("Digite os novos ingredientes do prato (Se desejado): \n Ao terminar, digite fim.");
						Ingrediente[] ingredientesNovoPrato = new Ingrediente[10];
						for (fim = ""; !fim.equals("fim");) {
				
							System.out.println("Digite um identificador para seu ingrediente:");
							identificadorIngrediente = in.nextLine();
                                                  
							System.out.println("Fim?");
							fim = in.nextLine();

						}
						
						try {
							ingrediente = fachada.procurarIngrediente(identificadorIngrediente);
							ingredientesNovoPrato[contador] = ingrediente;
							contador++;		
							System.out.println("Agora digite o identificador desse prato:");
							identificadorPrato = in.nextInt();

							Prato novoPrato = new Prato(novoNomePrato, novoPrecoPrato, ingredientesNovoPrato, identificadorPrato);
							
							try {
								fachada.atualizarPrato(novoPrato);
								System.out.println("Prato atualizado com sucesso!");
								System.out.println("-----------------------------------");
								
							} catch (PratoNaoCadastradoException e) {
								e.printStackTrace();
								in.nextLine();
							}
							
						} catch (IngredienteNaoCadastradoException e) {
							
							e.printStackTrace();
							in.nextLine();
							fim = "fim";
						}

					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial.");

					///////////////////////////////////////////////
					// Mesas
				} else if (comando.equals("3")) {
					System.out.println("Voce escolheu a opcao Mesas" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operacao desejada:");

					System.out.println("1 - Cadastrar Mesa");
					System.out.println("Selecione essa opcao para inserir uma nova mesa ao sistema \n");
					System.out.println("2 - Remover Mesa");
					System.out.println("Selecione essa opcao para remover um mesa do sistema \n");
					System.out.println("3 - Atualizar Mesa");
					System.out.println("Selecione essa opcao para atualizar os status de um mesa do sistema \n");
					System.out.println("4 - Finalizar Pedidos da Mesa");
					System.out.println("Selecione essa opcao para atualizar os status de um mesa do sistema \n");
					System.out.println("5 - Voltar");
					System.out.println("Selecione essa opcao para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Voce escolheu a opcao cadastrar mesa");
					} else if (operacao.equals("2")) {
						System.out.println("Voce escolheu a opcao remover mesa");
					} else if (operacao.equals("3")) {
						System.out.println("Voce escolheu a opcao atualizar mesa");
					} else if (operacao.equals("4")) {
						System.out.println("Voce escolheu a opcao finalizar pedidos da mesa");
					} else if (operacao.equals("5")) {
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial.");
					///////////////////////////////////////////////
					// Ingredientes (Falta teste)
				} else if (comando.equals("4")) {
					System.out.println("Voce escolheu a opcao Ingredientes" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operacao desejada: \n");
					System.out.println("1 - Cadastrar Ingrediente");
					System.out.println("Selecione essa opcao para inserir um novo ingrediente no estoque \n");
					System.out.println("2 - Remover Ingrediente");
					System.out.println("Selecione essa opcao para remover um ingrediente do estoque \n");
					System.out.println("3 - Atualizar Ingrediente");
					System.out.println("Selecione essa opcao para atualizar os status de um ingrediente do estoque \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opcao para voltar para a tela anterior \n");

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
						System.out.println("Voce escolheu a opcao cadastrar ingrediente \n");
						System.out.print("Digite o nome do novo ingrediente:");
						nomeIngrediente = in.nextLine();
						System.out.print("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.print("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.print("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.print("Agora digite o preco do ingrediente:");
						precoIngrediente = in.nextDouble();
						in.nextLine();
						System.out.print("Agora digite a validade desse ingrediente:");
						validadeIngrediente = in.nextLine();
						System.out.print("Agora digite um identificador para seu ingrediente:");
						identificadorIngrediente = in.nextLine();

						Ingrediente ingrediente = new Ingrediente(nomeIngrediente, qtdIngrediente,
								tipoEstoqueIngrediente, fornecedorIngrediente, precoIngrediente, validadeIngrediente,
								identificadorIngrediente);
						System.out.println("Ingrediente Cadastrado com sucesso!");
						System.out.println("-----------------------------------");
						try {
							fachada.cadastrarIngrediente(ingrediente);
						} catch (IngredienteJaCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("2")) {
						System.out.println("Voce escolheu a opcao remover ingrediente \n");
						System.out.println("Digite o identificador do ingrediente que voce quer remover:");
						identificadorIngrediente = in.nextLine();

						try {
							fachada.removerIngrediente(identificadorIngrediente);
						} catch (IngredienteNaoCadastradoException e) {
							System.out.println(e);
						}

					} else if (operacao.equals("3")) {
						System.out.println("Voce escolheu a opcao atualizar ingrediente");
						System.out.println("Digite o nome do ingrediente");
						nomeIngrediente = in.nextLine();
						System.out.println("Agora digite a quantidade desse ingrediente:");
						qtdIngrediente = in.nextInt();
						in.nextLine();
						System.out.println("Agora digite o fornecedor desse ingrediente:");
						fornecedorIngrediente = in.nextLine();
						System.out.println("Agora digite o tipo de estocagem desse ingrediente:");
						tipoEstoqueIngrediente = in.nextLine();
						System.out.println("Agora digite o preco do ingrediente:");
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
							in.nextLine();
						}
						
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial.");

					///////////////////////////////////////////////
					// Funcionarios
				} else if (comando.equals("5")) {
					System.out.println("Voce escolheu a opcao Funcionarios" + "\n"
							+ "Escolha um dos comandos abaixo para selecionar a operacao desejada:");

					System.out.println("1 - Cadastrar Funcionario");
					System.out.println("Selecione essa opcao para cadastrar um novo Funcionario ao sistema \n");
					System.out.println("2 - Remover Funcionario");
					System.out.println("Selecione essa opcao para remover um Funcionario do sistema \n");
					System.out.println("3 - Atualizar Funcionario");
					System.out.println("Selecione essa opcao para atualizar os status de um Funcionario no sistema \n");
					System.out.println("4 - Voltar");
					System.out.println("Selecione essa opcao para voltar para a tela anterior \n");

					operacao = in.next();

					if (operacao.equals("1")) {
						System.out.println("Voce escolheu a opcao cadastrar Funcionario");
					} else if (operacao.equals("2")) {
						System.out.println("Voce escolheu a opcao remover Funcionario");
					} else if (operacao.equals("3")) {
						System.out.println("Voce escolheu a opcao atualizar Funcionario");
					} else if (operacao.equals("4")) {
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial.");

					///////////////////////////////////////////////
					// Finalizar sessao
				} else if (comando.equals("6")) {
					System.out.println("Voce deseja finalizar sua sessao? \nDigite Sim para confirmar");
					auxiliar = in.next();
					if (auxiliar.equals("Sim") || auxiliar.equals("sim")) {
						System.out.println("Sua sessao foi finalizada");
						sessao = false;
						programaAberto = false;
					} else
						System.out.println("Comando invalido. Voce sera redirecionado para a pagina inicial. \n");
					///////////////////////////////////////////////
				} else
					System.out.println("Comando invalido. Por favor digite um dos comandos abaixo. \n");

			}
		}
	}

}
