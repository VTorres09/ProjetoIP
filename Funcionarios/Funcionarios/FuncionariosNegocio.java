
public class FuncionariosNegocio {
	private RepositorioFuncionarios colecaoFuncionarios;

	public String listarFuncionarios() {
		return colecaoFuncionarios.listarFuncionarios("");
	}

	public boolean existeFuncionario(Funcionario procurado) {
		return colecaoFuncionarios.existeFuncionario(procurado);
	}
	
	public void contratarFuncionario(Funcionario adicionado) {
		if(!existeFuncionario(adicionado))
		colecaoFuncionarios.inserirFuncionario(adicionado);
	}

	public void demitirFuncionario(Funcionario demitido) {
		if(existeFuncionario(demitido))
		colecaoFuncionarios.removerFuncionario(demitido);
	}
	
	public void atualizarFuncionario(Funcionario antigo, Funcionario novo) {
		if(existeFuncionario(antigo))
		colecaoFuncionarios.atualizarFuncionario(antigo, novo);
	}

}