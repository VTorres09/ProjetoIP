public class RepositorioFuncionariosArray implements RepositorioFuncionarios {
	private Funcionario[] funcionario = new Funcionario[100];

	public void inserirFuncionario(Funcionario adicionado) {
		int n = 0;
		boolean continuar = true;
		while (continuar) {
			if (funcionario[n] == null) {
				funcionario[n] = adicionado;
				continuar = false;
			} else {
				n += 1;
			}
		}
	}

	public void removerFuncionario(Funcionario removido) {
		int n = 0;
		boolean continuar = true;
		while (continuar) {
			if (funcionario[n] == removido) {
				int i = n;
				while(funcionario[i+1] != null) {
				funcionario[i] = funcionario[i+1];
				i++;
				}
				if(funcionario[i] != null) {
				funcionario[i] = null;
				}
				
				continuar = false;
			} else {
				n += 1;
			}
		}
	}
	
	
	public void atualizarFuncionario(Funcionario antigo, Funcionario novo) {
		int n = 0;
		boolean continuar = true;
		while (continuar) {
			if (funcionario[n] == antigo) {
				funcionario[n] = novo;
				continuar = false;
			} else {
				n += 1;
			}
		}
	}
	

	public boolean existeFuncionario(Funcionario procurado) {
		int n = 0;
		boolean continuar = true;
		boolean res = false;
		while (continuar) {
			if (funcionario[n] == null) {
				continuar = false;
				res = false;
			} else if (funcionario[n] == procurado) {
				continuar = false;
				res = true;
			} else {
				n+=1;
			}
		}
		return res;
	}
	
	public String listarFuncionarios(String vazia) {
		String res = "";
		int n = 0;
		boolean continuar = true;
		while (continuar) {
			if (funcionario[n] == null && n != 0) {
				continuar = false;
			} else if (funcionario[n] != null) {
				res += funcionario[n].getDados() + "\n";
			} else {
//ERRO
			}
			n++;
		}
		return res;
	}
	
}