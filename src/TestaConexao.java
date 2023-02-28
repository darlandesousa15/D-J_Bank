
public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception ex) {
			System.out.println("Deu erro");
		}
		// Esse de cima é o mesmo de baixo mas da maneira atualizada e mais facil de
		// escrever e entender

		// -----------------------------------------------------------------------------------

		/*
		 * Conexao con = null;
		 * 
		 * try { con = new Conexao(); con.leDados(); con.fecha(); } catch (Exception ex)
		 * { System.out.println("Deu erro de conexão");
		 * 
		 * } finally { // esse bloco finally sempre será executado independente do que
		 * aconteça con.fecha(); }
		 */ 
		
		ContaCorrente dd = new ContaCorrente(-9000, 5000);
		dd.deposita(500);
		
	}

}
