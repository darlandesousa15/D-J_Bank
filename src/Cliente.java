public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String profissao;
	private ValidandoAutenticavel validando;
	private int idade;

	public Cliente() {

		this.validando = new ValidandoAutenticavel();

	}

	public void setSenha(int senha) {
		this.validando.setSenha(senha);
		// esse método esta delegando uma chamada para a classe validando.
	}

	public boolean autentica(int senha) {
		return this.validando.autentica(senha);
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	

	
	

}
