
public class TestaMetodos {

	public static void main(String[] args) {

		Conta contaDarlan = new Conta();
		contaDarlan.deposita(1000);
		contaDarlan.deposita(300);
		System.out.println(contaDarlan.getSaldo());

		contaDarlan.titular = new Cliente();
		contaDarlan.titular.nome = "Darlan de Sousa";
		System.out.println(contaDarlan.titular.nome);
		
		boolean conseguiuSacar = contaDarlan.saca(400);
		System.out.println("Valor atualizada é de: " + contaDarlan.getSaldo());
		System.out.println(conseguiuSacar);

		Conta contaJanaina = new Conta();
		contaJanaina.deposita (2000);
		boolean tranferindo = contaJanaina.transfere(1000, contaDarlan);
		if (tranferindo) {
			System.out.println("Saque realizado com sucesso");
			System.out.println("Saldo " + contaJanaina.titular + " " + contaJanaina.getSaldo());
			System.out.println("saldo Darlan " + contaDarlan.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

}
