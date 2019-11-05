public class Prato {
	private String nome;
	private double preco;
	private String ingredientes;
	
	
	Prato(String nome, double preco, String ingredientes){
		this.nome = nome;
		this.preco = preco;
		this.ingredientes = ingredientes;
	}
	
	String getNome() {
		return this.nome;
	}
	double getPreco() {
		return this.preco;
	}
	String getIngredientes() {
		return this.ingredientes;
	}
}