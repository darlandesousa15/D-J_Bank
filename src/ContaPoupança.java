
public class ContaPoupança extends Conta{

	public ContaPoupança (int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita (double valor) {
		super.saldo += valor;
	}

}
