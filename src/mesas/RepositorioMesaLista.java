package mesas;

import funcionarios.Funcionario;
import pedidos.RepositorioPedidos;

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

    public void atualizarMesa(Mesa mesa, int numeroMesa, Funcionario funcionario, RepositorioPedidos pedidos ){
        if (this.mesa.getNum()== mesa.getNum()){
            this.mesa.setNumero(numeroMesa);
            this.mesa.setFuncionario(funcionario);
            this.mesa.setRepPedidos(pedidos);
        }else {
            this.proximo.atualizarMesa(mesa,numeroMesa, funcionario, pedidos);

        }
    }
	
	
	


}
