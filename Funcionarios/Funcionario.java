public class Funcionario {
	private String login;
	private String senha;
	private String nome;
	private String funcao;
	private String endereco;
	private String dataDeNascimento;
	private String cpf;
	private String rg;

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

// construtor de classe
	Funcionario( // parametros:
			String login, String senha, String nome, String funcao, String endereco, String dataDeNascimento,
			String cpf, String rg) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.funcao = funcao;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.rg = rg;
	}

//getTudo
	public String getDados() {
		String res = "";
		res += "Login: ******\n";
		res += "Senha: ***********\n";
		res += "Nome Completo: " + this.nome + "\n";
		res += "Função: " + this.funcao + "\n";
		res += "Endereço: " + this.endereco + "\n";
		res += "Data De Nascimento: " + this.dataDeNascimento + "\n";
		res += "CPF: " + this.cpf + "\n";
		res += "RG: " + this.rg + "\n";
		res += "------------------------";
		return res;
	}

}
