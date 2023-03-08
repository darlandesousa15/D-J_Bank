package darlan.com.br;

import java.util.ArrayList;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + "minutos]";
	}
	@Override
	public int compareTo(Aula o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
