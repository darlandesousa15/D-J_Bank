
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Senha correta");
		} else {
			System.out.println("Senha Incorreta");
		}
	}
}
