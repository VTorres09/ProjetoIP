package Estoque;

public class EstoqueVazio extends Exception{

	public EstoqueVazio() {
		super ("Atualmente o estoque n�o tem nenhum ingrediente cadastrado");
	}	
}