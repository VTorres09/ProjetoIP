package Estoque;

public class IngredienteJaCadastrado extends Exception{

	public IngredienteJaCadastrado(){
		super("Esse ingrediente j� est� cadastrado no estoque");
		//Informacoes do ingrediente ja existente
	}
}
