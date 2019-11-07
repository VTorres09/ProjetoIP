package Cardápio;

import Estoque.Ingrediente;

public class Cardapio {
	private RepositorioCardapio pratos;
	
	public Cardapio(RepositorioCardapio rep){
		this.pratos = rep;
	}
	
	public void cadastrar(Prato prato) {
		String nomePrato = prato.getNome();
		if(!pratos.existePrato(nomePrato)) {
			pratos.adicionarPrato(prato);
		} else {
			throw new RuntimeException("Ja cadastrado");
		}
				
	}
	
	public void remover(Prato prato) {
		String nomePrato = prato.getNome();
		if(pratos.existePrato(nomePrato)) {
			pratos.removerPrato(prato);
		} else {
			throw new RuntimeException("Nao cadastrado");
		}
	}
	
	public void atualizar(int identificador, String nome, double preco, Ingrediente[] ingredientes) {
		if(!pratos.existePrato(nome)) {
			pratos.atualizarPrato(identificador, nome, preco, ingredientes);
		} else {
			throw new RuntimeException("O produto não existe");
		}
	}
	
	public String listar() {
		return pratos.listarPrato();
	}
	
	
	//completar com outras funcionalidades de cardapio
	
	
	
}