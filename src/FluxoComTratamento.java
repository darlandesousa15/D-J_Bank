
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
			try {
	    // o try aponta onde esta o código perigoso onde pode ter o erro
			metodo1();
        } catch (ArithmeticException ex) {
        // o catch captura o possível codigo perigoso e ao final noromalmente sempre usa o ex
        	System.out.println("ArithmeticException");
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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            	int a = i / 0;
            
        }
        System.out.println("Fim do metodo2");
    }
}