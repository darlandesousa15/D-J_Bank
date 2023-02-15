public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.deposita(4000);
		System.out.println("Saldo da 1ª conta " + primeiraConta.pegaSaldo());
		// System.out.println(primeiraConta.agencia);
		// System.out.println(primeiraConta.numero);

		Conta segundaConta = new Conta();
		segundaConta.deposita(4000);
		System.out.println("Saldo da 2ª conta " + segundaConta.pegaSaldo());

		if (primeiraConta.pegaSaldo() == segundaConta.pegaSaldo()) {
			System.out.println("Valor dos saldos das consta são iguais");
		} else {
			System.out.println("Valores diferentes");
		}

		if (primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
