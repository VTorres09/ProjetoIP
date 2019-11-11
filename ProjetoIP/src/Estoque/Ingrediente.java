package Estoque;
public class Ingrediente {
	private String nome;
	private int qtd;
	private String tipoEstoque;
	private String fornecedor;
	private double preco;
	private String validade;
	private String identificador;

	public Ingrediente(String nome, int qtd, String tipoEstoque, String fornecedor, int preco, String validade,
			String identificador) {
		this.nome = nome;
		this.qtd = qtd;
		this.tipoEstoque = tipoEstoque;
		this.fornecedor = fornecedor;
		this.preco = preco;
		this.validade = validade;
		this.identificador = identificador;
//erro ao tentar iniciar o ingrediente sem um nome e pensar em outras coisas para erro
	}
	
	/*
	//Esse codigo deve ser colococado no lugar onde o gerador for criado
	public String gerarIdentificador() {
	
		// gerar string aleatoria e checar se o identificador existe
		String identificador = "";
		int aux;

		for (int contador = 0; contador < 5; contador++) {
			if (contador == 1 || contador == 3) {
				aux = (int) Math.round(Math.random() * 10);
				if (aux % 3 == 0)
					identificador += "B";
				else if (aux % 2 == 0)
					identificador += "A";
				else
					identificador += "C";
			} else
				identificador += (int) Math.floor(Math.random() * 10) + "";
		}
		return identificador;
	}
	*/
	
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

	public String getIdentificador() {
		return identificador;
	}
}
