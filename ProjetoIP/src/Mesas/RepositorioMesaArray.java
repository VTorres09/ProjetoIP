package Mesas;

import Funcionarios.Funcionario;
import Pedidos.RepositorioPedidos;

public class RepositorioMesaArray implements RepositorioMesa{
    private Mesa[] arrayMesa;
    private int count;

    public RepositorioMesaArray() {
        this.arrayMesa = new Mesa[100];
        this.count = 0;
    }

    public void inserirMesa(Mesa mesa) {
        arrayMesa[count] = mesa;
        count++;
    }

    public void removerMesa(Mesa mesa) {
        for (int i = 0; i < count; i++) {
            if (arrayMesa[i] == mesa) {
                for (int n = i + 1; n < count; n++) {
                    arrayMesa[n - 1] = arrayMesa[n];
                }
            }
        }
        count--;

    }

    

    public boolean existeMesa(int numeroMesa) {
        boolean existe = false;
        for (int i = 0; i < count; i++) {
            if (arrayMesa[i].getNum()== numeroMesa) {
                existe = true;
            }
        }
        return existe;
    }

    public void atualizarMesa(int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos ) {
        for (int i = 0; i < count; i++) {
            if (arrayMesa[i].getNum() == numeroMesa) {
                arrayMesa[i].setNumero(numeroMesa);
                arrayMesa[i].setFuncionario(funcionario);
                arrayMesa[i].setRepPedidos(pedidos);
            }
        }

    }

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}