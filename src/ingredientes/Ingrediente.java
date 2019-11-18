package ingredientes;
public class Ingrediente {
	private String nome;
	private int qtd;
	private String tipoEstoque;
	private String fornecedor;
	private double preco;
	private String validade;
	private String identificador;

	public Ingrediente(String nome, int qtd, String tipoEstoque, String fornecedor, double preco, String validade,
			String identificador) {
		this.nome = nome;
		this.qtd = qtd;
		this.tipoEstoque = tipoEstoque;
		this.fornecedor = fornecedor;
		this.preco = preco;
		this.validade = validade;
		this.identificador = identificador;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return this.qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getTipoEstoque() {
		return this.tipoEstoque;
	}

	public void setTipoEstoque(String tipoEstoque) {
		this.tipoEstoque = tipoEstoque;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getPreco() {
		return this.preco;
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

	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
}