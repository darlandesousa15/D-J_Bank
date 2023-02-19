
public class ControleBonificacao {

	private double soma;
	
	public void registro(Funcionario NomeDoFuncionario) {
		
		double boni = NomeDoFuncionario.getBonificacao();
		this.soma = this.soma + boni;

	}
	
	public double getSoma() {
		return soma;
	}

}
