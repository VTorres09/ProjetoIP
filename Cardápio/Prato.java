package Cardápio;

import Estoque.Ingrediente;

public class Prato {
	private String nome;
	private double preco;
	private Ingrediente[] ingredientes;
	private int identificador = 0;
	//construtor com ingrediente
	public Prato(String nome, double preco, Ingrediente[] ingredientes, int identificador){
		this.nome = nome;
		this.preco = preco;
		this.ingredientes = ingredientes;
		this.identificador += 1;
	}
	//construtor sem ingrediente
	Prato(String nome, double preco, int identificador){
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
	int getIdentificador() {
		return this.identificador;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setPreco(double preco) {
		this.preco = preco;
	}
	void setIngrediente(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}
}
