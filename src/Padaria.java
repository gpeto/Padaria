
public class Padaria {
	static int cod = 0;

	public static void main(String[] args) {
		
		Pedido ped = new Pedido();
		ped.iniciar(3);
		Produto p1 = new Produto("Pão Carioca", 5, 4.00, cod++);
		ped.adicionarProduto(p1);
		
		Produto p2 = new Produto("Mortandela", 1, 2.99, cod++);
		ped.adicionarProduto(p2);
		System.out.println("O valor total do pedido é: " + ped.calcularValor());
		//ped.ListarPedido();
	}

}
