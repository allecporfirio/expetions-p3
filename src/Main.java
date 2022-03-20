
public class Main {

	public static void main(String[] args) {
		
		ContaCorrent novaConta = new ContaCorrent();
		
		try {
			novaConta.depositar(-10);
		} catch (Exception e1) {
			System.out.println("Caiu no depositar(100)");
		}
		
		try {
			novaConta.sacar(-100);
		} catch (SaldoInsuficienteExpection e) {
			System.out.println("Motivo do problema: "+ e.getMessage());
		}
		
		}
	}
