
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando metodo do ADM");
		// TODO Auto-generated method stub
		return 1000;
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
