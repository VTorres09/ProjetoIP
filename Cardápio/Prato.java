public class Prato {
	private String nome;
	private double preco;
	private Ingrediente[] ingredientes;
	
	//construtor com ingrediente
	Prato(String nome, double preco, Ingrediente[] ingredientes){
		this.nome = nome;
		this.preco = preco;
		this.ingredientes = ingredientes;
	}
	//construtor sem ingrediente
	Prato(String nome, double preco){
		this.nome = nome;
		this.preco = preco;	
	}
	
	String getNome() {
		return this.nome;
	}
	double getPreco() {
		return this.preco;
	}
	Ingrediente[] getIngredientes() {
		return this.ingredientes;
	}
}
