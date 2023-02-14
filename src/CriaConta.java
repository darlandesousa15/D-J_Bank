public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 4000;
		System.out.println("Saldo da 1ª conta " + primeiraConta.saldo);
		// System.out.println(primeiraConta.agencia);
		// System.out.println(primeiraConta.numero);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 4000;
		System.out.println("Saldo da 2ª conta " + segundaConta.saldo);

		if (primeiraConta.saldo == segundaConta.saldo) {
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
