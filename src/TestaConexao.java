
public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception ex){
			System.out.println("Deu erro");
		}
		/*
		 * Conexao con = null;
		 * 
		 * try { con = new Conexao(); con.leDados(); con.fecha(); } catch (Exception ex)
		 * { System.out.println("Deu erro de conexão");
		 * 
		 * } finally { // esse bloco finally sempre será executado independente do que
		 * aconteça con.fecha(); }
		 */

	}

}
