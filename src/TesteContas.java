public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(2252, 9871);
		
		conta.deposita(200);
		conta.saca(220);
		
		System.out.println(conta.getSaldo());
		
	}

}
