package darlan.com.br;


public class TestaBuscaAlunos {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		aluno a1 = new aluno("João Mariano", 589741);
		aluno a2 = new aluno("Eloá da Silva", 829453);
		aluno a3 = new aluno("Mauricio Auves", 528467);
		aluno a4 = new aluno("Mauro Auves", 528967);
		aluno a5 = new aluno("Joana dos Santos", 513467);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		
	}

}