// Uma classe de interface significa que é um contrato que qualquer outra classe possa assinar usando implements
// Quem assina esse contrato é óbrigado a implementar o setsenha e o autentica pq tudo dentro
// do contrato tem que ser abstrato e não pode ter nada concreto aqui dentro só definições.
public abstract interface Autenticavel {

	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
	}

