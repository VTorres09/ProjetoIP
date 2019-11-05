import java.util.*;
public class TestePrograma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//cadastro ingredientes		
		Ingrediente molhoTomate = new Ingrediente("Molho de Tomate", 10, "Caixas", "Hellmans", 5.50 , "01/01/2020");
		Ingrediente macarrao = new Ingrediente("Spaghetti", 3, "Pacotes", "Bom Preco", 8.90 , "21/03/2020");
		Ingrediente cocaLata = new Ingrediente("Coca Cola", 10, "Lata", "", 3.00, "");
		
		//cadastro da lista de ingredientes do prato
		Ingrediente[] ingredientesMacarronada = {molhoTomate, macarrao};
		Ingrediente[] cocaLataa = {cocaLata};
		
		//criacao do armazenamento de cardapio
		RepositorioCardapioArray lista =  new RepositorioCardapioArray(90);
		
		//criacao dos pratos
		Prato macarronada = new Prato("Macarronada", 24.00, ingredientesMacarronada);
		Prato cocacola = new Prato("Coca Cola", 6.00, cocaLataa);	
		
		//criacao cardapio
		Cardapio cardapio = new Cardapio(lista);
		
		//cadastro dos pratos em cardapio
		cardapio.cadastrar(cocacola);
		cardapio.cadastrar(macarronada);
		
		//listar itens cardapio
		System.out.print(cardapio.listar());
	}

}
