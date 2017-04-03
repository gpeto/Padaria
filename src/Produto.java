
public class Produto {
	String nome;
	private double preço;
	private double quantidade;
    public int cod = 0;
	
	public Produto(String nome, double quantidade, double preço, int cod){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preço = preço;
		this.cod = cod;
	}
	
	public String mostrar(){
		return "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPreço: " + preço + "\nCód: " + cod ;
	}
	

	public double getPreço() {
		return preço;
	}
	
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
