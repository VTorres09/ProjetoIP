package Ingredientes;

public class NaoExistemIngredientesException extends Exception{

	public NaoExistemIngredientesException() {
		super ("Atualmente o estoque n�o tem nenhum ingrediente cadastrado");
	}	
}