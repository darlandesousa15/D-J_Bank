package darlan.com.br;

import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matruculaParaAluno = new HashMap<>();
	// Dado uma matricua me de um aluno

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

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matruculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
		// contains como o nome diz verificar dentro da lista se o elemento x está la
	}

	public Aluno buscaMatriculado(int numero) {
		return matruculaParaAluno.get(numero);
		
	}


}
