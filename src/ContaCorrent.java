
public class ContaCorrent {
	
	private double limite;
	private double saldo;
	private double valorLimite;
	
	public void depositar (double motante)  {
		
		if(motante < 0 ) {
			throw new IllegalArgumentException("voce informou o valor" + motante + "que é negativo, o que nao é permitido nesta operacao! tente com um valor positivo. ");
		}
		
		saldo += motante;
    }
	
	public void sacar (double motante) throws SaldoInsuficienteExpection {
		
		if(motante < 0 ) {
			throw new IllegalArgumentException("voce informou o valor" + motante + "que é negativo, o que nao é permitido nesta operacao! tente com um valor positivo. ");
		}
		
		if(motante > saldo) {
			throw new SaldoInsuficienteExpection("voce nao tem saldo suficiente, voce tentou sacar"+ motante +"e o seu saldo era" + saldo);
		}
		saldo -= motante;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
