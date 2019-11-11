package Ingredientes;

public class IngredienteNaoCadastradoException extends Exception{

	public IngredienteNaoCadastradoException() {
		super("N�o existe nenhum ingrediente cadastrado com esse identificador no sistema");
		//Posso colocar o identificador para melhorar o c�digo
	}
}
