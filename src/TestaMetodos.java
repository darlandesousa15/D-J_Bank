
public class TestaMetodos {

	public static void main(String[] args) {

		Conta contaDarlan = new Conta();
		contaDarlan.deposita(1000);
		contaDarlan.deposita(300);
		System.out.println(contaDarlan.pegaSaldo());

		contaDarlan.titular = new Cliente();
		contaDarlan.titular.nome = "Darlan de Sousa";
		System.out.println(contaDarlan.titular.nome);
		
		boolean conseguiuSacar = contaDarlan.saca(400);
		System.out.println("Valor atualizada é de: " + contaDarlan.pegaSaldo());
		System.out.println(conseguiuSacar);

		Conta contaJanaina = new Conta();
		contaJanaina.deposita (2000);
		boolean tranferindo = contaJanaina.transfere(1000, contaDarlan);
		if (tranferindo) {
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo " + contaJanaina.titular + " " + contaJanaina.pegaSaldo());
			System.out.println("saldo Darlan " + contaDarlan.pegaSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

}
