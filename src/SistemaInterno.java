
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("deu certo");
		}else {
			System.out.println("Não deu certo");
		}
	}
}
