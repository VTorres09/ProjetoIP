import java.util.*;
public class TestePrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Prato cocacola = new Prato("Coca cola", 6.00, "Cafeina");
		Prato fanta = new Prato("Fanta", 6.00, "Laranja");
		RepositorioCardapioLista lista =  new RepositorioCardapioLista();
		Cardapio cardapio = new Cardapio(lista);
		cardapio.cadastrar(cocacola);
		cardapio.cadastrar(fanta);
		System.out.print(cardapio.listar());
	}

}
