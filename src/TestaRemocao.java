import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM tbcliente WHERE ID > 3");
		
		int linhasmodificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas excluidas: " + linhasmodificadas);
		
	}

}
