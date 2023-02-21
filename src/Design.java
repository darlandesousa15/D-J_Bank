
public class Design extends Funcionario {
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		System.out.println("Chamando o metodo Design");
		return super.getBonificacao() + 100;
	}

}
