// Gerente é um Funcionario, Gerente herda da classe Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private ValidandoAutenticavel validando;

	public Gerente() {

		this.validando = new ValidandoAutenticavel();

	}

	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return getSalario();
		/*
		 * O super esta substituindo o this nesse metodo pq o salario e o getbonificação
		 * estão na classe mãe e o super faz olhar para a classe mãe onde foi armazenado
		 * esses dados, por isso estamos usando o super ñ o this aqui. obrigado a
		 * utilizar o super pois os dados estão definidos na classe mãe
		 */
	}

	public void setSenha(int senha) {
		this.validando.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.validando.autentica(senha);
	}

}