public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	// Ao utilizar o protected faz com que o atributo seja public para as classes filhas, somente elas.

	
	// esse public funcionario é um construtor que caso eu ñ crie ele é criado automaticamente mas ñ mostrado aqui
	public Funcionario() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo do Funcionario");
		return this.salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
