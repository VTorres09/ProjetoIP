package Projeto;

public class Ingrediente {
	private String nome;
	private int qtd;
	private String tipoEstoque;
	private String fornecedor;
	private double preco;
	private String validade;
	private int identificador;

	public Ingrediente(String nome, int qtd, String tipoEstoque, String fornecedor, int preco, String validade,
			int identificador) {
		this.nome = nome;
		this.qtd = qtd;
		this.tipoEstoque = tipoEstoque;
		this.fornecedor = fornecedor;
		this.preco = preco;
		this.validade = validade;
		this.identificador = 0;
//erro ao tentar iniciar o ingrediente sem um nome e pensar em outras coisas para erro
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getTipoEstoque() {
		return tipoEstoque;
	}

	public void setTipoEstoque(String tipoEstoque) {
		this.tipoEstoque = tipoEstoque;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}
