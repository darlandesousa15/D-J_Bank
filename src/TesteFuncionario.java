
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario beto = new EditorVideo();
		
		beto.setSalario(6800);
		beto.setCpf("111.111.222-32");
		beto.setNome("Beto Salamandra");
		
		System.out.println(beto.getNome());
		System.out.println(beto.getSalario());
		System.out.println("CPF: " + beto.getCpf());
		System.out.println("Bonificação do mês: " + beto.getBonificacao());
		System.out.println("Salaraio com bonitifação: " + (beto.getSalario() + beto.getBonificacao()));

		
	}
	
}
