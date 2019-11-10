package Estoque;

public class IngredienteJaCadastrado extends Exception{

	public IngredienteJaCadastrado(){
		super("Esse ingrediente já está cadastrado no estoque");
		//Informacoes do ingrediente ja existente
	}
}
