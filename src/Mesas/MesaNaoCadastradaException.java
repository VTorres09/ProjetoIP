package Mesas;

public class MesaNaoCadastradaException extends Exception {
	public MesaNaoCadastradaException() {
		super("Mesa nao existe");
	}

}
