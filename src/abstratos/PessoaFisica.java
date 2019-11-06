package abstratos;

public class PessoaFisica extends Pessoa {
	private double gastoSaude;
	private final double PORCENTAGEM_IMPOSTO1 = 0.15;
	private final double PORCENTAGEM_IMPOSTO2 = 0.25;
	private final double IMPOSTO_GASTO_SAUDE = 0.50;

	public PessoaFisica(String nome, double rendaAtual, double gastoSaude) {
		super(nome, rendaAtual);
		this.gastoSaude = gastoSaude;
	}


	public double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double impostoPago() {
		double sum = 0;
		if(getRendaAtual()<2000) {
			sum = (getRendaAtual()*PORCENTAGEM_IMPOSTO1)-(getGastoSaude()*IMPOSTO_GASTO_SAUDE);
		}
		else {
			sum = (getRendaAtual()*PORCENTAGEM_IMPOSTO2)-(getGastoSaude()*IMPOSTO_GASTO_SAUDE);
		}
		return sum;
	}
	

}
