package Pedidos;

public class CadastroNaoRealizadoException extends Exception{
	public CadastroNaoRealizadoException() {
		super("Não foi possivel cadastrar pedido. Pedido já existente.");	
	}
	

}
