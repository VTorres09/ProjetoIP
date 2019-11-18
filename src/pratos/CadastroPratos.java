package pratos;

import ingredientes.Ingrediente;

public class CadastroPratos {
	private RepositorioPratos pratos;
	
	public CadastroPratos(RepositorioPratos rep){
		this.pratos = rep;
	}
	
	public void cadastrar(Prato prato) throws PratoJaCadastradoException {
		String nomePrato = prato.getNome();
		if(!pratos.existePrato(nomePrato)) {
			pratos.adicionarPrato(prato);
		} else {
			throw new PratoJaCadastradoException();
		}
				
	}
	
	public void remover(Prato prato) throws PratoNaoCadastradoException {
		String nomePrato = prato.getNome();
		if(pratos.existePrato(nomePrato)) {
			pratos.removerPrato(prato);
		} else {
			throw new PratoNaoCadastradoException();
		}
	}
	
	public void atualizar(int identificador, String nome, double preco, Ingrediente[] ingredientes) throws PratoNaoCadastradoException {
		if(!pratos.existePrato(nome)) {
			pratos.atualizarPrato(identificador, nome, preco, ingredientes);
		} else {
			throw new PratoNaoCadastradoException();
		}
	}
	
	public String listar() {
		return pratos.listarPrato();
	}
	
	
	//completar com outras funcionalidades de cardapio
	
	
	
}