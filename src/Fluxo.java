
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
			try {
	    // o try aponta onde esta o código perigoso onde pode ter o erro
			metodo1();
		} catch (Exception ex) {
			// o uso do exception aqui faz com que não seja preciso ter que colocar varios excetion ou seja é um genério ja para todos
        // o catch captura o possível codigo perigoso e ao final noromalmente sempre usa o ex
        	System.out.println("ArithmeticException");
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        }
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhasEcxecoes ("teve muitos erro");
        // o throw só funciona com exceções e significa jogar ela
        
        //System.out.println("Fim do metodo2");
    }
}