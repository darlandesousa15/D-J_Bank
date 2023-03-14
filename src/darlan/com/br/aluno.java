package darlan.com.br;

public class aluno {

	private String nome;
	private int numeroMatricula;

	public aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;

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
