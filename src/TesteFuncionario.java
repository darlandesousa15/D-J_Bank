
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario beto = new Funcionario();
		
		beto.setSalario(5000.12);
		beto.setCpf("111.111.222-32");
		beto.setNome("Beto Salamandra");
		
		System.out.println(beto.getBonificacao());
		
	}
	
}
