import java.util.ArrayList;

public class Pedido {

	Produto[] prod;
	
	public void iniciar(int n){
		prod = new Produto[n];
	}
	
	public void adicionarProduto(Produto p){
		for(int i = 0; i <prod.length;i++){
			if(prod[i]== null){
				prod[i] = p;
				System.out.println("\nItem adicionado!\n" + prod[i].mostrar());
				break;
			}
		}
	}
	
	public void ListarPedido(){
		for(Produto p: prod){
			if(p != null){
				System.out.println(p.mostrar() + "\n");	
			}
		}
		
	}
	
	public double calcularValor(){
		double totalPedido = 0.0;
		for(Produto p: prod){
			if(p!= null){
				totalPedido+=p.getPreço();
			}
		}
		return totalPedido;
	}
}
