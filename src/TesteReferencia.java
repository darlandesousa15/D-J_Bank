
public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		System.out.println("Saldo é de: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 100;
		System.out.println("Saldo é de: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmas contas");
		}
	}
	
}
