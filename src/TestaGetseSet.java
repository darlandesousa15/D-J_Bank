
public class TestaGetseSet {

	public static void main(String[] args) {
		Conta conta = new Conta(9584, 5241);
		conta.deposita(200);
		conta.setNumero(5241);
		System.out.println("Conta: " + conta.getNumero());
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("O total de contas é " + Conta.getTotal());
		
		Cliente contaCliente = new Cliente();
		contaCliente.setNome("Darlan de Sousa");
		conta.setTitular(contaCliente);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setNome("Albino");
		System.out.println(conta.getTitular().getNome());
		
	}

}
