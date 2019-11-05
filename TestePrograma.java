import java.util.*;
public class TestePrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Prato cocacola = new Prato("Coca cola", 6.00, "");
		RepositorioCardapioLista lista =  new RepositorioCardapioLista();
		RepositorioCardapioArray listaArray =  new RepositorioCardapioArray();
		Cardapio cardapio = new Cardapio(listaArray);
		cardapio.cadastrar(cocacola);
		
	}

}
