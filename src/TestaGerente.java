
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente d1 = new Gerente();
		d1.setCpf("000.555.777-92");
		d1.setNome("Marculino Afonso");
		d1.setSalario(5500);
	
		System.out.println(d1.getNome());
		System.out.println(d1.getCpf());
		System.out.println(d1.getSalario());
		
		d1.setSenha(2222);
		

		// ambos as duas estão certas para o mesmo resultado, entretando o de cima precisa de duas linhas
		System.out.println(d1.autentica(2223));
		
	}
	
}
