package darlan.com.br;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal()
				+ ", aulas: + " + this.aulas + "]";
	}

	public void matricula(aluno aluno) {
		this.alunos.add(aluno);
		
	}
	
	public Set<aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	public boolean estaMatriculado(aluno aluno) {
		return this.alunos.contains(aluno);
		// contains como o nome diz verificar dentro da lista se o elemento x está la
	}


}
