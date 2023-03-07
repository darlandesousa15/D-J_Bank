import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String cliente1 = "Adicionando o primeiro cliente";
		String cliente2 = "Cliente 2 é aquele cara das antigas";
		String cliente3 = "Adicionando aquele cliente camarada";

		ArrayList<String> cliente = new ArrayList<>();
		// cria a array list capturando a String, mas só adicionando as que foram
		// adicionadas abaixo
		cliente.add(cliente1);
		cliente.add(cliente2);
		cliente.add(cliente3);

		 //for (int i = 0; i<= cliente.size(); i++) { System.out.println("Cliente: " +
		 //cliente.get(i)); }
		 
		System.out.println(cliente + " Antes");
		Collections.sort(cliente);
		// o Collections.sort(); faz com que ordene a classe em ordem alfabética
		System.out.println(cliente + " Depois");
		
		ContaCorrente ketlen = new ContaCorrente(2050, 3060);
		ContaCorrente diego = new ContaCorrente(2060, 6451);
		ContaCorrente darlan = new ContaCorrente(2060, 9878);
		
		Cliente didi = new Cliente("cliente3", 27);
		
		ketlen.deposita(500);
		ketlen.setTitular("Ketlen da Silva");
		diego.deposita(1000);
		diego.setTitular("Diego de Souza");
		darlan.deposita(2250);
		darlan.setTitular("Darlan de Sousa");
		
		System.out.println("Saldo do(a) " + ketlen.getTitular() + ": " + ketlen.getSaldo());
		System.out.println("Saldo do(a) " + diego.getTitular() + ": " + diego.getSaldo());
		System.out.println("Saldo do(a) " + darlan.getTitular() + ": " + darlan.getSaldo());
	}
}
