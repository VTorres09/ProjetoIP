package Funcionarios;

public interface RepositorioFuncionarios {
	public void inserirFuncionario(Funcionario funcionario);

	public void removerFuncionario(Funcionario funcionario);
	
	public void atualizarFuncionario(Funcionario funcionario, Funcionario funcionario_);

	public boolean existeFuncionario(Funcionario funcionario);
	
	public String listarFuncionarios(String vazia);
}
