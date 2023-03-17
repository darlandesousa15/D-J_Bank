package darlan.com.br;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Obrigatório a defenir um nome");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;

	}
	
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	//Ao utilizar o equals para poder verificar se esse objeto é o mesmo objeto q estou procurando obrigatorio utilizar o hashcode tbm
	//e como retorno do hashcode podemos usar o .hashcode que fica melhor para fazer a pesquisa internamente
	public int hashCode() {
		return super.hashCode();
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	

	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.getNumeroMatricula() + "]";
	}



}
