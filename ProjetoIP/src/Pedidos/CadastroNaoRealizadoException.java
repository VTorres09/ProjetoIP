package Pedidos;

public class CadastroNaoRealizadoException extends Exception{
	public CadastroNaoRealizadoException() {
		super("N�o foi possivel cadastrar pedido. Pedido j� existente.");	
	}
	

}
