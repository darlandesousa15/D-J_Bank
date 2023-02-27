public class TesteContas2 {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(2252, 9871);

		conta.deposita(200);

		try {
			// o uso do try e catch é para qem vai usar esse methodo
			conta.saca(220);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Menssagem da exceção " + ex.getMessage());
		}

		System.out.println(conta.getSaldo());
		

	}

}
