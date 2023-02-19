
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(2052, 5251);
		System.out.println("Agencia: " + cc.getAgencia() + " Conta: " + cc.getNumero());
		cc.deposita(800);
		
		
		ContaPoupança cp = new ContaPoupança(2052, 5252);
		System.out.println("Agencia: " + cp.getAgencia() + " Conta: " + cp.getNumero());
		cp.deposita(900);
		
		
		System.out.println(Conta.getTotal());
		
		System.out.println("Valor anterior CC: " + cc.getSaldo());
		System.out.println("Valor anterior CP: " + cp.getSaldo());
		cc.transfere(100, cp);
		System.out.println("Valor atual CC: " + cc.getSaldo());
		System.out.println("Valor atual CP:" + cp.getSaldo());
		
	}

}
