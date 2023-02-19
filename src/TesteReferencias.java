
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente ();
		g.setNome("Darlan de Sousa");
		System.out.println(g.getNome());
		g.setSalario(5000);

		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo e = new EditorVideo();
		e.setSalario(2500);
		
		ControleBonificacao c = new ControleBonificacao();
		c.registro(g);
		c.registro(f);
		c.registro(e);
		
		System.out.println(c.getSoma());
	}

}
