package Estoque;

public class IngredienteNaoCadastrado extends Exception{

	public IngredienteNaoCadastrado() {
		super("N�o existe nenhum ingrediente cadastrado com esse identificador no sistema");
		//Posso colocar o identificador para melhorar o c�digo
	}
}
