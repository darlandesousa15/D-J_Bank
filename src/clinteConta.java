
public class clinteConta {

	public static void main(String[] args) {
		
		Cliente darlan = new Cliente();
		darlan.nome = "Darlan de Sousa";
		darlan.cpf = "000.000.000-00";
		darlan.profissao = "Programador";
		
		Conta contaDoDarlan = new Conta();
		contaDoDarlan.deposita(4000);
		

		System.out.println(darlan.nome);
		System.out.println(contaDoDarlan.getSaldo());
		contaDoDarlan.titular = darlan;
		System.out.println(contaDoDarlan.titular.nome);
		
	}
}
