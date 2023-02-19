
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando metodo do Editor de Video");
		return super.getBonificacao() + 100;
	
	}
}