package funcionarios;


public class CadastroFuncionarios {
	private RepositorioFuncionarios colecaoFuncionarios;
	
	
	public CadastroFuncionarios(RepositorioFuncionarios repFuncionarios) {
		this.colecaoFuncionarios = repFuncionarios;
	}

	public String listar() throws NaoHaFuncionariosException {	
		if(colecaoFuncionarios.listarFuncionarios("").equals("")) {
			throw new NaoHaFuncionariosException();
		} else {
		return colecaoFuncionarios.listarFuncionarios("");
		}
	}

	
	public void cadastrar(Funcionario adicionado) throws FuncionarioJaCadastradoException {
		if(!colecaoFuncionarios.existeFuncionario(adicionado)) {
			colecaoFuncionarios.inserirFuncionario(adicionado);
		} else {
			throw new FuncionarioJaCadastradoException();
		}
		
	}

	public void remover(Funcionario demitido) throws FuncionarioNaoExistenteException {
		if(colecaoFuncionarios.existeFuncionario(demitido)) {
		colecaoFuncionarios.removerFuncionario(demitido);
		} else {
			throw new FuncionarioNaoExistenteException ();
		}
	}
	
	public void atualizar(Funcionario antigo, Funcionario novo) {
		if(colecaoFuncionarios.existeFuncionario(antigo))
		colecaoFuncionarios.atualizarFuncionario(antigo, novo);
	}
	public RepositorioFuncionarios getFuncionarios() {
		return this.colecaoFuncionarios;
	}

}