package darlan.com.br;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("João Mariano", 589741);
		Aluno a2 = new Aluno("Eloá da Silva", 829453);
		Aluno a3 = new Aluno("Mauricio Auves", 528467);
		Aluno a4 = new Aluno("Mauro Auves", 528967);
		Aluno a5 = new Aluno("Joana dos Santos", 513467);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);

		System.out.println("Todos os alunos matriculados: ");

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		System.out.println("o aluno: " + a1 + " Está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno joao = new Aluno("João Mariano", 589741);
		System.out.println("a1 equals ao joao ?");
		System.out.println(a1.equals(joao));

	}

}
