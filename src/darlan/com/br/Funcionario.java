package darlan.com.br;

import java.util.Set;
import java.util.TreeSet;

public class Funcionario {

    private String nome;
    private int idade;
    private Set<Funcionario> funcionario = new TreeSet<>();

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    } 

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}