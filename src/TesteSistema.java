
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente beltranho = new Gerente();
		beltranho.setSenha(2222);
		beltranho.setNome("Beltranho");
		System.out.println(beltranho.getNome());

		Administrador fulano = new Administrador();
		fulano.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(beltranho);
		si.autentica(fulano);

	}

}
