
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Darlan de Sousa");
		System.out.println(g.getNome());
		g.setSalario(5000);

		Design b1 = new Design();
		b1.setSalario(2500);

		EditorVideo e = new EditorVideo();
		e.setSalario(2500);

		ControleBonificacao c = new ControleBonificacao();
		c.registro(g);
		c.registro(b1);
		c.registro(e);

	}

}
