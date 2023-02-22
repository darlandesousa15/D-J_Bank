// Gerente é um Funcionario, Gerente herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	public Gerente() {

	}

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return getSalario();
		// O super esta substituindo o this nesse metodo pq o salario e o getbonificação
		// estão na classe mãe
		// e o super faz olhar para a classe mãe onde foi armazenado esses dados, por
		// isso estamos usando o super ñ o this aqui.
		// obrigado a utilizar o super pois os dados estão definidos na classe mãe
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

}