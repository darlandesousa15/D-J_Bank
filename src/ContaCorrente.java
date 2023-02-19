
public class ContaCorrente extends Conta {

	// Quando criamos uma classe filha ela não usa o construtor da classe mãe

	// Para usramos um construtor especifio precisamos determinar os mesmos
	// parametros do construtor especificos e colocar-los dentro
	// do super()
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

}
