package ingredientes;

public class IngredienteJaCadastradoException extends Exception{

	public IngredienteJaCadastradoException(){
		super("Esse ingrediente j� est� cadastrado no estoque");
		//Informacoes do ingrediente ja existente
	}
}
