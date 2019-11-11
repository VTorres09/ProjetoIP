package Estoque;

public class RepositorioEstoqueArray implements RepositorioEstoque {
	private Ingrediente[] estoque;
	private int contadorLista;

	public RepositorioEstoqueArray() {
		estoque = new Ingrediente[100];
		contadorLista = 0;
	}

	// Adiciona algum ingrediente ao Estoque
	public void inserir(Ingrediente ingrediente) {
		this.estoque[contadorLista] = ingrediente;
		this.contadorLista++;
	}
// erro se o contadorLista estiver igual a .lenght do array, isso quer dizer estoque cheio
// erro se o usuario tentar inserir um ingrediente igual a outro, pensar em criterios

	// Remove algum ingrediente ao Estoque
	public void remover(String identificador) {
		for (int contador = 0; contador < this.estoque.length; contador++)
			if (this.estoque[contador].getIdentificador().equals(identificador)) {
				for (; contador < this.estoque.length; contador++) {
					if (contador != (this.estoque.length - 1))
						this.estoque[contador] = this.estoque[contador + 1];
					else
						this.estoque[contador] = null;
				}
			}
		this.contadorLista--;
//Se o ingrediente for diferente de null, mensagem de erro de produto não encontrado
	}

	// Atualiza os atributos de um ingrediente no estoque
	public void atualizar(Ingrediente ingrediente) {
		for (int contador = (this.contadorLista - 1); contador >= 0; contador--)
			if (this.estoque[contador].getIdentificador().equals(ingrediente.getIdentificador()))
				this.estoque[contador] = ingrediente;
	}

	// Analisa se algum ingrediente existe no estoque
	public boolean existe(String identificador) {
		boolean resposta = false;
		for (int contador = (this.contadorLista - 1); contador >= 0; contador--)
			if (this.estoque[contador].getIdentificador().equals(identificador))
				resposta = true;
		return resposta;
	}

	// Retorna o status de um ingrediente
	public String listarIngrediente(String identificador) {
		String resposta = "";
		for (int contador = 0; contador < this.estoque.length; contador++)
			if (this.estoque[contador].getIdentificador().contentEquals(identificador)) {
				resposta = "Ingrediente: " + this.estoque[contador].getNome() + "\n" + "Quantidade em Estoque: "
						+ this.estoque[contador].getQtd() + " " + this.estoque[contador].getTipoEstoque() + "\n" + "Fornecedor: "
						+ this.estoque[contador].getFornecedor() + "\n" + "Preço Unitário: " + this.estoque[contador].getPreco() + "\n"
						+ "Validade: " + this.estoque[contador].getValidade() + "\n" 
						+ "Identificador: " + this.estoque[contador].getIdentificador() + "\n" ;
				contador = this.estoque.length;
			}
		// Se o ingrediente for diferente de null, mensagem de erro de produto não
		// encontrado
		return resposta;
	}

	// Retorna todo o Estoque atual
	public String listarEstoque() {
		String resposta = "-------- Estoque ---------" + "\n";
		for (int contador = (this.contadorLista - 1); contador >= 0; contador--) {
			resposta += "Ingrediente: " + this.estoque[contador].getNome() + "\n" + "Quantidade em Estoque: "
					+ this.estoque[contador].getQtd() + " " + this.estoque[contador].getTipoEstoque() + "\n" + "Fornecedor: "
					+ this.estoque[contador].getFornecedor() + "\n" + "Preço Unitário: "
					+ this.estoque[contador].getPreco() + "\n" + "Validade: " + this.estoque[contador].getValidade() + "\n"
					+ "Identificador: " + this.estoque[contador].getIdentificador() + "\n";
			resposta += "--------------------------" + "\n";		
		}
		return resposta;
	}
	//Retorna o identificador de um ingrediente com um certo nome, fornecedor e validade
	public boolean existe(String nome, String fornecedor, String validade) {
		boolean resposta = false;
		for (int contador = (this.contadorLista - 1); contador >= 0 && !resposta; contador--)
			if (this.estoque[contador].getNome().equals(nome) &&
				this.estoque[contador].getFornecedor().equals(fornecedor) &&
				this.estoque[contador].getValidade().equals(validade))
				resposta = true;
		return resposta;
	}
	//Retorna o identificador de um ingrediente com um certo nome, fornecedor e validade
	public String getIdentificador(String nome, String fornecedor, String validade) {
		String resposta = "";
		for (int contador = (this.contadorLista - 1); contador >= 0 && resposta.equals(""); contador--)
			if (this.estoque[contador].getNome().equals(nome) &&
				this.estoque[contador].getFornecedor().equals(fornecedor) &&
				this.estoque[contador].getValidade().equals(validade))
				resposta = this.estoque[contador].getIdentificador();
		return resposta;
	}
	public boolean estoqueVazio() {
		if(this.contadorLista == 0)
			return true;
		else
			return false;
	}
}
