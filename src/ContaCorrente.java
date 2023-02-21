
public class ContaCorrente extends Conta {

	// Quando criamos uma classe filha ela não usa o construtor da classe mãe

	// Para usramos um construtor especifio precisamos determinar os mesmos
	// parametros do construtor especificos e colocar-los dentro
	// do super()
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double ValoraSacar = valor + 0.2;
		// Taxa de cobrança de 0,20 por saque
		return super.saca(ValoraSacar);
	}
	
	public void deposita (double valor) {
		super.saldo += valor;
	}

}
