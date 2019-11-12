package Ingredientes;

public class NaoExistemIngredientesException extends Exception{

	public NaoExistemIngredientesException() {
		super ("Atualmente o estoque não tem nenhum ingrediente cadastrado");
	}	
}