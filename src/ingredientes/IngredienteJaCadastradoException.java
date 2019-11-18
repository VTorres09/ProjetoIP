package Ingredientes;

public class IngredienteJaCadastradoException extends Exception{

	public IngredienteJaCadastradoException(){
		super("Esse ingrediente já está cadastrado no estoque");
		//Informacoes do ingrediente ja existente
	}
}