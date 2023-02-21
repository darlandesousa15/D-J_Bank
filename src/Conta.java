public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// static é para indicar que é da classe não do objeto, stati é um atributo da classe
	// Atributo são caracteristicas que especificam uma classe
	// Os atributos ou campos propiedades são as caracteristicas de um objeto, tudo
	// aqui dentro são atributos
	// Um construtor padrão seria Public Conta(){}

	// Esse abaixo é o construtor especifico dessa classe
	public Conta (int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		if (numero <= 0 || agencia <= 0) {
			System.out.println("O número da conta e agencia não pode ser negativa. Altere para positivos");
		}
		System.out.println("Criando conta");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	// Isso é um methodo e que ao ser envocado obigatoriamente tem que usar os ()
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O número da conta não pode ser negativa.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("A Agêcia não pode ser negativa.");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}