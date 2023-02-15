
public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(500);
		System.out.println("Saldo é de: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(100);
		System.out.println("Saldo é de: " + segundaConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmas contas");
		}
	}
	
}
