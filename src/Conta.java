public class Conta {

	private double saldo;
	private double salario;
	int agencia;
	int numero;
	Cliente titular;
	// Atributo são caracteristicas que especificam uma classe
	// Os atributos ou campos propiedades são as caracteristicas de um objeto, tudo
	// aqui dentro são atributos

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
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	//Isso é um methodo e que ao ser envocado obigatoriamente tem que usar os ()
	public double getSaldo() {
		return this.saldo;
	}
	
}