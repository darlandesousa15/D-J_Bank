
public class ContaCorrente extends Conta implements Tributavel{

	// Quando criamos uma classe filha ela não usa o construtor da classe mãe

	// Para usramos um construtor especifio precisamos determinar os mesmos
	// parametros do construtor especificos e colocar-los dentro
	// do super()
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita (double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double ValoraSacar = valor + 0.2;
		// Taxa de cobrança de 0,20 por saque
		super.saca(ValoraSacar);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	

}
