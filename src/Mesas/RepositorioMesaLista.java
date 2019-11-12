package Mesas;

import Funcionarios.Funcionario;
import Pedidos.RepositorioPedidos;

public class RepositorioMesaLista implements RepositorioMesa {
    private Mesa mesa;
    private RepositorioMesaLista proximo;

    public RepositorioMesaLista(){
        this.mesa=null;
        this.proximo=null;
    }
    public void inserirMesa(Mesa mesa){
        if (this.mesa==null){
            this.mesa= mesa;
            this.proximo= new RepositorioMesaLista();
        }else{
            this.proximo.inserirMesa(mesa);
        }
    }

    public void removerMesa(Mesa mesa){
        if (this.mesa.getNum()== mesa.getNum()){
            this.mesa=this.proximo.mesa;
            this.proximo=this.proximo.proximo;
        }else{
            this.proximo.removerMesa(mesa);
        }
    }
    
    public boolean existeMesa(Mesa mesa){
        if (this.mesa==null){
            return false;
        }else if (this.mesa.getNum()== mesa.getNum()){
            return true;
        }else{
            return this.proximo.existeMesa(mesa);
        }

    }

    public void atualizarMesa(int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos ){
        if (this.mesa.getNum()== numeroMesa){
            this.mesa.setNumero(numeroMesa);
            this.mesa.setFuncionario(funcionario);
            this.mesa.setRepPedidos(pedidos);
        }else {
            this.proximo.atualizarMesa(numeroMesa, funcionario, pedidos);

        }
    }
	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean existeMesa(int numeroMesa) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
