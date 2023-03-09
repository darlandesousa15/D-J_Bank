package darlan.com.br;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColec = new Curso("Dominando coleções java", "Pedro Caieno");
		
		javaColec.adiciona(new Aula("Definindo funções", 20));
		//javaColec.getAulas().add(new Aula("Definindo funções", 20));
		/*
		String curso1 = "Definindo funções";
		String curso2 = "Resolução de problemas orientado ao objeto";
		String curso3 = "Design Thinking";
		
		ArrayList<String> curso = new ArrayList<>();
		
		curso.add(curso1);
		curso.add(curso2);
		curso.add(curso3);
		
		System.out.println("Antes " + curso);
		Collections.sort(curso);
		System.out.println("Depois " + curso);
		*/
		System.out.println(javaColec.getAulas());


	}

}
