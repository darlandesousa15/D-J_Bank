public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 4000;
		System.out.println(primeiraConta.saldo);
		System.out.println("Saldo da 1ª conta " + primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 2000;
		System.out.println(segundaConta.saldo);
		System.out.println("Saldo da 2ª conta " + segundaConta.saldo);
		
	}
}
