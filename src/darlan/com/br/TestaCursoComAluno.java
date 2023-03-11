package darlan.com.br;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		aluno a1 = new aluno("João Mariano", 589741);
		aluno a2 = new aluno("Eloá da Silva", 829453);
		aluno a3 = new aluno("Mauricio Auves", 528467);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		
		
		System.out.println(a1.getNome());
	}
	
}
