import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioFuncionariosArray listaFuncionarios = new RepositorioFuncionariosArray();
		Funcionario Cleyton = new Garcom("Cleytinho123", "bra", "Cleyton Collins",
				"Rua Alameda da Conceicao, n432, apt 602", "11/09/3056", "210.276.818-42", "9.356.142");

		Funcionario CleytonGemeo = new Gerente("Cley", "brasdadwadwadawdddadadwadil24", "Cleyton Gemeo Collins",
				"Rua Alameda da Conceicao, n432, apt 602", "11/09/3056", "310.276.818-43", "9.533.432");

		Funcionario CleytonTrigemeo = new Dono("Cleytinho1234", "brasil23", "Cleyton Trigemeo Collins",
				 "Rua Alameda da Conceicao, n432, apt 602", "12/09/3056", "310.456.818-43", "9.333.432");

		if(!listaFuncionarios.existeFuncionario(Cleyton)) {
			listaFuncionarios.inserirFuncionario(Cleyton);
		}
		if(!listaFuncionarios.existeFuncionario(CleytonGemeo)) {
			listaFuncionarios.inserirFuncionario(CleytonGemeo);
		}
		if(!listaFuncionarios.existeFuncionario(CleytonTrigemeo)) {
			listaFuncionarios.inserirFuncionario(CleytonTrigemeo);
		}
		
		System.out.println(listaFuncionarios.listarFuncionarios(""));
		
		if(listaFuncionarios.existeFuncionario(Cleyton)) {
			listaFuncionarios.removerFuncionario(Cleyton);
		}
		
		System.out.println("\n"+"\n"+"\n"+"\n");
		System.out.println(listaFuncionarios.listarFuncionarios(""));
		
		if(listaFuncionarios.existeFuncionario(CleytonGemeo)) {
			listaFuncionarios.atualizarFuncionario(CleytonGemeo, Cleyton);
		}

		System.out.println("\n"+"\n"+"\n"+"\n");
		System.out.println(listaFuncionarios.listarFuncionarios(""));
		
	}

}
