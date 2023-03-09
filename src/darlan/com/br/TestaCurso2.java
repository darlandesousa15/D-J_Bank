package darlan.com.br;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColec = new Curso("Dominando coleções java", "Pedro Caieno");

		javaColec.adiciona(new Aula("Definindo funções", 20));
		javaColec.adiciona(new Aula("Utilizando Polimorfismo e heranças", 27));
		javaColec.adiciona(new Aula("Estruturando e Modelando coleções", 22));

		// System.out.println(javaColec.getAulas());

		List<Aula> aulasImutaveis = javaColec.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);

	}

}
