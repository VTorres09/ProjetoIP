package funcionarios;


public class CadastroFuncionarios {
	private RepositorioFuncionarios colecaoFuncionarios;

	public String listarFuncionarios() throws NaoHaFuncionariosException {	
		if(colecaoFuncionarios.listarFuncionarios("").equals("")) {
			throw new NaoHaFuncionariosException();
		} else {
		return colecaoFuncionarios.listarFuncionarios("");
		}
	}

	
	public void contratarFuncionario(Funcionario adicionado) throws FuncionarioJaCadastradoException {
		if(!colecaoFuncionarios.existeFuncionario(adicionado)) {
			colecaoFuncionarios.inserirFuncionario(adicionado);
		} else {
			throw new FuncionarioJaCadastradoException();
		}
		
	}

	public void demitirFuncionario(Funcionario demitido) throws FuncionarioNaoExistenteException {
		if(colecaoFuncionarios.existeFuncionario(demitido)) {
		colecaoFuncionarios.removerFuncionario(demitido);
		} else {
			throw new FuncionarioNaoExistenteException ();
		}
	}
	
	public void atualizarFuncionario(Funcionario antigo, Funcionario novo) {
		if(colecaoFuncionarios.existeFuncionario(antigo))
		colecaoFuncionarios.atualizarFuncionario(antigo, novo);
	}

}