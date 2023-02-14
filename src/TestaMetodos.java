
public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta contaDarlan = new Conta();
		contaDarlan.saldo = 1000;
		contaDarlan.deposita(300);
		System.out.println(contaDarlan.saldo);
		
		boolean conseguiuSacar = contaDarlan.saca(400);
		System.out.println("Valor atualizada é de: " + contaDarlan.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaJanaina = new Conta();
		contaJanaina.saldo = 2000;;
		
		if(contaJanaina.transfere(1500, contaDarlan)) {
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo janaina " + contaJanaina.saldo);
			System.out.println("saldo Darlan " + contaDarlan.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
		


	}
	
}
