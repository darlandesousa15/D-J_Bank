import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		String nome = "";
		String endereco = "";
		String datanascimento = "";
		String profissao = "";
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("INSERT INTO tbcliente (nome, endereco, datanascimento, profissao)"
				+ "VALUES(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		//Quando executar a inserção no banco de dados ele vai mostar o ID que foi gerado
		stm.setString(1, nome);
		stm.setString(2, endereco);
		stm.setString(3, datanascimento);
		stm.setString(4, profissao);
		
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		//Esse resultset é para trazer o resultado ou seja o numero da id
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O cliente adicionado foi o " + id);
			System.out.println("Exibir teste");
		}
			System.out.println("Exibir teste");
	}

}
