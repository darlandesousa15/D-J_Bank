
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(2052, 5251);
		System.out.println("Agencia: " + cc.getAgencia() + " Conta: " + cc.getNumero());
		cc.deposita(200.21);
		
		
		ContaPoupança cp = new ContaPoupança(2072, 5852);
		System.out.println("Agencia: " + cp.getAgencia() + " Conta: " + cp.getNumero());
		cp.deposita(100);
		
		
		System.out.println("Total de contas criadas são: " + Conta.getTotal());
		
		System.out.println("Valor anterior CC: " + cc.getSaldo());
		System.out.println("Valor anterior CP: " + cp.getSaldo());
		cc.transfere(100, cp);
		System.out.println("Valor atual CC: " + cc.getSaldo());
		System.out.println("Valor atual CP:" + cp.getSaldo());
		
		SeguroVida seg = new SeguroVida();
		CalculadorImposto cal = new CalculadorImposto();
		cal.registra(cc);
		cal.registra(seg);
		
		System.out.println(cc.saldo - cal.getTotalImposto());
		
	}

}
