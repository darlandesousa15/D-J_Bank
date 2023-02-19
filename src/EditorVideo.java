
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando metodo do Editor");
		return super.getBonificacao() + 100;
	
	}
}