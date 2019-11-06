package abstratos;

public class PessoaJuridica extends Pessoa {
	private int numeroFuncionarios;
	private final double PORCENTAGEM_IMPOSTO1 = 0.14;
	private final double PORCENTAGEM_IMPOSTO2 = 0.16;
	

	public PessoaJuridica(String nome, double rendaAtual, int numeroFuncionarios) {
		super(nome, rendaAtual);
		this.numeroFuncionarios = numeroFuncionarios;
	}



	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}



	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public double impostoPago() {
		double sum = 0;
		if(getNumeroFuncionarios()<=10) {
			sum = (getRendaAtual()*PORCENTAGEM_IMPOSTO2);
		}
		else {
			sum = (getRendaAtual()*PORCENTAGEM_IMPOSTO1);
		}
		return sum;
	}
}
