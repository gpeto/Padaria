
public class Produto {
	String nome;
	private double pre�o;
	private double quantidade;
    public int cod = 0;
	
	public Produto(String nome, double quantidade, double pre�o, int cod){
		this.nome = nome;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.cod = cod;
	}
	
	public String mostrar(){
		return "Nome: " + nome + "\nQuantidade: " + quantidade + "\nPre�o: " + pre�o + "\nC�d: " + cod ;
	}
	

	public double getPre�o() {
		return pre�o;
	}
	
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
