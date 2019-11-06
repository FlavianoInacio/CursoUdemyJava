package abstratos;

public abstract class Pessoa {

	private String nome;
	private double rendaAtual;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAtual() {
		return rendaAtual;
	}

	public void setRendaAtual(double rendaAtual) {
		this.rendaAtual = rendaAtual;
	}

	public Pessoa(String nome, double rendaAtual) {
		super();
		this.nome = nome;
		this.rendaAtual = rendaAtual;
	}

	public abstract double impostoPago();

	@Override
	public String toString() {
		return nome  + ": $ "+ String.format("%.2f", impostoPago());
	}
	
	
}
