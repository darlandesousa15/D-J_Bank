
public class Administrador extends Funcionario implements Autenticavel {

	private ValidandoAutenticavel validando;

	public Administrador() {
		this.validando = new ValidandoAutenticavel();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Chamando metodo do ADM");
		// TODO Auto-generated method stub
		return 1000;
	}

	public void setSenha(int senha) {
		this.validando.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.validando.autentica(senha);
	}

}
