public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		Conta brabo = new ContaCorrente(2252, 9871);

		brabo.deposita(200);

		ContaCorrente darlan = new ContaCorrente(2151, 9874);

		darlan.deposita(800);
		darlan.transfere(200, brabo);

	}

}
