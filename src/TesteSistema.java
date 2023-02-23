
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente d = new Gerente();
		d.setSenha(2222);
		d.setNome("Beltranho");
		System.out.println(d.getNome());

		Administrador fulano = new Administrador();
		fulano.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(d);
		si.autentica(fulano);
		
		

	}

}
