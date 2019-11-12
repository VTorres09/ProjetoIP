package mesas;


import Funcionarios.Funcionario;
import Pedidos.RepositorioPedidos;


public class Mesa {
	private Funcionario funcionario;
	private int numero;
	private RepositorioPedidos pedidos;
	
	Mesa(Funcionario funcionario, int num, RepositorioPedidos pedidos){
		this.funcionario = funcionario;
		this.numero= num;
		this.pedidos=pedidos;

	}

	public int getNum(){
		return this.numero;
	}

	public void setNumero(int num){
		this.numero=num;
	}
	
	public void setFuncionario(Funcionario funcionario){
		this.funcionario=funcionario;
	}
	public void setRepPedidos(RepositorioPedidos pedidos){
		this.pedidos=pedidos;

	}
}