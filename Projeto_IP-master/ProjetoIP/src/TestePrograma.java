import java.util.*;

import Ingredientes.Ingrediente;
import Pratos.Cardapio;
import Pratos.Prato;
import Pratos.PratoJaCadastradoException;
import Pratos.PratoNaoCadastradoException;
import Pratos.RepositorioCardapioArray;
import Pratos.RepositorioCardapioLista;


public class TestePrograma {

	public static void main(String[] args) throws PratoJaCadastradoException, PratoNaoCadastradoException{
		Scanner in = new Scanner(System.in);
		//programinha 
		String login;
		String senha;
		int comando;
		String nomePrato;
		double precoPrato;
		Ingrediente[] ingredientesPrato;
		System.out.println("Digite seu login e senha para continuar!");
		System.out.println("Login: "); 
		login = in.nextLine();
		System.out.println("Senha: "); 
		senha = in.nextLine();
		System.out.println("Olá! Eu sou o seu gerenciador de restaurante como posso ajuda-lo?");
		System.out.println("1 - Cadastrar Pratos");
		System.out.println("2 - Remover Pratos");
		System.out.println("3 - Remover Pratos");
		System.out.println("4 - Listar Cardápio");
		comando = in.nextInt();
		System.out.println("-----------------------");
		if(comando == 1) {
			
			System.out.println("Digite o nome: ");
			nomePrato = in.nextLine();
			System.out.println("Digite o preço: ");
			precoPrato = in.nextDouble();
			System.out.println("Digite seus ingredientes: ");
			
			
		} else if(comando == 2) {
			
		} else if(comando == 3) {
			
		}else if(comando == 4) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*cadastro ingredientes		
		Ingrediente molhoTomate = new Ingrediente("Molho de Tomate", 10, "Caixas", "Hellmans", 5.50 , "01/01/2020");
		Ingrediente macarrao = new Ingrediente("Spaghetti", 3, "Pacotes", "Bom Preco", 8.90 , "21/03/2020");
		Ingrediente cocaLata = new Ingrediente("Coca Cola", 10, "Lata", "", 3.00, "");
		Ingrediente massaPizza = new Ingrediente("Massa de Pizza fininha", 1000, "Caixas", "Sadia", 10.00, "05/09/2019");
		Ingrediente calabresa = new Ingrediente("Calabresa", 178, "Pacotes", "Masterboi", 7.50, "05/09/2012");
		Ingrediente queijomussarela = new Ingrediente("Queijo Mussarela", 45, "Kg", "Sadia", 212.50, "05/09/2076");
		Ingrediente queijocatupiry = new Ingrediente("Catupiry", 120, "Kg", "Catupiry", 122.50, "05/02/2036");
		
		//cadastro da lista de ingredientes do prato
		Ingrediente[] ingredientesMacarronada = {molhoTomate, macarrao};
		Ingrediente[] ingredientesPizzacalabresaCatupiry = {massaPizza, calabresa, queijomussarela, queijocatupiry};
		Ingrediente[] cocaLataa = {cocaLata};
		
		//criacao do armazenamento de cardapio
		RepositorioCardapioLista lista =  new RepositorioCardapioLista();
		
		//criacao dos pratos
		Prato macarronada = new Prato("Macarronada", 24.00, ingredientesMacarronada, 1);
		Prato cocacola = new Prato("Coca Cola", 6.00, cocaLataa, 2);
		Prato PizzaCalabresaCatupiry = new Prato("Pizza de Calabresa com Catupiry", 60.00, ingredientesPizzacalabresaCatupiry, 3);
		
		//criacao cardapio
		Cardapio cardapio = new Cardapio(lista);
		
		//cadastro dos pratos em cardapio
		cardapio.cadastrar(cocacola);
		cardapio.cadastrar(macarronada);
		cardapio.cadastrar(PizzaCalabresaCatupiry);
		cardapio.atualizar(1, "Macarronada a bolonhesa", 22.00 , ingredientesMacarronada);
		
		//listar itens cardapio
		System.out.print(cardapio.listar());  */
	}

}
