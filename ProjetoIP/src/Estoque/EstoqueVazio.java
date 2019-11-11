package Estoque;

public class EstoqueVazio extends Exception{

	public EstoqueVazio() {
		super ("Atualmente o estoque não tem nenhum ingrediente cadastrado");
	}	
}